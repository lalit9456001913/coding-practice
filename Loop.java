public class Loop {
    public static void main(String[] args){
        // for loop
        System.out.println("for loop");
        for(int i=0;i<4;i++){
            System.out.println(i);
        }

        // while loop
        System.out.println("while loop");
        int j=0;
        while(j<=10){
            System.out.println(j);
            j+=1;
        }

        // do while loop
        System.out.println("do while loop");
        int k=1;
        do{
            System.out.println(k);
            k++;
        }while(k<=10);
    }
}