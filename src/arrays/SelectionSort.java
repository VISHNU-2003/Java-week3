package arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int arr[] = {3, 7, 10, 11, 4, 1};
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            //find index of minimum element
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            //the index of min element is found in minIndex
            //now we will swap the min element and bring it in its place
            //i.e.swap elements and minIndex and i

            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
        //here our array should be sorted
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i] + " ");
        }
        System.out.println();
    }
}
