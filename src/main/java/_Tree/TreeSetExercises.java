package _Tree;

import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class TreeSetExercises {

    // Objects in a TreeSet are stored in a sorted and ascending order.

    public static void main(String[] args) {

        // 1. Write a Java program to create a new tree set, add some colors (string) and print out the tree set.
        TreeSet<String> colors = new TreeSet<>();

        colors.add("blue");
        colors.add("red");
        colors.add("green");

        //2. Write a Java program to iterate through all elements in a tree set.

        // Solution with streams
        System.out.println("Iterating through with streams");
        colors.stream().forEach(System.out::println);

        // Solution with iterator
        System.out.println("\nIterating through with iterator");
        Iterator<String> it = colors.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }


        //3. Write a Java program to add all the elements of a specified tree set to another tree set.
        TreeSet<String> colors2 = new TreeSet<>();
        colors.stream().forEach(color -> colors2.add(color));


        // 4. Write a Java program to create a reverse order view of the elements contained in a given tree set
        Iterator<String> descendingIterator = colors.descendingIterator();
        System.out.println("\nIterating through with reverse order");
        while(descendingIterator.hasNext()){
            System.out.println(descendingIterator.next());
        }

        // 5. Write a Java program to get the first and last elements in a tree set.
        System.out.println("\nFirst element: "+ colors.first());
        System.out.println("Last element: "+ colors.last());

        // 6. Write a Java program to clone a tree set list to another tree set.
        TreeSet<String> clonedSet = (TreeSet<String>) colors.clone();
        System.out.println("\nCloned set: ");
        clonedSet.stream().forEach(System.out::println);

        // 7. Write a Java program to get the number of elements in a tree set.
        System.out.println("\nNumber of elements: "+colors.size());

        // 8. Write a Java program to compare two tree sets.
        TreeSet<String> colors3 = new TreeSet<>();

        colors3.add("blue");
        colors3.add("black");
        colors3.add("orange");

        System.out.println("\nFirst set: ");
        colors.stream().forEach(System.out::println);

        System.out.println("Second set: ");
        colors3.stream().forEach(System.out::println);

        System.out.println("\nCompare elements: ");
        for(String color: colors){
            System.out.println(colors3.contains(color) ? "Yes" : "No");
        }

        // 9. Write a Java program to find the numbers less than 7 in a tree set.
        TreeSet<Integer> numbers = new TreeSet<>();
        numbers.addAll(List.of(8, 3, 1 ,5, 7, 10, 40));

        List<Integer> numbersLessThanSeven = numbers.stream().filter(number -> number < 7).collect(Collectors.toList());

        System.out.println("\nNumbers less than seven: ");
        numbersLessThanSeven.stream().forEach(System.out::println);

        // Removing first and last element

        System.out.println("\nNumbers: ");
        numbers.forEach(System.out::println);
        numbers.remove(numbers.first());
        System.out.println("\nNumbers after removing first: ");
        numbers.forEach(System.out::println);
        numbers.remove(numbers.last());
        System.out.println("\nNumbers after removing last: ");
        numbers.forEach(System.out::println);



    }
}
