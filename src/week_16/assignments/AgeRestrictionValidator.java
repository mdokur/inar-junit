package week_16.assignments;

public class AgeRestrictionValidator {
    private static final int MIN_AGE = 18;
    private static final int MAX_AGE = 65;
    /**
     * Validates if the user's age is within the legal range for
     age-restricted content.
     *
     * @param age the age of the user
     * @return true if the age is within the legal range, false otherwise
     */
    public boolean isEligible(int age) {
        return age >= MIN_AGE && age <= MAX_AGE;
    }
}
