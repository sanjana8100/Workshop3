package com.bridgelabz;

import java.util.Scanner;

public class RemoveDuplicateElementsInAnArray {

    int[] array;

    public int[] addArray(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array:");
        int num= in.nextInt();

        System.out.println("Enter the elements of the array:");
        int[] array= new int[num];
        for (int i=0 ; i<array.length ; i++)
            array[i]= in.nextInt();

        return array;
    }

    public int[] noDuplicateArray(int[] array){
        int[] frequency = new int[array.length];
        int visited= -1;
        for (int i=0 ; i< array.length ; i++){
            int count= 1;
            if(frequency[i] != visited) {
                for (int j = i + 1; j < array.length; j++) {
                    if (array[i] == array[j]) {
                        count++;
                        frequency[j] = visited;
                    }
                }
                frequency[i] = count;
            }
        }

        int count= 0;
        for(int i=0 ; i< frequency.length ; i++){
            if(frequency[i] != -1)
                count++;
        }

        int[] newArray = new int[count];

        count=0;
        for(int i=0 ; i< frequency.length ; i++){
            if(frequency[i] != -1) {
                newArray[count] = array[i];
                count++;
            }
        }
        return newArray;
    }

    public void printArray(int[] array){
        for (int i=0 ; i< array.length ; i++) {
            if (array[i] != 0)
                System.out.print(array[i] + " ");
        }
    }
    public static void main(String[] args) {

        RemoveDuplicateElementsInAnArray anArray= new RemoveDuplicateElementsInAnArray();
        anArray.array= anArray.addArray();

        System.out.println("The Array:");
        anArray.printArray(anArray.array);

        anArray.array= anArray.noDuplicateArray(anArray.array);

        System.out.println("\nThe Array after removing Duplicate Elements:");
        anArray.printArray(anArray.array);
    }
}
