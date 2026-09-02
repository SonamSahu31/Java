package Constructer;

public class student {
    int studentID;
    String studentName;
    int studentAge;
    int studentGrade;
    // Constructor
    public student(int studentID, String studentName, int studentAge, int studentGrade){
        this.studentID = studentID;
        this.studentName = studentName;
        this.studentAge = studentAge;
        this.studentGrade = studentGrade;
    }
    public void displaystudentInfo(){
        System.out.println("Student ID: " + studentID);
        System.out.println("Student Name: " + studentName);
        System.out.println("Student Age: " + studentAge);
        System.out.println("Student Grade: " + studentGrade);
        System.out.println("_________________________");
    }
    
    
    public static void main(String[] args) {
        student student1 = new student(1, "John Doe", 20, 90);
        student student2 = new student(2, "Jane Smith", 21, 85);
        student1.displaystudentInfo();
        student2.displaystudentInfo();
    }


}
