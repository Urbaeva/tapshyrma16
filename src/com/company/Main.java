package com.company;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Shark shark = new Shark();
        Eagle eagle = new Eagle();
        Turtle turtle = new Turtle();

        Animal[] animals = {animal, shark, eagle, turtle};

        for (Animal i: animals) {
            if (i.getClass().getSimpleName().equals("Animal"))
                i.animalMethod();
            else if (i instanceof Eagle)
                ((Eagle)i).fly();
            else if (i instanceof Shark)
                ((Shark)i).attack();
            else if (i instanceof Turtle)
                ((Turtle)i).swim();
        }
    }
}
