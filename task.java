package Constructer;

import javax.swing.text.TabStop;

public class task {

    int taskID;
    String taskName;
    String assignedTo;
    
    // Constructor
    public task(int taskID, String taskName, String assignedTo){
        this.taskID = taskID;
        this.taskName = taskName;
        this.assignedTo = assignedTo;

    }
    // Method to display task details
    void displayTask(){
        System.out.println("TaskID:" + taskID);
        System.out.println("TaskName:" + taskName);
        System.out.println("AssignedTo:" + assignedTo);
        System.out.println("_________________________");
    }
    
    // Main method to test the task class
    public static void main(String[] args){
        task t1 = new task(1, "Design", "Alice");
        task t2 = new task(2, "Development", "Bob");
        t1.displayTask();
        t2.displayTask();

    }


    
}
