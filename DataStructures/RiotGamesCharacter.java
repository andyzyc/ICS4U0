/**
 * An abstract class containing the name and loreOrigin fields for any inheriting subclasses
 *
 * @author Andy Chen
 * @version 1.0
 * @since 1.8
 */
public abstract class RiotGamesCharacter {
    protected String name;
    protected String loreRegion;

    /**
     * Constructor method for general information about characters
     *
     * @param name - This is the name of the character
     * @param loreRegion - This is the home region of the character
     */
    public RiotGamesCharacter(String name, String loreRegion) {
        this.name = name;
        this.loreRegion = loreRegion;
    }

    /**
     * Getter for name field
     *
     * @return The name of the object
     */
    public String getName() {
        return name;
    }

    /**
     * Setter for name field
     *
     * @param name This is the name of the object
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Getter for loreRegion field
     *
     * @return The loreRegion of the object
     */
    public String getLoreRegion() {
        return loreRegion;
    }

    /**
     * Setter for loreRegion field
     *
     * @param loreRegion This is the loreRegion of the object
     */
    public void setLoreRegion(String loreRegion) {
        this.loreRegion = loreRegion;
    }
}
