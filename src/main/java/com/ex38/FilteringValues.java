/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Enoc Mena
 */

package com.ex38;
import java.util.ArrayList;
import java.util.Scanner;

public class FilteringValues {

    public static Integer[] EvenNumbers(String myList[]) {

        ArrayList<Integer> newNumList = new ArrayList<>();

        for(int i=0; i<myList.length; i++){

            int num = Integer.parseInt(myList[i]);

            if(num % 2 == 0){

                newNumList.add(num);

            }
        }

        Integer[] array= new Integer[newNumList.size()];
        array = newNumList.toArray(array);


        return array;

    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Enter a list of numbers, separated by spaces: ");
        String nums = in.nextLine();

        String numList[] = nums.split(" ");

        Integer evenList[] = EvenNumbers(numList);

        System.out.print("The even numbers are ");

        for(int i=0; i<evenList.length; i++){
            if(i < evenList.length-1){
                System.out.print(evenList[i] + " ");
            }
            else
            {
                System.out.print(evenList[i] + ".");
            }
        }
    }

}