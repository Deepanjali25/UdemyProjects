package Udemy;

import java.util.*;
public class ReviewLoop {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int t =scanner.nextInt();
        scanner.nextLine();
        while(t>0)
        {
            String str= scanner.nextLine();
            char arr[] = str.toCharArray();
            int len= str.length();
            for(int x=0;x<len;x=x+2)
            {
                System.out.print(arr[x] + " ");
            }
            System.out.print(" ");
            for(int x=1;x<len;x=x+2)
            {
                System.out.print(arr[x]);
            }
            System.out.println();
            t--;
        }
        scanner.close();
    }
}