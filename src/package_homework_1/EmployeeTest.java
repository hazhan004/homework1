/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package package_homework_1;

/**
 *
 * @author Sherdll Store
 */
public class EmployeeTest {
    public static void main(String[] args) {
        Employee emp1 = new Employee("hazhan", "hiwa", 1666.67);
        Employee emp2 = new Employee("karzhin", "Mohammad", 4166.67);

       System.out.printf("%s\t\t\t\t%s\n","NAME","YEARLY SALARY");
       System.out.println("-------"+"                       ----------------");
       System.out.printf("%s %s\t\t\t%s\n",emp1.getfirstname(),emp1.getlastname(),emp1.getyearlysalary());
       System.out.printf("%s %s\t\t%s\n",emp2.getfirstname(),emp2.getlastname(),emp2.getyearlysalary());
       
        emp1.giveRaise(10);
        emp2.giveRaise(10);

        System.out.println("10 Percent Salary Raised!! Yoohooooo!");
        System.out.printf("%s\t\t\t%s\n","NAME","YEARLY SALARY");
       System.out.println("-------"+"                ----------------");
       System.out.printf("%s %s\t\t%s\n",emp1.getfirstname(),emp1.getlastname(),emp1.getyearlysalary());
       System.out.printf("%s %s\t%s\n",emp2.getfirstname(),emp2.getlastname(),emp2.getyearlysalary());
    }
}
