package recursion;

import java.util.*;

public class Subsequences {

    static void generate(int[] arr, int index, ArrayList<Integer> current) {

        // Base case
        if (index == arr.length) {
            System.out.println(current);
            return;
        }

        // TAKE
        current.add(arr[index]);
        generate(arr, index + 1, current);

        // BACKTRACK
        current.remove(current.size() - 1);

        // SKIP
        generate(arr, index + 1, current);
    }

    public static void main(String[] args) {

        int[] arr = {1, 2, 3};

        generate(arr, 0, new ArrayList<>());
    }
}
