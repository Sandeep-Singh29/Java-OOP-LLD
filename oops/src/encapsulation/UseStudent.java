package encapsulation;

/**
 * Author: SANDEEP
 * Date: 03/10/24
 */

public class UseStudent {
    public static void main(String[] args) {
        Student student = new Student();

        // If the field are public than outside user can change the field the name but when we
        // change field as private the compile time error show
        // they sa you have initilized a field using set() ur Constructor
        /*student.name = "sandeep";
        student.address = "Bengaluru";
        student.salary = 1000.00F;
        student.age = 28;*/

        student.showStudent();
        System.out.println();
        Student student1 = new Student("Kuldeep",25,70870.00F,"Delhi");
        student1.showStudent();
        System.out.println();
        Student student2 = new Student();
        student2.setAge(16);
        student2.setName("Rishabh");
        student2.setAddress("Dibiyapur");
        student2.setSalary(00.00F);
        student2.showStudent();
    }
}
