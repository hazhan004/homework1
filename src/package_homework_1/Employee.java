/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package package_homework_1;

/**
 *
 * @author Sherdll Store
 */
public class Employee {
    
    private String firstname;
    private String lastname;
    private double monthlysalary;
   
    
    public Employee(String firstname,String lastname,double monthlysalary){
    
        this.firstname = firstname;
        this.lastname = lastname;
        this.monthlysalary=monthlysalary;
    }
      

    

    public void setfirstname(String firstName) {
        this.firstname = firstName;
    }
    
    public String getfirstname() {
        return firstname;
    }
    
    public void setLastName(String lastname) {
        this.lastname = lastname;
    }

    public String getlastname() {
        return lastname;
    }

    
        public void setmonthlysalary(double monthlysalary) {
        if (monthlysalary > 0) {
            this.monthlysalary = monthlysalary;
        }
    }
        

    public double getmonthlysalary() {
        return monthlysalary;
    }



    public double getyearlysalary() {
        return monthlysalary * 12;
    }

    public void giveRaise(double percentage) {
        monthlysalary += monthlysalary * (percentage / 100);
    }
    
    }

