import java.util.LinkedHashSet;

public class Remove {
    public static void main(String[] args) {
        String str = "banana";
        LinkedHashSet<Character> set = new LinkedHashSet<>();
        for (char c : str.toCharArray()) {
            set.add(c);
        }
        StringBuilder result = new StringBuilder();
        for (char c : set) {
            result.append(c);
        }
        System.out.println(result);
    }
}
