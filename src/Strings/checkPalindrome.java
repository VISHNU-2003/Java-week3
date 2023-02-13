package Strings;
//39th class

public class checkPalindrome {
    static boolean checkPalindrome(String s)
    {
        //Arora
        s = s.toLowerCase();//case doesn't matter in finding palindrome
        //or
        s = s.toUpperCase();
        int l = 0;
        int r = s.length() - l;
        while(l<r)
        {
            if(s.charAt(l) != s.charAt(r)){
                return false;
            }
            l++;
            r--;
        }
        //we reach here means loop did not return false. Means string is palindrome
        return true;
    }

    public static void main(String[] args) {
        String s = "MADAM";
        String s2 = "CIPHER";
        String s3 = "Madam";//Yes this is palindrome
        System.out.println(checkPalindrome(s));
        System.out.println(checkPalindrome(s2));
        System.out.println(checkPalindrome(s3));
    }
}
