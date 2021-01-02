import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class algoP1iter {
    public static void main(String[] args) throws IOException {

        // initializing input reader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        // initializing variables
        int N = Integer.parseInt(st.nextToken());

        System.out.println(iterativeCalculate(N));
    }

    // iterative method
    public static int iterativeCalculate(int num) {
        String str = Integer.toString(num);
        int total = 0;
        for (int i = 0; i < str.length(); i++) {
            // charAt() returns ascii value, -48 to remove the excess value
            total += str.charAt(i) - 48;
        }
        return total;
    }
}
