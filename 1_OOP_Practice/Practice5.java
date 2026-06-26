
// Online Java Compiler
// Use this editor to write, compile and run your Java code online
// Employee Salary System
// Create an Employee class.
// name
// salary
// Add a method to calculate yearly salary.
import java.util.Scanner;
class Practice5 {
    static class Employee{
        String name;
        int salary;
        
        Employee(String name,int salary){
            this.name = name;
            this.salary = salary;
        }
        int calcSalary(int sal){
            salary = sal*12;
            return salary;
        }
        void display(){
             System.out.println("Employee Name : "+ name);
            System.out.println("Total Salary : "+ salary);
        }
    }
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        
        System.out.println("Enter your Name : ");
        String inputname = myObj.nextLine();
        System.out.println("Enter your salary per month : ");
        int inputSal = myObj.nextInt();
        
        Employee emp = new Employee(inputname,inputSal);
        emp.calcSalary(inputSal);
        emp.display();
        
        
        
        
    }
}