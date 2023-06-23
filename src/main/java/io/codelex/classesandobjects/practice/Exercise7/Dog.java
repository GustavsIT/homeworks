package io.codelex.classesandobjects.practice.Exercise7;

public class Dog {
    private String name;
    private String sex;
    private Dog mother;
    private Dog father;

    public Dog(String name, String sex) {
        this.name = name;
        this.sex = sex;
    }

    public Dog(String name, String sex, Dog mother, Dog father) {
        this.name = name;
        this.sex = sex;
        this.mother = mother;
        this.father = father;
    }

    public String getName() {
        return name;
    }

    public String getSex() {
        return sex;
    }

    public Dog getMother() {
        return mother;
    }

    public Dog getFather() {
        return father;
    }

    public String fathersName() {
        if (father != null) {
            return father.getName();
        } else {
            return "Unknown";
        }
    }

    public boolean hasSameMother(Dog diffDog) {
        if (mother != null && diffDog.getMother() != null) {
            return mother.getName().equals(diffDog.getMother().getName());
        }
        return false;
    }


    @Override
    public String toString() {
        String motherName = (mother != null) ? mother.getName() : "Unknown";
        String fatherName = (father != null) ? father.getName() : "Unknown";

        return "Dog{" +
                "name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", mother='" + motherName + '\'' +
                ", father='" + fatherName + '\'' +
                '}';
    }
}
