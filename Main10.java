package Udemy;

import java.util.Scanner;
public class Main10 {
    private static Scanner scnr = new Scanner(System.in);
    public static void main(String[] args) {
        int[] myIntegers = getIntegers(5);
        for (int i = 0; i < myIntegers.length; i++) {
            System.out.println("Element " + i + ", typed value was " + myIntegers[i]);
        }
        System.out.println("The average is " + getAverage(myIntegers));
        //int[] myIntArray = {1,2,3,4,5,6,7,8,9,10};
        //myIntArray[5] = 50;
        //double[] myDoubleArray = new double[10];
        //System.out.println(myIntArray[5]);
    }
    public static int[] getIntegers(int number) {
        System.out.println("Enter " + number + " integer values.\r");
        int[] values = new int[number];
        for (int i = 0; i < values.length; i++) {
            values[i] = scnr.nextInt();
        }
        return values;
    }
    public static double getAverage(int[] array) {
        int sum=0;
        for (int i=0; i<array.length;i++) {
            sum+=array[i];
        }
        return (double) sum/(double) array.length;
    }
}
