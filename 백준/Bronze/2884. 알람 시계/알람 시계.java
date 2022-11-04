import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int s = Integer.parseInt(st.nextToken());
        int h = Integer.parseInt(st.nextToken());
        
        if (0 < s && h < 45) {
            System.out.println(s - 1 + " " + (60 + h - 45));
        } else if (0 == s && h < 45) {
            System.out.println(23 + " " + (60 + h - 45));
        } else {
            System.out.println(s + " " + (h - 45));
        }
    }
}