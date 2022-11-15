package fr.unantes.info.units;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class QuantityTest {

    @Test
    public void testEquals(){
        Object test =new Object();
        Object test1 =new Object();
        test1 = null;
        assertEquals(test.equals(test1),false);

    }
}
