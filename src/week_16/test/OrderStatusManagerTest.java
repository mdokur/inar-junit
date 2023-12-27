package week_16.test;

import org.junit.jupiter.api.*;
import week_16.java.OrderStatusManager;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class OrderStatusManagerTest {
    OrderStatusManager orderStatusManager;

    @BeforeAll
    static void setUp(){
        System.out.println("OrderStatusManagerTest is started");
    }

    @AfterAll
    static void teadDown(){
        System.out.println("OrderStatusManagerTest is finished");
    }

    @BeforeEach
    void testInfoStart(){
        System.out.println("Test started.");
        orderStatusManager = new OrderStatusManager();
    }

    @AfterEach
    void testInfoFinised(){
        System.out.println("Test finished.");
    }

    @Test
    void testStateTransitionFromNewToPending(){
       OrderStatusManager.OrderState actual = orderStatusManager.nextState(OrderStatusManager.OrderState.NEW);
        assertEquals(actual, OrderStatusManager.OrderState.PENDING);
    }


}
