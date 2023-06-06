import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;

class JavaCollections{
    public static void main(String[] args){
    //-------arraylist-----------------------------------------------------
        ArrayList<String> Name=new ArrayList<String>();
        // adding value into Name arraylist
        Name.add("Ankit");
        Name.add("Ankush");
        System.out.println(Name);

        // adding rohit on first index
        Name.add(1,"rohit");
        System.out.println(Name);

        // removing first element of arraylist
        Name.remove(1);

        System.out.println(Name);

        // replace value using set method

        Name.set(0,"Prateek");

        System.out.println(Name);

        // get perticuler index value using get method

        System.out.println(Name.get(1));

        // delete all value of array list using clear method
        Name.clear();
    //------------------------------------------------------------------------------

    //----Linkedlist---------------------------------------------------------------------

        LinkedList<String> linkedList=new LinkedList<String>();

        // add element to linkedlist
        linkedList.addFirst("firstlinkedlist elment");
        linkedList.addLast("second linkedlinkedlist elment");
        linkedList.addFirst("thirdlinkedlist elment");
        System.out.println(linkedList);

        linkedList.removeFirst();
        linkedList.removeLast();
        System.out.println(linkedList);

        // for each loop
        for(String str:linkedList){
            System.out.println(str);
        }
    // ----------------------------------------------------------------------------------

    //---------stack---------------------------------------------------------------------
        Stack<String> stack=new Stack<>();
        stack.push("ankit");
        stack.push("lalit");
        stack.push("amit");

        System.out.println(stack);

        stack.pop();

        System.out.println(stack);
    //-----------------------------------------------------------------------------------

    //----------queue--------------------------------------------------------------------
        ArrayDeque<String> deque=new ArrayDeque<>();  // FIFO
        deque.add("Amir");
        deque.add("Ankush");
        deque.add("Altaf");

        System.out.println(deque);

        deque.remove();
        System.out.println(deque);

    // ----------------------------------------------------------------------------------

    }
}