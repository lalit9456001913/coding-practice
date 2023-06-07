class A{
    private A(){

    }
    static A object;

    static A getObject(){
        if(object ==null){
            A a=new A();
            object =a;
        }

        return object;
    }
}

class PracticeExample{
    public static void main(String[] args){

        System.out.println(A.getObject());
        System.out.println(A.getObject());
        System.out.println(A.getObject());

    }
}