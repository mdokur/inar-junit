package week_16.test;

import org.junit.jupiter.api.*;
import week_16.assignments.LoginValidator;
import static org.junit.jupiter.api.Assertions.*;

class LoginValidatorTest {
    @BeforeAll
    static void setUp(){
        System.out.println("Setting up shared resources...");
    }

    @BeforeEach
    void init(){
        System.out.println("Starting a new test...");
    }
    @Test
    public void tc01_01ValidEmailAddress(){
        LoginValidator loginValidatorObj = new LoginValidator();
        assertTrue(loginValidatorObj.validateUsername("mdokur@gmail.com"), "TC_01_01 : Invalid username");
    }

   // @Test
    //public void tc01_02EmailWithout

    @AfterEach
    void tearDown(){
        System.out.println("Cleaning up after a test...");
    }

    @AfterAll
    static void cleanUp(){
        System.out.println("Cleaning up shared resources...");
    }
}