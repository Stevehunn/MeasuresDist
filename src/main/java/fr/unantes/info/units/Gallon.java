package fr.unantes.info.units;

/**
 * A volume quantity measured in gallons.
 */
public class Gallon extends Volume {

	/**
	 * Create a volume measured in gallons.
	 */
	public Gallon(double d) {
		super(d);
	}

	@Override
	public Litre toLitre() {
		return new Litre(4.546);
	}

	@Override
	public Gallon toGallon() {
		return this;
	}

	/**
	 * Return true if the other object is measured in Gallon and with the same
	 * value.
	 */
	@Override
	public boolean equals(Object o) {
		return super.equals(o) && (o instanceof Gallon);
	}

}
