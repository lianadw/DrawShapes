/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Liana Dewi
 */
 // Class induk (Super Class)
public class Animal {
    public void makeNoise() {
        System.out.println("Talk");
    }
}

class Dog extends Animal {
    public void makeNoise() {
        System.out.println("Bark");
    }
}

class Main {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.makeNoise();  // Output: Talk

        Dog dog = new Dog();
        dog.makeNoise();  // Output: Bark

        Animal animaldog = new Dog();
        animaldog.makeNoise();  // Output: Bark (Polimorfisme)

        if (animal instanceof Animal)
            System.out.println("animal is Animal");

        if (dog instanceof Animal)
            System.out.println("dog is Animal");

        if (animaldog instanceof Animal)
            System.out.println("animaldog is Animal");

        if (animal instanceof Dog)
            System.out.println("animal is Dog"); // Tidak akan dieksekusi karena `animal` bukan `Dog`
    }
}
