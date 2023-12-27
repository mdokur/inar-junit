package week_16.java;

public class SubscriptionManager {
    // Enums for different options
    public enum SubscriptionTier { FREE, STANDARD, PREMIUM }
    public enum NotificationPreference { EMAIL, SMS, NONE }
    public enum AutoRenewal { ENABLED, DISABLED }
    /**
     * Configures the user's subscription based on the provided options.
     *
     * @param tier The subscription tier.
     * @param notification The notification preference.
     * @param autoRenewal The auto-renewal setting.
     * @return A summary of the subscription configuration.
     */
    public String configureSubscription(SubscriptionTier tier,
                                        NotificationPreference notification, AutoRenewal autoRenewal) {
// Logic to configure the subscription based on the options
        return "Subscription Configured: Tier=" + tier + ", Notification="
                + notification + ", AutoRenewal=" + autoRenewal;
    }
}
