class Static{

    int a=10;
    static int b=20;

    void normal(){
        System.out.println(a+b);
    }

    static void show(){
        //System.out.println(a); it will cause an error becuase we cannot access non static variables inside static method
        System.out.println(b);
    }
    public static void main(String[] args){
        Static s=new Static();
        Static.show(); // no need of class reference to access static methods. we can directly call them using classname
        s.normal();
    }
}