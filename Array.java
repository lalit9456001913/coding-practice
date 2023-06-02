public class Array {
    public static void main(String[] args){
        //declare and initialize and array
        int[] tempArray = {12, 4, 5, 2, 5};

        for (int element : tempArray){

            System.out.print(element + " ");
        }

        // declare an array
        int[] age = new int[5];

       // initialize array
        age[0] = 12;
        age[1] = 4;
        age[2] = 5;

       //  for each example as well
        for (int element : age){

            System.out.print(element + " ");
        }

    }
}