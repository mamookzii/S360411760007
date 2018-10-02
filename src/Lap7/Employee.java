package Lap7;

//properties
//1.name
//2.id
//3.position
//4.salary
//5.email
public class Employee {
    private String name;
    private String id;
    private String position;
    private double salary;
    private String email;

    //constructor
    //default constructor
    public Employee() {
    }

    public Employee(String name, String id, String position, double salary, String email) {
        this.name = name;
        this.id = id;
        this.position = position;
        this.salary = salary;
        this.email = email;
    }
    //getter and setter methods
    //get => read
    // get => edit

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //name
    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }//id

    public String getPosition() {
        return this.position;
    }

    public void setPosition(String position) {
        this.position = position;
    }//position

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }//salary

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }//email

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                ", position='" + position + '\'' +
                ", salary=" + salary +
                ", email='" + email + '\'' +
                '}';
    }
}//class
