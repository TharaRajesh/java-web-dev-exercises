package org.launchcode.java.exercises.technology;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class Program {

     @Test
    public void testProcessorName() {
        assertEquals("dell",test_computer.getProcessorName());
    }
    Computer test_computer;
     Laptop test_laptop;
     SmartPhone test_smartphone;
    @Before
    public void createComputerObject(){
        test_computer = new Computer(90,158,"dell");
        test_laptop = new Laptop(88,145,"intel",75);
        test_smartphone = new SmartPhone(78,199,"core",150);
    }

    @Test
    public void testMemory() {
        assertEquals(90,test_computer.getMemory());
    }
    @Test
    public void testBatteryStatus(){assertEquals("Battery percentage is 75 Charge your battery",test_laptop.getBatteryStatus());}
    @Test
    public void testTakePhoto(){assertEquals(150,test_smartphone.getNumberOfPic());}
    @Test
    public void testId(){assertTrue("Verification failed: ComputerId and LaptopId are not same.",true);}
}
