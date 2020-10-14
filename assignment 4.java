package com.agent;

public  class Main {

    public void main(String[] args) {
        Agent[] avenger = new Agent[5];

        //objects
        for(int i=0;i<6;i++){
            avenger[i]= new Employee();
        }
        //getting details
        for(int i=0;i<5;i++){
            avenger.getdetails();
        }
        for(int i=0; i<5; i++){
            avenger.displaydetails();
        }



    }
}






package com.agent;
import java.util.Scanner;

public class Agent {

    public void class avenger(String[] Args) {
        Scanner ss = new Scanner(System.in);
        String name;
        int age;
        String power;
        String weapon;
        String planet;
        public void  getdetails(){
            System.out.println("enter the name of avenger ");
            name = ss.nextLine();
            System.out.println("enter the age of the avenger");
            age = ss.nextInt();
            System.out.println("name the power of the avenger");
            power = ss.nextLine();
            System.out.println("name the weapon of avenger");
            weapon = ss.nextLine();
            System.out.println("which planet avenger belong to?");
            planet = ss.nextLine();
        }
        public void displaydetails(){
            System.out.println("Hello" + name + "you are " + age + "you have ability of " + power);
            System.out.println("your weapon is " + weapon + "you are from " + planet);
        }
    }
}








//   Question 2 
            public static void main(String[] args) {
    		int[] numbers=new int[5];
    
    	 	numbers[0]=1;
    	 	numbers[1]=3;
   	 	numbers[2]=5;

   
   	 	System.out.println(numbers[0]);
   	 	System.out.println(numbers[1]);
        	System.out.println(numbers[2]);
   
   
            }



//    Question 3

	    public static void main(String[] args) {
        	Scanner scanner = new Scanner(System.in);
        	int[] array = new int[10];
        	int sum = 0;
        	System.out.println("Enter the elements:");
        	for (int i=0; i<5; i++)
        	{
            	array[i] = scanner.nextInt();
        	}
        	for( int num : array) {
            		sum = sum+num;
        	}
        	System.out.println("Sum of array elements is:"+sum);
    	    }
