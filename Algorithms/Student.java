/**
 * Class for Student IDs and Ranks
 *
 * @author Andy Chen
 * @version 1.0
 * @since 1.8
 */
public class Student implements Comparable<Student> {
    private int id;
    private int rank;

    /**
     * Constructor for ID and Rank
     * @param id Student ID
     * @param rank Student Rank
     */
    public Student(int id, int rank) {
        this.id = id;
        this.rank = rank;
    }

    /**
     * Getter for id field
     *
     * @return This student's id
     */
    public int getId() {
        return id;
    }

    /**
     * Setter for id field
     *
     * @param id This student's id
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Getter for rank field
     *
     * @return This student's rank
     */
    public int getRank() {
        return rank;
    }

    /**
     * Setter for rank field
     *
     * @param rank This student's rank
     */
    public void setRank(int rank) {
        this.rank = rank;
    }

    /**
     * Converts the hashcode value into a string representation
     *
     * @return The string representation of the object
     */
    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ",rank=" + rank +
                '}';
    }

    /**
     * Compares this object with the specified object for sorting and order
     *
     * @param o This is the object to be compared
     * @return A negative, zero, or positive integer, whether this object is less than, equal to, or greater than the specified object o, respectively
     */
    public int compareTo(Student o) {
        return this.rank - o.rank;
    }
}
