class ExtraaClass {

    public void justaMethod() {
        System.out.println("Parent class method");
    }
}


class Annotation extends ExtraaClass {

    @Override
    public void justaMethod() {
        System.out.println("Child class method");
    }

    public static void main(String[] args){
        Annotation obj=new Annotation();
        obj.justaMethod();
    }
}

