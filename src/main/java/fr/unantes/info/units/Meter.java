package fr.unantes.info.units;

/**
 * A length quantity measured in meters.
 */
public class Meter extends Length {

	/**
	 * Create a length measured in meters.
	 */
	public Meter(double i) {
		super(i);
	}

	@Override
	public Foot toFoot() {
		return new Foot(1);
	}

	@Override
	public Inch toInch() {
		return new Inch(12);
	}

	@Override
	public Meter toMeter() {
		return this;
	}

	/**
	 * Return true if the other object is measured in Meter and with the same value.
	 */
	@Override
	public boolean equals(Object o) {
		return super.equals(o) && (o instanceof Meter);
	}

	/**
	 * Create a new Meter quantity, which is the sum of this one and of the one in
	 * parameter.
	 */
	public Meter add(Meter other) {
		return new Meter(this.val + this.val);
	}
}
