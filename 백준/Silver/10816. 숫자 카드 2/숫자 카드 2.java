import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = null;

        HashMap<Integer, Integer> map = new HashMap();

        int n = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine(), " ");

        for (int i = 0; i < n; i++) {
            int v = Integer.parseInt(st.nextToken());
            map.put(v, map.getOrDefault(v, 0) + 1);
        }

        int m = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < m; i++) {
            int v = Integer.parseInt(st.nextToken());
            if(map.containsKey(v)) {
          			sb.append(map.get(v) + " ");
          		}
          		else {
          			sb.append(0 + " ");
          		}
        }

        System.out.println(sb);
    }
}
