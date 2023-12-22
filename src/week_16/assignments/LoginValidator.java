package week_16.assignments;

import java.util.regex.Pattern;

public class LoginValidator {
    // Regex pattern for validating email
    private final Pattern emailPattern =
            Pattern.compile("^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$");
    // Regex pattern for validating password
    private final Pattern passwordPattern =
            Pattern.compile("^(?=.*[0-9])(?=.*[!@#$%^&*]).{8,16}$");

    /**
     * Validates if the provided username is in the format of an email
     * address.
     *
     * @param username the username to validate
     * @return true if the username is a valid email address, false
     * otherwise
     */
    public boolean validateUsername(String username) {
        if (username == null || username.trim().isEmpty()) {
            return false;
        }
        return emailPattern.matcher(username).matches();
    }

    /**
     * Validates if the provided password is between 8-16 characters,
     * contains at least one number and one special character.
     *
     * @param password the password to validate
     * @return true if the password meets the criteria, false otherwise
     */
    public boolean validatePassword(String password) {
        if (password == null || password.trim().isEmpty()) {
            return false;
        }
        return passwordPattern.matcher(password).matches();
    }
}

