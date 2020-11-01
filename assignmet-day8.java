//#Question_1:


//main
package com.office;

public class Main {

    public static void main(String[] args) {
        office[] off = new office[5];

        //objects
        for(int i=0;i<6;i++){
            off[i]= new office();
        }
        //getting details
        for(int i=0;i<5;i++){
            off.getdetails();
        }
        for(int i=0; i<5; i++){
            off.displaydetails();
        }



    }

    }
}

//office details

import java.util.Scanner;
public class office {
    public void class office(String[] Args) {
        Scanner ss = new Scanner(System.in);
        String name;
        int age;
        String salary;
        String designation;
        public void  getdetails(){
            System.out.println("enter the name of employee ");
            name = ss.nextLine();
            System.out.println("enter the age of the employee");
            age = ss.nextInt();
            System.out.println("name the salary of the employee");
            power = ss.nextLine();
            System.out.println("name the designation of employee");
            weapon = ss.nextLine();

        }
        public void displaydetails(){
            System.out.println("Hello" + name + "you are " + age + "your salary of " + salary);
            System.out.println("your designation is " + designation);
        }
}




//#Question_4

class Main{
   public static void main(String args[]){
     //create array of employee object  
     Employee[] obj = new Employee[2] ;
 
     //create actual employee object
     obj[0] = new Employee();
     obj[1] = new Employee();
     obj[2] = new Employee();
 
     //assign data to employee objects
     obj[0].setData(100,"sbi");
     obj[1].setData(200,"hdfc");
     obj[2].setData(300,"icici");
 
     //display the employee object data
     System.out.println("Employee Object 1:");
     obj[0].showData();
     System.out.println("Employee Object 2:");
     obj[1].showData();
     System.out.println("Employee Object 3:");
     obj[2].showData();
  }
}
//Employee class with empId and name as attributes
class Employee{
    int empId;
    String name;
    public void setData(intc,String d){
        empId=c;
        name=d;
     }
    public void showData(){
        System.out.print("EmpId = "+empId + "  " + " Employee Name = "+name);
        System.out.println();
     }
}

