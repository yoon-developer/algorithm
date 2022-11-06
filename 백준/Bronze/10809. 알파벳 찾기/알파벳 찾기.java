import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String s = br.readLine();
        
        for (char i = 'a'; i <= 'z'; i++) {
            if (s.contains(i + "")) {
                System.out.print(s.indexOf(i) + " ");
            } else {
                System.out.print(-1 + " ");
            }
        }
    }
        
}