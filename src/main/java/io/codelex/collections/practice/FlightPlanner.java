package io.codelex.collections.practice;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

public class FlightPlanner {
    private static final Charset charset = Charset.defaultCharset();
    private static final String file = "/collections/flights.txt";
    private static Map<String, List<String>> flights;

    public static void main(String[] args) throws IOException, URISyntaxException {
        final Path path = Paths.get(Histogram.class.getResource(file).toURI());
        Files.readAllLines(path, charset);
        List<String> flightLines = Files.readAllLines(path, charset);
        flights = parseFlights(flightLines);
        System.out.println("What would you like to do:");
        System.out.println("To display list of the cities press 1");
        System.out.println("To exit program press #");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        if (input.equals("1")) {
            displayCities();
            selectStartingCity(scanner);
        }
    }

    private static Map<String, List<String>> parseFlights(List<String> flightLines) {
        Map<String, List<String>> flights = new HashMap<>();
        for (String line : flightLines) {
            String[] parts = line.split(" -> ");
            String origin = parts[0];
            String destination = parts[1];
            if (!flights.containsKey(origin)) {
                List<String> destinations = new ArrayList<>();
                destinations.add(destination);
                flights.put(origin, destinations);
            } else {
                List<String> destinations = flights.get(origin);
                destinations.add(destination);
            }
        }
        return flights;
    }

    private static void displayCities() {
        System.out.println("List of cities:");
        int index = 1;
        for (String city : flights.keySet()) {
            System.out.println(index + ". " + city);
            index++;
        }
    }

    private static void selectStartingCity(Scanner scanner) {
        System.out.println("To select a city from which you would like to start, enter the corresponding number:");
        int selectedCityIndex = scanner.nextInt();
        List<String> cities = new ArrayList<>(flights.keySet());
        if (selectedCityIndex >= 1 && selectedCityIndex <= cities.size()) {
            String startingCity = cities.get(selectedCityIndex - 1);
            System.out.println("Starting city: " + startingCity);
            List<String> route = new ArrayList<>(); // Initialize the route list
            route.add(startingCity); // Add the starting city to the route
            traverseFlightPaths(startingCity, route);
        } else {
            System.out.println("Invalid input. Exiting the program.");
        }
    }

    private static void traverseFlightPaths(String currentCity, List<String> route) {
        List<String> destinations = flights.get(currentCity);
        if (destinations != null && !destinations.isEmpty()) {
            System.out.println("Destinations from " + currentCity + ":");
            int index = 1;
            for (String destination : destinations) {
                System.out.println(index + ". " + destination);
                index++;
            }
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter the number of the city you want to fly to:");
            int selectedDestinationIndex = scanner.nextInt();
            if (selectedDestinationIndex >= 1 && selectedDestinationIndex <= destinations.size()) {
                String selectedDestination = destinations.get(selectedDestinationIndex - 1);
                System.out.println("Flying from " + currentCity + " to " + selectedDestination);
                if (selectedDestination.equals(route.get(0))) {
                    System.out.println("Round-trip route selected. Exiting the program.");
                    route.add(selectedDestination);
                    printRoute(route);
                } else {
                    route.add(selectedDestination);
                    traverseFlightPaths(selectedDestination, route);
                }
            } else {
                System.out.println("Invalid input. Exiting the program.");
            }
        } else {
            System.out.println("No destinations available from " + currentCity);
        }
    }

    private static void printRoute(List<String> route) {
        System.out.println("Route:");
        for (String city : route) {
            System.out.println(city);
        }
    }
}
