package arrays;

public class TwoPointerConcept {
    public static void main(String[] args) {
        int arr[] = {10,20,35,50,75,80};
        int l = 95;
        int x = 0;
        int r = arr.length-l;
        boolean found = false;//flag
        while(l<r)
        {
            int sum = arr[l] + arr[r];
            if(sum==x)
            {
                System.out.println("Found " + x + "as sum of values on index: " + l + "and index: " + r);
                found = true;
                break;
//                return;
            }
            else if(sum<x)
            {
                l++;
            }
            else //sum>x
            {
                r--;
            }
        }
        if(!found)System.out.println("Sum not found");
    }
}
