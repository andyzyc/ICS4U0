import java.util.Arrays;

/**
 * A class containing the various fields of a tftpiece
 *
 * @author Andy Chen
 * @version 1.0
 * @since 1.8
 */
public class TftPiece extends RiotGamesCharacter implements Comparable<TftPiece> {
    private int cost;
    private Synergy synergies;
    private int starLevel;
    private boolean chosen;
    private String[] items;

    /**
     * Constructor method containing various general information on a tftpiece object
     *
     * @param name - This is the name of the tftpiece, inherited from superclass RiotGamesCharacter
     * @param loreOrigin - This is the home region of the tftpiece, inherited from superclass RiotGamesCharacter
     * @param cost - This is the cost of a basic 1 star version of the tftpiece
     * @param synergies - These are the synergies that the tftpiece has
     * @param starLevel - This is the star level of the current tftpiece
     * @param chosen - This indicates whether the tftpiece is a chosen or not
     * @param items - This indicates any items that the tftpiece is currently holding, up to 6
     */
    public TftPiece(String name, String loreOrigin, int cost, Synergy synergies, int starLevel, boolean chosen, String[] items) {
        super(name, loreOrigin);
        this.cost = cost;
        this.synergies = synergies;
        this.starLevel = starLevel;
        this.chosen = chosen;
        this.items = new String[6];
    }

    /**
     * Getter for cost field
     *
     * @return The cost of the object
     */
    public int getCost() {
        return cost;
    }

    /**
     * Setter for cost field
     *
     * @param cost This is the cost of the object
     */
    public void setCost(int cost) {
        this.cost = cost;
    }

    /**
     * Getter for synergies field
     *
     * @return The synergies of the object
     */
    public Synergy getSynergies() {
        return synergies;
    }

    /**
     * Setter for synergies field
     *
     * @param synergies These are the synergies of the object
     */
    public void setSynergies(Synergy synergies) {
        this.synergies = synergies;
    }

    /**
     * Getter for starLevel field
     *
     * @return The starLevel of the object
     */
    public int getStarLevel() {
        return starLevel;
    }

    /**
     * Setter for starLevel field
     *
     * @param starLevel This is the starLevel of the object
     */
    public void setStarLevel(int starLevel) {
        this.starLevel = starLevel;
    }

    /**
     * Getter for chosen field
     *
     * @return Whether the object is chosen or not
     */
    public boolean isChosen() {
        return chosen;
    }

    /**
     * Setter for chosen field
     *
     * @param chosen This determines whether the object is a chosen or not
     */
    public void setChosen(boolean chosen) {
        this.chosen = chosen;
    }

    /**
     * Getter for items field
     *
     * @return The items of the object
     */
    public String[] getItems() {
        return items;
    }

    /**
     * Getter for specific index for items field
     *
     * @param index This is the specified index
     * @return The item of the object's specified index
     */
    public String getItem(int index) {
        return items[index];
    }

    /**
     * Setter for item field, will not set more than 6 items
     *
     * @param item This is an item of the object
     */
    public void setItem(String item) {
        for (int i = 0; i < this.getItems().length; i++) {
            if (this.getItem(i) == null) {
                this.items[i] = item;
            }
        }
    }

    /**
     * Converts the hashcode value into a string representation
     *
     * @return The string representation of the object
     */
    @Override
    public String toString() {
        return "TftPiece{" +
                "cost=" + cost +
                ", synergies=" + synergies +
                ", starLevel=" + starLevel +
                ", chosen=" + chosen +
                ", items=" + Arrays.toString(items) +
                ", name='" + name + '\'' +
                ", loreRegion='" + loreRegion + '\'' +
                '}';
    }

    /**
     * Compares this object with the specified object for sorting and order
     *
     * @param o This is the object to be compared
     * @return A negative, zero, or positive integer, whether this object is less than, equal to, or greater than the specified object o, respectively
     */
    public int compareTo(TftPiece o) {
        return this.cost - o.cost;
    }
}
