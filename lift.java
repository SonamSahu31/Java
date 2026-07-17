package loop;

public class lift {
    public static void main(String[] args) {
        int floors = 5; // Number of floors
        int currentFloor = 0; // Starting floor

        // Simulate the lift moving up and down
        for (int i = 0; i <=5; i++) { // Simulate 10 moves
            if (currentFloor < floors - 1) {
                currentFloor++; // Move up
            } else {
                currentFloor--; // Move down
            }
            System.out.println("Lift is at floor: " + currentFloor);
        }
    }
    
}
