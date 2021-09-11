package Exercise08;

/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Evan Verdu
 */

import java.util.Scanner;

public class Exercise08 {

    public static void main (String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("How many people? ");
        String people = scanner.nextLine();

        System.out.print("How many pizzas do you have? ");
        String pizzas = scanner.nextLine();

        System.out.print("How many slices per pizza? ");
        String slices = scanner.nextLine();

        int NumPeople = Integer.parseInt(people);
        int NumPizzas = Integer.parseInt(pizzas);
        int NumSlices = Integer.parseInt(slices);

        int TotalSlices = NumPizzas*NumSlices;
        int SlicePerPerson = 0;
        int leftovers = 0;



        if (TotalSlices < NumPeople) {
            SlicePerPerson = 0;
            leftovers = TotalSlices;
            }

        else if (TotalSlices == NumPeople) {
            SlicePerPerson = 1;
            leftovers = 0;
            }

        else if (TotalSlices > NumPeople) {
            SlicePerPerson = TotalSlices / NumPeople;
            leftovers = TotalSlices-(SlicePerPerson*NumPeople);
            }



        System.out.println(NumPeople + " people with " + NumPizzas + " pizzas (" + TotalSlices + " slices)");
        System.out.println("Each person gets " + SlicePerPerson + " pieces of pizza.");
        System.out.println("There are " + leftovers + " leftover pieces.");




    }

}
