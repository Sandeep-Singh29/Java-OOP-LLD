package encapsulation;

/**
 * Author: SANDEEP
 * Date: 03/10/24
 */

public class Student {

    private String name;
    private int age;
    private double salary;
    private String address;

    public Student() {
    }

    public Student(String name, int age, double salary, String address) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }


    public void showStudent() {
        System.out.println("Name : " + name);
        System.out.println("Age : " + age);
        System.out.println("Salary : " + salary);
        System.out.println("Address : " + address);
    }

}
