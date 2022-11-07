import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int[] arr = new int[n];
        int[] sorted = new int[n];
        for (int i = 0; i < n; i++) {
            int v = Integer.parseInt(st.nextToken());
            arr[i] = v;
            sorted[i] = v;
        }

        Arrays.sort(sorted);

        Map<Integer, Integer> map = new HashMap<>();

        int idx = 0;

        for (int x : sorted) {
            if (!map.containsKey(x)) {
                map.put(x, idx++);
            }
        }

        StringBuilder sb =  new StringBuilder();
        for (int x : arr) {
            sb.append(map.get(x)).append(" ");
        }

        System.out.println(sb);
    }
}