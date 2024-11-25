package main.java.by.rymtsov.lesson15;

import main.java.by.rymtsov.lesson15.collection.CollectionOperations;
import main.java.by.rymtsov.lesson15.figure.Figure;
import main.java.by.rymtsov.lesson15.people.Human;

import java.util.HashSet;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

/**
 * This is the application runner class.
 * Tasks:
 * Task 1
 * Create a collection of integers and fill it with values ​​entered from the console.
 * When filling the collection with numbers from the console, you should do type casts.
 * To finish entering, enter the word "exit".
 * When casting a string to a number, you should take into account the possibility of exceptions.
 * Display even numbers from the collection on the screen.
 * Task 2
 * Create a collection of shapes.
 * (take the classes for shapes from previous homework)
 * Fill the collection with different shapes.
 * Loop through the collection and call the method to calculate and display the perimeter of each shape.
 * Task 3
 * Create a collection of integers.
 * Fill the collection with random numbers.
 * Let the collection size be specified from the console.
 * Provide a check for the validity of the entered collection size.
 * Calculate and display the arithmetic mean of all elements in the collection.
 * Task 4
 * Create a collection of unique names of all students in our group + the teacher.
 * Display the collection on the screen.
 */

public class Runner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> list = CollectionOperations.createListOfIntegersFromConsole();
        CollectionOperations.outputCollection(list);

        List<Figure> figures = CollectionOperations.createListOfFigures();
        CollectionOperations.outputPerimeters(figures);

        System.out.print("Input the size of list: ");
        int size = sc.nextInt();
        try {
            if (size <= 0) {
                throw new InputMismatchException("Size must be greater than 0!");
            }
            List<Integer> randomIntegers = CollectionOperations.createListOfRandomIntegers(size);
            CollectionOperations.outputCollection(randomIntegers);
            System.out.println("Arithmetic mean of your list = " +
                    CollectionOperations.calculateArithmeticMean(randomIntegers));
        }
        catch (InputMismatchException e) {
            System.out.println(e.getMessage());
        }

        HashSet<Human> people = CollectionOperations.createSetOfPeopleInOurGroup();
        CollectionOperations.outputCollection(people);
    }
}
