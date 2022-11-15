package fr.unantes.info.units;

/**
 * A physical quantity.
 */
public abstract class Quantity {

    protected final double val;

    protected Quantity(double d) {
        val = d;
    }

    /**
     * Retrieve the numerical value of the quantity.
     */
    public double getValue() {
        return val;
    }

    /**
     * Return true if the other objet is a quantity of the same value.
     */
    @Override
    public boolean equals(Object o) {
        if (o == null) {
            return false;
        }

        if (!(o instanceof Quantity)) {
            return false;
        }

        Quantity other = (Quantity) o;
        return other.val == this.val;
    }

}
