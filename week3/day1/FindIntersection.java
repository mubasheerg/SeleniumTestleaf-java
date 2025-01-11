package week3.day1;

public class FindIntersection {

    public static void main(String[] args) {
        // Declare the two arrays
        int[] array1 = {3, 2, 11, 4, 6, 7};
        int[] array2 = {1, 2, 8, 4, 9, 7};

        System.out.println("Matching elements:");

        // Nested loop to compare elements from both arrays
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array2.length; j++) {
                // Compare elements of array1 with array2
                if (array1[i] == array2[j]) {
                    // Print the matching element
                    System.out.println(array1[i]);
                }
            }
        }
    }
}
