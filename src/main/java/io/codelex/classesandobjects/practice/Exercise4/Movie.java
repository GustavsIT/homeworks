package io.codelex.classesandobjects.practice.Exercise4;

class Movie {
    String title;
    private String studio;
    private String rating;

    public Movie(String title, String studio, String rating) {
        this.title = title;
        this.studio = studio;
        this.rating = rating;
    }

    public Movie(String title, String studio) {
        this.title = title;
        this.studio = studio;
        this.rating = "PG";
    }

    public static Movie[] getPG(Movie[] movies) {
        int count = 0;
        for (Movie movie : movies) {
            if (movie.rating.equals("PG-13")) {
                count++;
            }
        }

        Movie[] pgMovies = new Movie[count];
        int index = 0;
        for (Movie movie : movies) {
            if (movie.rating.equals("PG-13")) {
                pgMovies[index] = movie;
                index++;
            }
        }

        return pgMovies;
    }
}