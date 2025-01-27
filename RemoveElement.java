import java.util.Arrays;
import java.util.Scanner;

class RemoveElement {
    public static void main(String[] args) {
        
        int[] array = {10, 20, 30, 40, 50};

        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the element to remove: ");
        int target = sc.nextInt();
     
        boolean found = false;
        int[] newArray = new int[array.length - 1];
        int index = 0;

        for (int num : array) {
            if (num == target) {
                found = true; 
            } else {
                if (index < newArray.length) {
                    newArray[index++] = num; 
                }
            }
        }

       
        if (found) {
            System.out.println("Array after removing element: " + Arrays.toString(newArray));
        } else {
            System.out.println("Element not found: " + target);
        }
    }
}
