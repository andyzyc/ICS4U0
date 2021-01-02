import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class algoP2iter {
    public static void main(String[] args) throws IOException {

        // initializing input reader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        // initializing variables
        String N = st.nextToken().toLowerCase();

        System.out.println(iterativeCalculate(N));
    }

    // iterative method
    public static int iterativeCalculate(String str) {
        int pali = 0;
        for (int i = 0; i < str.length(); i++) {
            for (int j = i+1; j <= str.length(); j++) {
                String temp = str.substring(i, j);
                if (temp.length() >= 2) {
                    String reverse = "";
                    for (int k = temp.length()-1; k >= 0; k--) {
                        reverse = reverse.concat(String.valueOf(temp.charAt(k)));
                    }
                    if (reverse.compareTo(temp) == 0) {
                        pali++;
                    }
                }
            }
        }
        return pali;
    }
}
