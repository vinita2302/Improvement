import java.util.*;

class Duplicate {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 1, 2};
        ArrayList<Integer> res = new ArrayList<Integer>();

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    if (!res.contains(arr[j])) {
                        res.add(arr[i]);
                    }
                    break; 
                }
            }
        }

  
        for (int duplicate : res) {
            System.out.println(duplicate);
        }
    }
}
