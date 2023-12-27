package week_16.test;

import org.junit.jupiter.api.*;
import week_16.java.SubscriptionManager;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SubscriptionManagerTest {
    SubscriptionManager test;

    @BeforeAll
    static void start() {
        System.out.println("Test started");
    }

    @AfterAll
    static void finish() {
        System.out.println("Test finished");
    }

    @BeforeEach
    void createObject() {
        test = new SubscriptionManager();
        System.out.println("Object is created");
    }

    @AfterEach
    void assignObjectToNull() {
        test = null;
        System.out.println("Object assigned to null");
    }

    @Test
    public void testFreeTierEmailNotificationsEnabledAutoRenewal() {
        String result = test.configureSubscription(SubscriptionManager.SubscriptionTier.FREE,
                SubscriptionManager.NotificationPreference.EMAIL, SubscriptionManager.AutoRenewal.ENABLED);
        assertEquals(result, "Subscription Configured: Tier=" + SubscriptionManager.SubscriptionTier.FREE + ", Notification=" +
                        SubscriptionManager.NotificationPreference.EMAIL + ", AutoRenewal=" + SubscriptionManager.AutoRenewal.ENABLED,
                "The message is not as expected TC_01 has failed");
    }

    @Test
    public void testStandardTierSmsNotificationsDisabled() {
        String result = test.configureSubscription(SubscriptionManager.SubscriptionTier.STANDARD,
                SubscriptionManager.NotificationPreference.SMS, SubscriptionManager.AutoRenewal.DISABLED);
        assertEquals(result, "Subscription Configured: Tier=" + SubscriptionManager.SubscriptionTier.STANDARD + ", Notification=" +
                        SubscriptionManager.NotificationPreference.SMS + ", AutoRenewal=" + SubscriptionManager.AutoRenewal.DISABLED,
                "The message is not as expected TC_02 has failed");
    }

    @Test
    public void testPremiumTierNoneNotificationsDisabled() {
        String result = test.configureSubscription(SubscriptionManager.SubscriptionTier.PREMIUM,
                SubscriptionManager.NotificationPreference.NONE, SubscriptionManager.AutoRenewal.DISABLED);
        assertEquals(result, "Subscription Configured: Tier=" + SubscriptionManager.SubscriptionTier.PREMIUM + ", Notification=" +
                        SubscriptionManager.NotificationPreference.NONE + ", AutoRenewal=" + SubscriptionManager.AutoRenewal.DISABLED,
                "The message is not as expected TC_03 has failed");
    }

    @Test
    public void testFreeTierSmsNotificationsEnabled() {
        String result = test.configureSubscription(SubscriptionManager.SubscriptionTier.FREE,
                SubscriptionManager.NotificationPreference.SMS, SubscriptionManager.AutoRenewal.ENABLED);
        assertEquals(result, "Subscription Configured: Tier=" + SubscriptionManager.SubscriptionTier.FREE + ", Notification=" +
                        SubscriptionManager.NotificationPreference.SMS + ", AutoRenewal=" + SubscriptionManager.AutoRenewal.ENABLED,
                "The message is not as expected TC_04 has failed");
    }

    @Test
    public void testStandardTierEmailNotificationsEnabled() {
        String result = test.configureSubscription(SubscriptionManager.SubscriptionTier.STANDARD,
                SubscriptionManager.NotificationPreference.EMAIL, SubscriptionManager.AutoRenewal.ENABLED);
        assertEquals(result, "Subscription Configured: Tier=" + SubscriptionManager.SubscriptionTier.STANDARD + ", Notification=" +
                        SubscriptionManager.NotificationPreference.EMAIL + ", AutoRenewal=" + SubscriptionManager.AutoRenewal.ENABLED,
                "The message is not as expected TC_05 has failed");
    }

    @Test
    public void testPremiumTierSmsNotificationsDisabled() {
        String result = test.configureSubscription(SubscriptionManager.SubscriptionTier.PREMIUM,
                SubscriptionManager.NotificationPreference.SMS, SubscriptionManager.AutoRenewal.DISABLED);
        assertEquals(result, "Subscription Configured: Tier=" + SubscriptionManager.SubscriptionTier.PREMIUM + ", Notification=" +
                        SubscriptionManager.NotificationPreference.SMS + ", AutoRenewal=" + SubscriptionManager.AutoRenewal.DISABLED,
                "The message is not as expected TC_06 has failed");
    }
}
