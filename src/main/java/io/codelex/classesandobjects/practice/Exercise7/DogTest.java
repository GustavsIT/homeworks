package io.codelex.classesandobjects.practice.Exercise7;

public class DogTest {
    public static void main(String[] args) {
        Dog lady = new Dog("Lady", "female");
        Dog sparky = new Dog("Sparky", "male");
        Dog molly = new Dog("Molly", "female");
        Dog sam = new Dog("Sam", "male");

        System.out.println(lady);
        System.out.println(sparky);
        System.out.println(molly);
        System.out.println(sam);


        Dog buster = new Dog("Buster", "male", lady, sparky);
        Dog coco = new Dog("Coco", "female", molly, buster);
        Dog rocky = new Dog("Rocky", "male", molly, sam);
        Dog max = new Dog("Max", "male", lady, rocky);

        System.out.println(buster);
        System.out.println(coco);
        System.out.println(rocky);
        System.out.println(max);

        System.out.println("Fathers name for Coco: " + coco.fathersName());
        System.out.println("Fathers name for Sparky: " + sparky.fathersName());

        System.out.println("Coco and Rocky have the same mother: " + coco.hasSameMother(rocky));
    }
}
