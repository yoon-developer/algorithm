import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static int sum = 1;
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int sum = factorial(n);
        
        System.out.println(sum);
    }
    
    public static int factorial (int v) {
        if (v <= 1) {
            return 1;
        } else {
            return v * factorial(v - 1);
        }
    }
}