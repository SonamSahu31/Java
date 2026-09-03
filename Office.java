package Constructer;

public class Office {
    private String name;
    private int age;
    public int ID;
    public Office(String name, int age, int ID){
        this.name = name;
        this.age = age;
        this.ID = ID;
    }
    public void displayInfo(){
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("ID: " + ID);
        System.out.println("_________________________");
    }
    public static void main(String[] args) {
        Office person1 = new Office("Alice", 30, 1001);
        Office person2 = new Office("Bob", 35, 1002);

        person1.displayInfo();
        person2.displayInfo();

    }        

}
