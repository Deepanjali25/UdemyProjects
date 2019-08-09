package Udemy;

public class DiagonalStar {
    public static void main(String[] args) {
        printSquareStar(7);
    }
    public static void printSquareStar(int number) {
        int c,r;
        if(number<5) {
            System.out.print("Invalid Value");
            return;
        }
        for(r=1; r<=number; r++) {
            for( c=1; c<=number; c++) {
                if((c==1||c==number)||(r==1||r==number)) {
                    System.out.print("*");
                }
                else if(c==r) {
                    System.out.print("*");
                }
                else if(c==(number-r+1)) {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }
}