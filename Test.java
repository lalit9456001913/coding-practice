public class Test {
    int item;

    void setter(int inputValue){
        this.item=inputValue;
    }

    int getter(){
        return item;
    }
    public static void main(String[] args){
        Test obj1=new Test();
        obj1.setter(6);
        Test obj2=new Test();
        System.out.println(obj2.getter());
    }
}

