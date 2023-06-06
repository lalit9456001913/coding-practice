import java.util.Scanner;

public class JavaString {
    public static void main(String[] args){
        String name=new String("Lalit");
        System.out.println(name);
        int a=6;
        double b=5.5674;
        System.out.printf("The value of a is %d and value of b is %f",a,b);
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value");
        String st=sc.nextLine();
        System.out.println(st);


        // -----charAt()

        String myStr = "Hello";
        char result = myStr.charAt(0);
        System.out.println(result);

        //---trim()-------------
        String myStr1 = "       Hello World!       ";
        System.out.println(myStr1);
        System.out.println(myStr1.trim());  // Hello World!

        // ------toUpperCase() and toLowerCase()----
        String txt = "Hello World";
        System.out.println(txt.toUpperCase());
        System.out.println(txt.toLowerCase());

        //--------- startsWith--------------
        String myStr2= "Hello";
        System.out.println(myStr2.startsWith("Hel"));   // true
        System.out.println(myStr2.startsWith("llo"));   // false
        System.out.println(myStr2.startsWith("o"));     // false

        //----replace------------------------
        String myStr3 = "Hello";
        System.out.println(myStr3.replace('l', 'p'));

        //---length-----------
        String txt2= "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        System.out.println(txt2.length());

        //------lastIndexOf--------------------------
        String myStr4= "Hello planet earth, you are a great planet.";
        System.out.println(myStr4.lastIndexOf("planet"));


        //-----isEmpty--------------------------------------------
        String myStr6 = "Hello";
        String myStr5 = "";
        System.out.println(myStr6.isEmpty());
        System.out.println(myStr5.isEmpty());

        //---indexOf----------------------------------------------------
        String myStr7 = "Hello planet earth, you are a great planet.";
        System.out.println(myStr7.indexOf("planet"));

        //-------equal--------------------------------------------------
        String myStr8 = "Hello";
        String myStr9 = "Hello";
        String myStr10 = "Another String";
        System.out.println(myStr8.equals(myStr9)); // Returns true because they are equal
        System.out.println(myStr8.equals(myStr10)); // false

        //--compareTo-----------------------------------------------------

        String myStr11 = "Hello";
        String myStr12 = "Hello";
        System.out.println(myStr11.compareTo(myStr12)); // Returns 0 because they are equal

        //----contains---------------------------------------------------
        String myStr13 = "Hello";
        System.out.println(myStr13.contains("Hel"));   // true
        System.out.println(myStr13.contains("e"));     // true
        System.out.println(myStr13.contains("Hi"));    // false

        //---substring---------------
        String s="hello";
        System.out.println(s.substring(0,2)); //returns he  as a substring
        System.out.println(s.substring(2));

        //----join---------------
        String str1 = "I";
        String str2 = "love";
        String str3 = "Java";

        // join strings with space between them
        String joinedStr = String.join(" ", str1, str2, str3);

        System.out.println(joinedStr);

        //--split------------------------
        String text2 = "Java is a fun programming language";

        // split string from space
        String[] result2 = text2.split(" ");


        System.out.print("result = ");
        for (String str : result2) {
            System.out.print(str + ", ");
        }
    }
}
