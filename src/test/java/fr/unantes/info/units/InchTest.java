package fr.unantes.info.units;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class InchTest {

    private Inch inch1 = new Inch(1);

    @Test
    public void equals() {
        assertEquals(inch1, inch1);
        assertNotEquals(null, inch1);
        assertNotEquals(this, inch1);
    }

    @Test
    public void testEqualsObject() {
        Inch f1 = new Inch(1.0);
        assertEquals(f1, f1);
        assertNotEquals(null, f1);
    }

    @Test
    public void testToInch() {
        Inch inch = new Inch(1);
        assertEquals(inch, inch1.toInch());
    }
    @Test
    public void testConvertInchToMeter() {
        inch1.toMeter();
    }

    @Test
    public void testConvertInchToFoot() {
        inch1.toFoot();
    }

    @Test
    public void testEqualsInch() {
        Length i1 = new Inch(1);
        Length i2 = new Inch(1);
        assertEquals(i2, i1);
    }

    @Test
    public void testNotEqualsInch() {
        Length i1 = new Inch(1);
        Length i2 = new Inch(2);
        assertNotEquals(i2, i1);
    }

    @Test
    public void testNotNullToMeter(){
        assertNotEquals(inch1.toMeter(),null);
    }

    @Test
    public void testToFootNotNul(){
        Inch nul =new Inch(1);
        nul =null;
        assertNotEquals(nul.toFoot(),1);
        assertEquals(inch1.toFoot(),1);
    }
    @Test
    public void testToMeter() {
        Meter m = new Meter(0.3048);
        assertEquals(inch1.toMeter(), m);
    }
}