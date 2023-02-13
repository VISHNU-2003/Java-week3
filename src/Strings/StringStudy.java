package Strings;
//String module number 28,29,30,31,32
import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.Spliterator;

public class StringStudy {
    public static void main(String[] args) {
        String name = "CipherSchools"; //created usig string literals - stored in method area
        String name2 = "Cipherschools";

        String name3 = new String("CipherSchools");//Creating a string using constructors
        String name4 = new String("CipherSchools");

        System.out.println(name==name2);//== operator compares references for objects and values for primitive data types
        System.out.println(name3==name4);
        System.out.println(name==name3);

        //Strings Are Immutable
        //Everytime we do an operation on a string, a new object is created

        System.out.println("***************************************");
        System.out.println("1. Concatenation");
        //1.Concatenation
        String s1 = "Hello";
                s1 = s1 + " Peeps";
        System.out.println(s1);
        System.out.println(s1 + ", How're you doing?");
        System.out.println(s1); //s1 remains same because

        //Another way to concat is to use function
        String s2 = new String("Hello");
        String s3 = new String (" People");
//        s2 =  s2.concat(s3);
        String s4 = s2.concat(s3);
        System.out.println(s2);// remains same

        System.out.println("***************************************");
        System.out.println("2. Checking If Strings Are Equal In Value");
        //2.  Checking If Strings Are Equal In Value

        System.out.println(name.equals(name2));
        System.out.println(name.equals(name3));
        //Equals function -> object class.
        //this generally compares references(hashcodes) of objects (just like --)
        //But, for string class it has been overridden to check for the content equality

        System.out.println("==========================================");
        System.out.println("3) Creating new String object from character array");


        //3) Creating new String object from character array
        char arr[] = {'C', 'I', 'P', 'H', 'E', 'R' };
        String strFromArr = new String(arr);//this constructor overloaded to perform this task
        System.out.println(strFromArr);

        //4)Creating partial String object from character array
        System.out.println("=========================================================");
        System.out.println("4. Creating partial String object from charactr array");
//        char arr[] = {'C', 'I', 'P', 'H', 'E', 'R' };
        String partialStrFromArr = new String(arr, 1, 3);//we can pass an array: array, starting index(include), count of elements after starting index
        System.out.println( partialStrFromArr);

        String partialStrFromArr2 = new String(arr, 2, 3);//we can pass an array: array, starting index(include), count of elements after starting index
        System.out.println( partialStrFromArr2);

        //5) changing the case
        System.out.println("==============================================================");
        System.out.println("5.Changing the case");
        System.out.println(name.toLowerCase());
        System.out.println(name.toUpperCase());
        //name = name.toUpperCase();
        System.out.println(name);//remains same

        //6)Splitting
        System.out.println("=======================================================");
        System.out.println("6.Splitting");
        System.out.println("Please enter your full name: ");
        Scanner sc = new Scanner(System.in);
        String fullName = sc.nextLine();// Cipher Schools welcomes you
        String strArr[] = fullName.split(" ");
        for(int i=0;i<strArr.length;i++)
        {
            System.out.println(strArr[i]);
        }

        System.out.println("Please enter something separated by commas: ");
        String csvText = sc.nextLine();
        String csvArr[] = csvText.split(",");
        for(int i=0;i<csvArr.length;i++)
        {
            System.out.println(csvArr[i]);
        }
        System.out.println("Please enter something separated by dots: ");
        String dotText = sc.nextLine();
        String dotArr[] = dotText.split("[.]");//a dot is a meta charter in regex so we will need to use it inside square brackets
        for(int i=0;i<dotArr.length;i++)
        {
            System.out.println(dotArr[i]);
        }

        String backSlashText = "Hello, I attend \"Java\" class";
        String backSlashArr[] = backSlashText.split("\"");//these are special chars: \ ' " etc we need to escape them using \ if we want them in our system
        for(int i=0;i<backSlashArr.length;i++)
        {
            System.out.println(backSlashArr[i]);
        }
        //7.length of a string
        System.out.println("=========================================================");
        System.out.println("7. Length of a String");
        int len = name.length();
        System.out.println("Length of: " + name + " is: " + len);

        //8.Finding index of a char in a string
        System.out.println("===========================================================");
        System.out.println("8. Finding index of a char in a string");
        int index = name.indexOf('e');//return first occurence of that character
        System.out.println("Index of 'e' in " + name +" is: " + index);

        int index2 = name.indexOf('E');//returns -1 if not found
        System.out.println("Index of 'E' in " + name + " is: " + index2);

        int index3 = name.indexOf("School");//returns first occurrence of that string
        System.out.println("Index of School in " + name + " is: " + index3);

        int index4 = name.indexOf('o', 10);//start searching from index 10, 10 included
        System.out.println("Index of 'o' in " + name +" is: " + index4);

        int indexOf0 = 0;

//        while(indexOf0 != -1)//stop at -1 o run till not -1
        while(true)//infinite loop - you keep on running, we'll stop you
        {
            indexOf0 = name.indexOf('o', indexOf0 + 1);
            if(indexOf0 == -1) break;
            System.out.println("0 found at: " + indexOf0);
        }

        //9. Extract a Substring
        System.out.println("========================================================================");
        System.out.println("9. Extract a Substring");
        String wF = "Wakanda Forever";
        String subString = wF.substring(3);//From starting index included till the end of String
        System.out.println(subString);

        String subString2 = wF.substring(3,7);//From starting index included till ending index[excluded]
        System.out.println(subString2);

        //10. Finding a character at a given index
        System.out.println("=========================================================================================================");
        System.out.println("10. Finding a character at a given index");
        System.out.println(name.charAt(4));
        int charAtIndex = name.charAt(6);
        System.out.println(charAtIndex);

        //11. Char Array from a String
        System.out.println("================================================================================================================================");
        System.out.println("11.char array from a string");
        char arr2[] = name.toCharArray(); //String to char array
        for(int i = 0; i<arr2.length; i++)
        {
            System.out.println(arr2[i]);
        }

        //12. Check if a string is empty
        System.out.println("-=-=-=-=-=-=-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        System.out.println("12. Check if a string is empty");
        String emptyString = new String();
        String emptyString2 = "";
        String blankString = "       ";//blank string is not an empty string
        System.out.println(emptyString);
        System.out.println(emptyString2);
        System.out.println(emptyString.equals(""));
        System.out.println(emptyString2.equals(""));
        System.out.println(emptyString.isEmpty());
        System.out.println(emptyString2.isEmpty());
        System.out.println(blankString.isEmpty());
        System.out.println(emptyString.isBlank());//but empty string is a blank string

        //13. Comparing strings lexicographically -> alphabetically (dictionary order)
        System.out.println("========================================");
        System.out.println(" 13. Comparing strings lexicographically -> alphabetically (dictionary order)\n");
        String textOne = "Hey!";
        String textTwo = "Bye" ;
        System.out.println(textOne.compareTo(textTwo));//says how is the differece in those words like ahead(compares character by character)
        System.out.println(textTwo.compareTo(textOne));
        System.out.println(textOne.compareTo(textOne));

        //14.Trimming white spaces from the front and end
        System.out.println("=======================================================");
        System.out.println("14.Trimming white spaces from the front and end");
        String s5 = new String("Hello                   ");
        String s6 = new String("                            Hello                   ");
        String s7 = new String("                        Hello                              People                            ");
        System.out.println("*" + s5.trim() + "*");
        System.out.println("*" + s6.trim() + "*");
        System.out.println("*" + s7.trim() + "*");

        //15.Replacing a character
        System.out.println("=========================================================");
        System.out.println("15.Replacing a character");
        System.out.println(name.replace('o', 'O'));
        System.out.println(name.replace("oo", "OOOO"));

        sc.close();

    }
}
