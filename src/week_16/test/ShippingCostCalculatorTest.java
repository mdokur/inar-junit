package week_16.test;

import org.junit.jupiter.api.*;
import week_16.java.ShippingCostCalculator;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ShippingCostCalculatorTest {

    ShippingCostCalculator shippingCostCalculatorObj = new ShippingCostCalculator();

    @BeforeAll
    static void setUp() {
        System.out.println("Setting up shared resources...");
    }

    @BeforeEach
    void init() {
        System.out.println("Starting a new test...");
    }

    @Test
    public void tc_16_01LocalDestinationStandardDelivery() {
        double actual = shippingCostCalculatorObj.calculateCost(10, "Local", "Standard");
        assertEquals(10, actual, "TC_16_01 Invalid shipping");
    }

    @Test
    public void tc_16_02LocalDestinationExpressDelivery() {
        double actual = shippingCostCalculatorObj.calculateCost(10, "Local", "Express");
        assertEquals(25, actual, "TC_16_02 Invalid shipping");
    }

    @Test
    public void tc_16_03InternationalDestinationStandardDelivery() {
        double actual = shippingCostCalculatorObj.calculateCost(10, "International", "Standard");
        assertEquals(50, actual, "TC_16_03 Invalid shipping");
    }

    @Test
    public void tc_16_04InternationalDestinationExpressDelivery() {
        double actual = shippingCostCalculatorObj.calculateCost(10, "International", "Express");
        assertEquals(125, actual, "TC_16_04 Invalid shipping");
    }

    @Test
    public void tc_16_05ZeroWeightLocalStandardDelivery() {
        double actual = shippingCostCalculatorObj.calculateCost(0, "Local", "Standard");
        assertEquals(0, actual, "TC_16_05 Invalid shipping");
    }

    @Test
    public void tc_16_06ZeroWeightLocalExpressDelivery() {
        double actual = shippingCostCalculatorObj.calculateCost(0, "Local", "Express");
        assertEquals(0, actual, "TC_16_06 Invalid shipping");
    }

    @Test
    public void tc_16_07ZeroWeightInternationalStandardDelivery() {
        double actual = shippingCostCalculatorObj.calculateCost(0, "International", "Standard");
        assertEquals(0, actual, "TC_16_07 Invalid shipping");
    }

    @Test
    public void tc_16_08ZeroWeightInternationalExpressDelivery() {
        double actual = shippingCostCalculatorObj.calculateCost(0, "International", "Express");
        assertEquals(0, actual, "TC_16_08 Invalid shipping");
    }

    @Test
    public void tc_16_09NegativeWeightLocalStandardDelivery() {
        double actual = shippingCostCalculatorObj.calculateCost(-1, "Local", "Standard");
        assertEquals(-1, actual, "TC_16_05 Invalid shipping");
    }

    @Test
    public void tc_16_10NegativeWeightLocalExpressDelivery() {
        double actual = shippingCostCalculatorObj.calculateCost(-1, "Local", "Express");
        assertEquals(-2.5, actual, "TC_16_06 Invalid shipping");
    }

    @Test
    public void tc_16_11NegativeWeightInternationalStandardDelivery() {
        double actual = shippingCostCalculatorObj.calculateCost(-1, "International", "Standard");
        assertEquals(-5, actual, "TC_16_07 Invalid shipping");
    }

    @Test
    public void tc_16_12NegativeWeightInternationalExpressDelivery() {
        double actual = shippingCostCalculatorObj.calculateCost(-1, "International", "Express");
        assertEquals(-12.5, actual, "TC_16_08 Invalid shipping");
    }

    @AfterEach
    void tearDown() {
        System.out.println("Cleaning up after a test...");
    }

    @AfterAll
    static void cleanUp() {
        System.out.println("Cleaning up shared resources...");
    }
}
