import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Lombok {
    private String name;
    private int age;

    public static void main(String args){
        System.out.println("inside lombok");
    }
}

//public class Lombok {
//    private String name;
//    private int age;
//
//    public String getName() {
//        return this.name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public int getAge() {
//        return this.age;
//    }
//
//    public void setAge(int age) {
//        this.age = age;
//    }
//}
