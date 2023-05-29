package io.codelex.oop.computers;

public class Main {
    public static void main(String[] args) {
        Computer computer1 = new Computer("intel i7", "16GB", "GamingGC", "AlienWare", "GamingNimbus3000");
        Computer computer2 = new Computer("intel i5", "8GB", "TTX 2323", "Asus", "StudyBuddy5000v2");
        System.out.println(computer1);
        System.out.println(computer2);


        Laptop laptop1 = new Laptop("intel i3", "32GB", "XXDD76", "Lenovo", "ThinkPad262", 10000);
        Laptop laptop2 = new Laptop("mac 10.1.5", "64GB", "iCard X27YZ", "Apple", "Macbook Pro 5", 15000);
        System.out.println(laptop1);
        System.out.println(laptop2);
    }
}
