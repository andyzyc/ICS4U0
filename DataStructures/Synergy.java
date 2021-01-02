/**
 * A class containing the traitOrigin and traitClass of a TftPiece's Synergy
 *
 * @author Andy Chen
 * @version 1.0
 * @since 1.8
 */
public class Synergy {
    private String traitOrigin;
    private String traitClass;

    /**
     * Constructor method for synergies of new tftpieces
     *
     * @param traitOrigin - This is the origin trait of a tftpiece
     * @param traitClass - This is the class trait of a tftpiece
     */
    public Synergy(String traitOrigin, String traitClass) {
        this.traitOrigin = traitOrigin;
        this.traitClass = traitClass;
    }

    /**
     * Converts the hashcode value into a string representation
     *
     * @return The string representation of the object
     */
    @Override
    public String toString() {
        return "origin: " + this.traitOrigin + ", class: " + this.traitClass;
    }

    /**
     * Getter for traitOrigin field
     *
     * @return The traitOrigin of the object
     */
    public String getTraitOrigin() {
        return traitOrigin;
    }

    /**
     * Setter for traitOrigin field
     *
     * @param traitOrigin This is the traitOrigin of the object
     */
    public void setTraitOrigin(String traitOrigin) {
        this.traitOrigin = traitOrigin;
    }

    /**
     * Getter for traitClass field
     *
     * @return The traitClass of the object
     */
    public String getTraitClass() {
        return traitClass;
    }

    /**
     * Setter for traitClass field
     *
     * @param traitClass This is the traitClass of the object
     */
    public void setTraitClass(String traitClass) {
        this.traitClass = traitClass;
    }
}
