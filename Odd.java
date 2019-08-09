package Udemy;

public class Odd {
    public static void main(String[] args) {
    }
    public static boolean isOdd(int a) {
        if(a>0 && a%2!=0)
            return true;
        else
            return false;
    }
    public static int sumOdd(int start, int end) {
        int sum = 0;
        if ((end<start)||start<0) {
            return -1;
        }
        for(int i=start;i<=end;i++) {
            if (isOdd(i))
                sum += i;
        }
        return sum;
        }
    }
