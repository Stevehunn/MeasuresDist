package fr.unantes.info.units;

public abstract class Volume extends Quantity {

    protected Volume(double d) {
        super(d);
    }

    /**
     * Convert the volume into a new object containing a quantity expressed in
     * litres.
     */
    public abstract Litre toLitre();

    /**
     * Convert the volume into a new object containing quantity expressed in
     * gallons.
     */
    public abstract Gallon toGallon();

}
