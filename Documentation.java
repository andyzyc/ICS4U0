import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * Main class
 *
 * @author      Andy Chen <627944> (template taken from my ccc code)
 * @version     1.0
 * @since       1.8
 */
public class Main {

    /**
     * Main method which utilizes the calculateAverage method
     *
     * @param args The command line parameters
     * @exception IOException If an I/O error occurs
     */
    public static void main(String[] args) throws IOException {

        // initializing input reader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        // initializing variables
        int[] marks = new int[8];

        for (int i = 0; i < marks.length; i++) {
            marks[i] = Integer.parseInt(st.nextToken());
        }

        double average = calculateAverage(marks);

        System.out.println("Your average from the inputted marks to 2 decimal places is:");
        System.out.printf("%.2f", average);
    }

    /**
     * Calculates the average of the marks
     *
     * @param marks Contains the stored marks
     * @return The average of all inputted marks, or 0 if the marks array is empty
     */
    public static double calculateAverage(int[] marks) {
        if (marks.length == 0) {
            return 0;
        }

        int total = 0;
        for (int mark : marks) {
            total += mark;
        }
        return (double) total / marks.length;
    }
}
