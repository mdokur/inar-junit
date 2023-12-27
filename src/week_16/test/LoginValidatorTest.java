package week_16.test;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.NullSource;
import org.junit.jupiter.params.provider.ValueSource;
import week_16.java.LoginValidator;

import static org.junit.jupiter.api.Assertions.*;

class LoginValidatorTest {

    LoginValidator loginValidatorObj = new LoginValidator();

    @BeforeAll
    static void setUp() {
        System.out.println("Setting up shared resources...");
    }

    @BeforeEach
    void init() {
        System.out.println("Starting a new test...");
    }

    @Test
    public void tc16_01ValidEmailAddress() {
        assertTrue(loginValidatorObj.validateUsername("mdokur@gmail.com"), "TC_16_01 : Invalid username");
    }

    @ParameterizedTest
    @ValueSource(strings = {"mdokurgmail.com", "mdokur@", "mdokur/@gmail.com", ""})
    @NullSource
    public void tc16_02EmailInvalid(String email) {
        assertFalse(loginValidatorObj.validateUsername(email), "TC_16_02 : Invalid email");
    }

    @Test
    public void tc16_03ValidPassword() {
        assertTrue(loginValidatorObj.validatePassword("Leuven123!"), "TC_16_03 : Invalid password");
    }

    @ParameterizedTest
    @ValueSource(strings = {"Leuvennn123", "Leuvennn!", "Lev13!", ""})
    @NullSource
    public void tc16_04InvalidPassword(String password) {
        assertFalse(loginValidatorObj.validatePassword(password), "TC_16_04 : Invalid email");
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