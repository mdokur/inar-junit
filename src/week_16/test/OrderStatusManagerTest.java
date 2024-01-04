package week_16.test;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import week_16.java.OrderStatusManager;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class OrderStatusManagerTest {
    OrderStatusManager orderStatusManager;

    @BeforeAll
    static void setUp() {
        System.out.println("OrderStatusManagerTest is started");
    }

    @AfterAll
    static void teadDown() {
        System.out.println("OrderStatusManagerTest is finished");
    }

    @BeforeEach
    void testInfoStart() {
        System.out.println("Test started.");
        orderStatusManager = new OrderStatusManager();
    }

    @AfterEach
    void testInfoFinised() {
        System.out.println("Test finished.");
    }

    @ParameterizedTest
    @CsvSource({"NEW,PENDING",
            "PENDING,SHIPPED",
            "SHIPPED,DELIVERED",
            "DELIVERED,DELIVERED",
            "CANCELLED,CANCELLED"})
    void orderStatusManagerTransitionForState(OrderStatusManager.OrderState input, OrderStatusManager.OrderState expected) {
        assertEquals(expected, orderStatusManager.nextState(input), "TC_01 Test OrderStatusManager Class\n" +
                "Rule: Transitions the order to the next state based on the current state.");
    }


    //for Test Cases 6-7-8-9-10
    @ParameterizedTest
    @CsvSource({"NEW,CANCELLED",
            "PENDING,CANCELLED",
            "SHIPPED,SHIPPED",
            "DELIVERED,DELIVERED",
            "CANCELLED,CANCELLED"
    })
    void OrderStatusManagerTransitionCancelState(OrderStatusManager.OrderState input, OrderStatusManager.OrderState expected) {
        assertEquals(expected, orderStatusManager.cancelOrder(input), "TC_02 Test OrderStatusManager Class\n" +
                "Rule:Orders can only be cancelled if they are NEW or PENDING.");
    }
}
