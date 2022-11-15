package fr.unantes.info.units;

/**
 * A length quantity, without any unit.
 */
public abstract class Length extends Quantity {

	protected Length(double d) {
		super(d);
	}

	/**
	 * Convert the length into a new object containing a quantity expressed in feet.
	 */
	public abstract Foot toFoot();

	/**
	 * Convert the length into a new object containing a quantity expressed in
	 * meters.
	 */
	public abstract Meter toMeter();

	/**
	 * Convert the length into a new object containing a quantity expressed in
	 * inches.
	 */
	public abstract Inch toInch();

}
