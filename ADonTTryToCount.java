import java.util.*;

public class ADonTTryToCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt(), m = sc.nextInt();
            String x = sc.next();
            String s = sc.next();

            int answer = -1;
            StringBuilder sb = new StringBuilder();
            int repeats = 1;
            for (int k = 0; k <= 6; k++) { // 6 is safe since n*m <= 25
                sb.setLength(0);
                for (int r = 0; r < repeats; r++) sb.append(x);
                if (sb.indexOf(s) != -1) { answer = k; break; }
                repeats *= 2;
            }
            System.out.println(answer);
        }
        sc.close();
    }
}
