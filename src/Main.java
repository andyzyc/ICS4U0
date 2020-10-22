import java.io.*;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

/**
 * Main class for a simple program which creates tftpieces from input data
 *
 * @author Andy Chen
 * @version 1.0
 * @since 1.8
 */
public class Main {

    /**
     * Main method of the main class
     *
     * @param args The command line parameters
     * @exception IOException If an I/O error occurs
     */
    public static void main(String[] args) throws IOException {
        Writer out = new FileWriter("output.txt", false);
        BufferedReader br = new BufferedReader(new FileReader("input.txt"));
        StringTokenizer st = new StringTokenizer(br.readLine());


        TftPiece piece1 = new TftPiece(
                st.nextToken(),
                st.nextToken(),
                Integer.parseInt(st.nextToken()),
                new Synergy(st.nextToken(), st.nextToken()),
                Integer.parseInt(st.nextToken()),
                Boolean.parseBoolean(st.nextToken()),
                new String[6]);

        st = new StringTokenizer(br.readLine());

        TftPiece piece2 = new TftPiece(
                st.nextToken(),
                st.nextToken(),
                Integer.parseInt(st.nextToken()),
                new Synergy(st.nextToken(), st.nextToken()),
                Integer.parseInt(st.nextToken()),
                Boolean.parseBoolean(st.nextToken()),
                new String[6]);

        st = new StringTokenizer(br.readLine());

        TftPiece piece3 = new TftPiece(
                st.nextToken(),
                st.nextToken(),
                Integer.parseInt(st.nextToken()),
                new Synergy(st.nextToken(), st.nextToken()),
                Integer.parseInt(st.nextToken()),
                Boolean.parseBoolean(st.nextToken()),
                new String[6]);


        TftPiece[] arr = {piece1, piece2, piece3};
        for (int i = 0; i < arr.length; i++) {
            out.write("Piece " + (i+1) + " in the input is " + arr[i].getName() + ", which comes from the region of " + arr[i].getLoreRegion() + "\n");
        }

        piece2.setItem("Chain Vest");
        out.write(piece2.getName() + " now has a " + piece2.getItem(0) + " in their inventory" + "\n");

        piece3.setStarLevel(2);
        out.write(piece3.getName() + " is now a 2 star piece" + "\n");

        Arrays.sort(arr, Collections.reverseOrder());
        out.write(arr[0].getName() + " costs the most, so it is likely that it is one of the most strongest pieces from the input" + "\n");

        out.close();
    }
}
