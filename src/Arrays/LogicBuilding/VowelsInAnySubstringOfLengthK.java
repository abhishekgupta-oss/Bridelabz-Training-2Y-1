package Arrays.LogicBuilding;
import java.util.*;
public class VowelsInAnySubstringOfLengthK {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int k = sc.nextInt();
        int count = 0;
        for (int i = 0; i < k; i++) {
            char ch = s.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;
            }
        }
        int max = count;
        for (int i = k; i < s.length(); i++) {
            int left = s.charAt(i - k);
            if (left == 'a' || left == 'e' || left == 'i' || left == 'o' || left == 'u') {
                count--;
            }
        }
        for (int i = 0; i < s.length(); i++) {
            int right = s.charAt(i);
            if (right == 'a' || right == 'e' || right == 'i' || right == 'o' || right == 'u') {
                count++;
            }
            max = Math.max(max, count);
        }

    System.out.println(max);
}
}
