package Strings;

public class ReverseAString {
    public static void main(String[] args) {
        String s1 = "CipherSchools";
        int n = s1.length();
        char arr[] = new char[n];
        for(int i = 0; i<n; i++)
        {
            arr[i] = s1.charAt(n-1-i);
        }
        //arr has reversed string
        String rev = new String(arr);
        System.out.println(rev);
        //What is the time complexity - > O(n)
        //It is an in place solution? -> no, we created arr[]
        //what is the space xomplexity? -> O(n) for arr[n]
        String res = new String();
        for(int i=n-1;i>=0;i--)
        {
            res = res + s1.charAt(i);//time complexity O(n) but creates new objects again and again
        }
        System.out.println(res);

        //Approach -3
        char strArr[] = s1.toCharArray();
        int l = 0;
        int r = n-1;
        while(l<r)
        {
            char temp = strArr[l];
            strArr[l] = strArr[r];
            strArr[r] = temp;
        }
        //swapping completed
       String result = new  String(strArr);
        System.out.println(result);
    }
}
