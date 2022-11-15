package fr.unantes.info.units;

/**
 * A length quantity measured in feet.
 */
public class Foot extends Length {

	/**
	 * Create a length measured in feet.
	 */
	public Foot(double i) {
		super(i);
	}

	@Override
	public Meter toMeter() {
		return new Meter(0.3048);
	}

	@Override
	public Inch toInch() {
		return new Inch(12);
	}

	@Override
	public Foot toFoot() {
		return this;
	}

	/**
	 * Return true if the other object is measured in Foot and with the same value.
	 */
	@Override
	public boolean equals(Object o) {
		return super.equals(o) && (o instanceof Foot);
	}

}
