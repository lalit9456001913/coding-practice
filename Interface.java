import java.util.Scanner;
interface client{
    void input(); //public+abstract
    void output(); //public+abstract
}

class Interface implements client{
    String name; double sal;
    public void input(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Username: ");
        name=sc.nextLine();
        System.out.println("Enter Salary");
        sal=sc.nextDouble();
    }
    public void output(){
        System.out.println(name+"  Salary is "+sal);
    }
    public static void main(String[] args){
        client c=new Interface();
        c.input();
        c.output();
    }
}