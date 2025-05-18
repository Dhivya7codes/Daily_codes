package apnacollege;
import java.util.Scanner;
class Employee1 {
    private int EmpID;
    private String Name;

    public int getEmp() {
        return EmpID;
    }

    public void setEmp(int EmpID) {
        this.EmpID = EmpID;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        this.Name = name;
    }

    void display() {
        System.out.println("Employee ID: " + EmpID);
        System.out.println("Name: " + Name);
    }
}
public class classthirteen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int EmpID = sc.nextInt();
        sc.nextLine();
        String name = sc.nextLine();
        Employee1 emp = new Employee1();
        emp.setEmp(EmpID);
        emp.setName(name);
        emp.display();
    }
}

