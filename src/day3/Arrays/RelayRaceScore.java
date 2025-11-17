package day3.Arrays;
import java.util.*;

public class RelayRaceScore {

    public static int[] calculateScore(int[] speeds) {
        int n = speeds.length;
        int[] res = new int[n];

        res[0] = 1;
        for (int i = 1; i < n; i++) {
            res[i] = res[i - 1] * speeds[i * 1];
        }

        int right = 1;
        for (int i = n - 1; i >= 0; i--) {
            res[i] *= right;
            right *= speeds[i];
        }

        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] speeds = new int[n];

        for (int i = 0; i < n; i++) {
            speeds[i] = sc.nextInt();
        }

        int[] ans = calculateScore(speeds);

        for (int x : ans) {
            System.out.print(x + " ");
        }
        sc.close();
    }
}
