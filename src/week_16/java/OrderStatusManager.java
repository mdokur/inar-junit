package week_16.java;

public class OrderStatusManager {
    public enum OrderState {
        NEW, PENDING, SHIPPED, DELIVERED, CANCELLED
    }
    /**
     * Transitions the order to the next state based on the current state.
     *
     * @param currentState The current state of the order.
     * @return The next state of the order.
     */
    public OrderState nextState(OrderState currentState) {
        switch (currentState) {
            case NEW:
                return OrderState.PENDING;
            case PENDING:
                return OrderState.SHIPPED;
            case SHIPPED:
                return OrderState.DELIVERED;
// Delivered and Cancelled are final states and cannot be transitioned from.

            case DELIVERED:
            case CANCELLED:
            default:
                return currentState;
        }
    }
    OrderState currentState;
    public OrderState getCurrentState() {
        return currentState;
    }
    /**
     * Cancels the order if it is in a state that allows for cancellation.
     *
     * @param currentState The current state of the order.
     * @return The new state of the order after attempting cancellation.
     */
    public OrderState cancelOrder(OrderState currentState) {
// Orders can only be cancelled if they are NEW or PENDING.
        if (currentState == OrderState.NEW || currentState == OrderState.PENDING) {
            return OrderState.CANCELLED;
        } else {
// If the order is SHIPPED or beyond, it cannot be cancelled.
            return currentState;
        }
    }
}