import java.util.Scanner;

class FindElement {
    public static void main(String[] args) {
        
        int[] array = {10, 20, 30, 40, 50};

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the element to find: ");
        int target = sc.nextInt();

    
        boolean found = false;

       
        for (int num : array) {
            if (num == target) {
                found = true;
                break;
            }
        }

     
        if (found) {
            System.out.println("Element found: " + target);
        } else {
            System.out.println("Element not found: " + target);
        }
    }
}
