

import java.util.Scanner;


public class Driver {
    public static void main(String[] args) {
        //initialization
        String name;
        int age;
        char gender;
        int[] stepCount = new int[7];
        
        
        Scanner sc = new Scanner(System.in); //scanner
        

        FitnessTracker t = new FitnessTracker(); //calling the other class

        System.out.println("ENTER YOUR NAME: ");    //inputting for getter setter
        name = sc.nextLine();
        t.setName(name);
        
        System.out.println("ENTER YOUR GENDER: ");      //inputting for getter setter
        gender = sc.nextLine().toLowerCase().charAt(0);
        while(gender != 'm' && gender != 'f'){
            System.out.println("RENETER GENDER");
            gender = sc.nextLine().toLowerCase().charAt(0);
        }
        t.setGender(gender);

        System.out.println("ENTER YOUR AGE: ");     //inputting for getter setter
        age = sc.nextInt();
        while(age < 1){
            System.out.println("RENTER AGE: ");
            age = sc.nextInt();
        }
        t.setAge(age);

       

        for(int i = 0; i < stepCount.length; i++){      //loop to get daily steps for 7 days
            System.out.println("ENTER YOUR STEP RANGE: " + (i+1));
             stepCount[i] = sc.nextInt();
             while(stepCount[i] < 0){   //checker to make sure steps is not negative
                System.out.println("INVALID");
                System.out.println("RE-ENTER Your Steps");
                stepCount[i] = sc.nextInt();
             }
                t.setSteps(stepCount);
             }
        
             //displaying output
        System.out.println("---------YOUR FINAL REPORT-------------");
        System.out.println("Name: " + t.getName());
        System.out.println("Age: " + t.getAge());
        System.out.println("Gender: " + t.getGender());
        System.out.println("Monday: " + stepCount[0]);
        System.out.println("Tuesday: " + stepCount[1]);
        System.out.println("Wednesday: " + stepCount[2]);
        System.out.println("Thursday: " + stepCount[3]);
        System.out.println("Friday: " + stepCount[4]);
        System.out.println("Saturday: " + stepCount[5]);
        System.out.println("Sunday: " + stepCount[6]);
        System.out.println("----------------------------------------------------");
        System.out.println("YOUR TOTAL STEPS FOR THE WEEK: " + t.getSteps());
        System.out.println("YOUR ACTIVITY LEVEL FOR THE WEEK: " + t.activityLevel());
        System.out.println("----------------------------------------------------");
        
        sc.close();
    }
}


