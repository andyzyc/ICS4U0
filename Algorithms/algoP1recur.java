import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class algoP1recur {
    public static void main(String[] args) throws IOException {

        // initializing input reader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        // initializing variables
        String N = st.nextToken();

        System.out.println(recursiveCalculate(N));
    }

    // recursive method
    public static int recursiveCalculate(String str) {
        if (str.length() == 1) {
            // charAt() returns ascii value, -48 to remove the excess value
            return str.charAt(0) - 48;
        }
        // charAt() returns ascii value, -48 to remove the excess value
        return (str.charAt(0) - 48) + recursiveCalculate(str.substring(1));
    }
}
