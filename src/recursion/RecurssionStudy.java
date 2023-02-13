package recursion;

public class RecurssionStudy {
        static void printDescending(int n)
        {
            //Base Condition
            if(n<1) return;
            System.out.println(n);
            printDescending(n-1);
        }
//practice.geeksforgeeks.org/problems/max-sum-subarray-of-size-k5313/1
    public static void main(String[] args) {
        int n =5;
        printDescending(n);
    }
    }

