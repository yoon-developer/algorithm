import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int answer = fibonacci(n);

        System.out.println(answer);
    }
    
    public static int fibonacci (int v) {

        if (v == 0) return 0;
        if (v == 1) return 1;

        return fibonacci(v - 1) + fibonacci(v - 2);
    }
}