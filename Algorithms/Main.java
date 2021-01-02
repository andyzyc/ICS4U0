import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

/**
 * Main class for simple sorting and searching of student ids and rankings
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

        // initializing input reader
        Writer out = new FileWriter("output.txt", false);
        BufferedReader br = new BufferedReader(new FileReader("input.txt"));
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        // initializing variables
        // expected input: number of entries, for each entry: \n student id, student rank
        int N = Integer.parseInt(st.nextToken());
        Student[] arr = new Student[N];
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            arr[i] = new Student(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()));
        }

        // running methods
        // not all ids and ranks will be in input (eg rank1-3 didnt want to be shared, so highest displayed rank is #4)


//        out.write("Student System Order (ID, Rank):" + "\n");
//        bubbleSortId(arr);
//        for (Student i : arr) {
//            out.write(i.getId() + ", " + i.getRank() + "\n");
//        }

//        out.write("Student Ranking Order (Rank, ID):" + "\n");
//        insertionSortRank(arr);
//        for (Student i : arr) {
//            out.write(i.getRank() + ", " + i.getId() + "\n");
//        }

//        out.write("Student Ranking Order (Rank, ID):" + "\n");
//        Arrays.sort(arr);
//        for (Student i : arr) {
//            out.write(i.getRank() + ", " + i.getId() + "\n");
//        }

//        bubbleSortId(arr);
//        linearSearchId(arr, 1);

//        insertionSortRank(arr);
//        binarySearchRank(arr, 1);


        long startTime = System.currentTimeMillis();
        Arrays.sort(arr);
        binarySearchRank(arr, 1);
        long endTime = System.currentTimeMillis();
        System.out.println(endTime - startTime);

        out.close();
    }

    /**
     * Bubble Sorts Student IDs
     *
     * @param arr Array which stores Student IDs and Ranks
     */
    public static void bubbleSortId(Student[] arr) {
        Student temp = new Student(-1, -1);
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr.length-i-1; j++) {

                if (arr[j].getId() > arr[j+1].getId()) {
                    temp.setId(arr[j+1].getId());
                    temp.setRank(arr[j+1].getRank());
                    arr[j+1].setId(arr[j].getId());
                    arr[j+1].setRank(arr[j].getRank());
                    arr[j].setId(temp.getId());
                    arr[j].setRank(temp.getRank());
                }

            }
        }
    }

    /**
     * Insertion Sorts Student Ranks
     *
     * @param arr Array which stores Student IDs and Ranks
     */
    public static void insertionSortRank(Student[] arr) {
        Student temp = new Student(-1, -1);
        for (int i = 1; i < arr.length; i++) {
            temp.setId(arr[i].getId());
            temp.setRank((arr[i].getRank()));
            int j = i;

            while (j > 0 && arr[j-1].getRank() > temp.getRank()) {
                arr[j].setId(arr[j-1].getId());
                arr[j].setRank(arr[j-1].getRank());
                j -= 1;
            }

            arr[j].setId(temp.getId());
            arr[j].setRank(temp.getRank());
        }
    }

    /**
     * Linear Searches Student IDs
     *
     * @param arr Array which stores Student IDs and Ranks
     * @param rank Rank of requested student
     * @return ID of requested student, or -1 if not found
     */
    public static int linearSearchId(Student[] arr, int rank) {
        for (Student i : arr) {
            if (i.getRank() == rank) {
                return i.getId();
            }
        }
        return -1;
    }

    /**
     * Binary Searches Student Ranks
     *
     * @param arr Array which stores Student IDs and Ranks
     * @param id ID of requested student
     * @return Rank of requested student, or -1 if not found
     */
    public static int binarySearchRank(Student[] arr, int id) {
        int lowerBound = 0;
        int upperBound = arr.length-1;
        int mid = (lowerBound + upperBound) / 2;

        while (lowerBound <= upperBound) {
            if (arr[mid].getId() == id) {
                return arr[mid].getRank();
            } else if (arr[mid].getId() < id) {
                lowerBound = mid+1;
            } else if (arr[mid].getId() > id) {
                upperBound = mid-1;
            } else {
                return -1;
            }
            mid = (lowerBound + upperBound) / 2;
        }

        return -1;
    }
}
