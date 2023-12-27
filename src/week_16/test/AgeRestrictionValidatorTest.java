package week_16.test;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import week_16.java.AgeRestrictionValidator;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class AgeRestrictionValidatorTest {

    AgeRestrictionValidator ageRestrictionValidatorObj = new AgeRestrictionValidator();

    @BeforeAll
    static void setUp() {
        System.out.println("Setting up shared resources...");
    }

    @BeforeEach
    void init() {
        System.out.println("Starting a new test...");
    }

    @ParameterizedTest
    @ValueSource(ints = {18, 19, 64, 65})
    public void tc_16_01ValidAge(int age) {
        assertTrue(ageRestrictionValidatorObj.isEligible(age));
    }

    @ParameterizedTest
    @ValueSource(ints = {17, 66, 0, 100})
    public void tc_16_01InvalidAge(int age) {
        assertFalse(ageRestrictionValidatorObj.isEligible(age));
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
