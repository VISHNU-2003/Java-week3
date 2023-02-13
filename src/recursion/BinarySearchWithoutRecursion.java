package recursion;

public class BinarySearchWithoutRecursion {
    public static void main(String[] args) {
        int arr[] = {2,5,8,12,16,23,38,56,72}; //Pre-requisite ->Sorted Array
//        int x = 23;
        int x =2;
        //Binary Search below
        int l = 0;//Left Most Index
        int r = arr.length -l;//Rightmost  Index

        while(l<=r)
        {
            //int mid = (r-l)/2 + l;
            int mid = (l+r)/2;
            if(arr[mid] == x)
            {
                System.out.println("Value found at index: " + mid);
                return;
            }
            else if(x<arr[mid])
            {
                r = mid - l;
            }
            else {
                l = mid + l;
            }
        }
        System.out.println("Value not found.");
    }
}
