


public class FitnessTracker {

    //initialization
    private String name;
    private int age;
    private char gender;
    private int[] steps = new int[7];
    int totalStep = 0;
    String Activity;
    
    //getter setter
    public void setName(String newName){
        this.name = newName;
    }
    public String getName(){
        return name;
    }
    public void setAge(int newAge){
        this.age = newAge;
    }
    public int getAge(){
        return age;
    }
    public void setGender(char newGender){
        this.gender = newGender;
    }
    public char getGender(){
        return gender;
    }
    public void setSteps(int newSteps[]){   //setter for array inputs
        for(int i = 0; i < 7; i++){
            this.steps = newSteps;
        }
        this.totalStep = 0;
        for(int i = 0; i < newSteps.length; i++){
            this.totalStep += newSteps[i];
        }
    }
    public int getSteps(){  //getter for steps
        return totalStep;
    }

    public String activityLevel(){      //determine activity level
        if(totalStep > 50000){
            Activity = "Highly Active";
        }
        else if(totalStep >= 20000 && totalStep <= 50000){
            Activity = "Moderately Active";
        }
        else if(totalStep < 20000){
            Activity = "Low Activity";
        }
        return Activity;
    }
}
