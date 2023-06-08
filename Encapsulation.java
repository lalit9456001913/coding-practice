public class Encapsulation {
    private String name;         // private access modifier
    protected int age;           // protected access modifier
    String department;           // default access modifier
    public double salary;        // public access modifier

    public Encapsulation(String name, int age, String department, double salary) {
        this.name = name;
        this.age = age;
        this.department = department;
        this.salary = salary;
    }

    private void printDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Department: " + department);
        System.out.println("Salary: " + salary);
    }

    protected void changeDepartment(String newDepartment) {
        department = newDepartment;
        System.out.println("Department changed to: " + department);
    }

    void incrementSalary(double amount) {
        salary += amount;
        System.out.println("Salary incremented by: " + amount);
    }

    public void displaySalary() {
        System.out.println("Salary: " + salary);
    }

    public static void main(String[] args) {
        Encapsulation emp = new Encapsulation("John Doe", 30, "Sales", 50000.0);

        // Accessing members within the class
        emp.printDetails();             // Accessing private method
        emp.changeDepartment("HR");     // Accessing protected method
        emp.incrementSalary(1000.0);    // Accessing default method
        emp.displaySalary();            // Accessing public method

        // Accessing members from outside the class
        System.out.println(emp.name);         // Error: private member not accessible
        System.out.println(emp.age);          // Error: protected member not accessible
        System.out.println(emp.department);   // Accessing default member
        System.out.println(emp.salary);       // Accessing public member
    }
}

