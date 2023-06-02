//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

public class Conditonal {
       public static void main(String[] args) {
            int a=10;
            if(a<10){
                System.out.println("a value is less than 10");
            }else if(a==10){
                System.out.println("a value is equal to 10");
            }else{
                System.out.println("a value is greater than 10");
            }
           //Declaring a variable for switch expression
           int number=20;
           //Switch expression
           switch(number){
               //Case statements
               case 10: System.out.println("10");
                   break;
               case 20: System.out.println("20");
                   break;
               case 30: System.out.println("30");
                   break;
               //Default case statement
               default:System.out.println("Not in 10, 20 or 30");
           }
       }
}
