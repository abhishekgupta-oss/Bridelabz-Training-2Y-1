package Arrays.LogicBuilding;
import java.util.*;
public class MostWater {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int[] height = new int[n];
            for (int i = 0; i < n; i++) {
                height[i] = sc.nextInt();
            }
            int left = 0;
            int right = n - 1;
            int max = 0;
            while (left < right) {
                int width = right - left;
                int h = Math.min(height[left], height[right]);
                int area = width * h;
                if (area > max) {
                    max = area;
                }
                if (height[left] < height[right]) {
                    left++;
                } else {
                    right--;
                }
            }
            System.out.println(max);
        }
    }

