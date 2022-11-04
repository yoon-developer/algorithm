import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine());
        
        if (n % 4 == 0 && n % 100 != 0) {
            System.out.println(1);
        } else if (n % 100 == 0 && n % 400 == 0) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
              
    }
}