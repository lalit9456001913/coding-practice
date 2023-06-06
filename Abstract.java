abstract class Programming{
    public abstract void  Developer();
}
class HTML extends Programming{
    @java.lang.Override
    public void Developer() {
        System.out.println("i m html developer");
    }
}


class Java extends Programming{
    @java.lang.Override
    public void Developer() {
        System.out.println("i m java developer");
    }
}
class Abstract{
    public static void main(String[] args){
        HTML html=new HTML();
        html.Developer();
        Java jv=new Java();
        jv.Developer();
    }
}