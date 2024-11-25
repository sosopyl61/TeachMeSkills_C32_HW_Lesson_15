package main.java.by.rymtsov.lesson15.collection;

import main.java.by.rymtsov.lesson15.figure.Circle;
import main.java.by.rymtsov.lesson15.figure.Figure;
import main.java.by.rymtsov.lesson15.figure.Rectangle;
import main.java.by.rymtsov.lesson15.figure.Triangle;
import main.java.by.rymtsov.lesson15.people.Human;

import java.util.*;

/**
 * This class contains methods with
 * different actions with collections,
 * such as creating the list or set
 * or output the collection on the screen.
 */

public class CollectionOperations {

    public static ArrayList<Integer> createListOfIntegersFromConsole() {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        String input;
        System.out.print("Enter the numbers: ");
        while (true) {
            input = sc.nextLine();
            if (input.equals("exit")) {
                return list;
            }
            else {
                try {
                    list.add(Integer.parseInt(input));
                }
                catch (NumberFormatException e) {
                    System.out.println("'" + input + "'" + " is not a number.");
                }
            }
        }
    }

    public static ArrayList<Integer> createListOfRandomIntegers(int size) {
        ArrayList<Integer> list = new ArrayList<>(size);
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            list.add(random.nextInt(100));
        }
        return list;
    }

    public static ArrayList<Figure> createListOfFigures() {
        ArrayList<Figure> figures = new ArrayList<>();
        figures.add(new Circle(3));
        figures.add(new Rectangle(5, 6));
        figures.add(new Triangle(3, 4, 5));
        figures.add(new Circle(7));
        return figures;
    }

    public static HashSet<Human> createSetOfPeopleInOurGroup() {
        HashSet<Human> people = new HashSet<>();
        people.add(new Human("Andrew"));
        people.add(new Human("Vlad"));
        people.add(new Human("Ilya"));
        people.add(new Human("Dmitry"));
        people.add(new Human("Sergey"));
        people.add(new Human("Kate"));
        people.add(new Human("Oleg"));
        people.add(new Human("Kirill"));
        people.add(new Human("Rita"));
        people.add(new Human("Dmitry"));
        people.add(new Human("Igor"));
        people.add(new Human("Marina"));
        people.add(new Human("Daniil"));
        people.add(new Human("Sultan"));
        people.add(new Human("Kirill"));
        people.add(new Human("Bogdan"));
        return people;
    }

    public static void outputCollection(Collection<?> collection) {
        System.out.println("Your collection is " + Arrays.toString(collection.toArray()));
    }

    public static void outputPerimeters(List<Figure> figures) {
        for (Figure figure : figures) {
            System.out.println("Perimeter of " + figure.getClass().getSimpleName() + " is " + figure.getPerimeter());
        }
    }

    public static double calculateArithmeticMean(List<Integer> integers) {
        double sum = 0;
        for (Integer integer : integers) {
            sum += integer;
        }
        return sum / integers.size();
    }
}
