import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    static int n, m;

    static int[] arr;
    static boolean[] check;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        arr = new int[m];
        check = new boolean[n + 1];

        dfs(0);
    }

    public static void dfs(int v) {
        if (v == m) {
            for (int x : arr) {
                if (x != 0 ) {
                    System.out.print(x + " ");
                }
            }
            System.out.println();
        } else {
            for (int i = 1; i <= n; i++) {
                if (check[i]) {
                    continue;
                }

                check[i] = true;
                arr[v] = i;
                dfs(v + 1);
                check[i] = false;
            }
        }
    }
}