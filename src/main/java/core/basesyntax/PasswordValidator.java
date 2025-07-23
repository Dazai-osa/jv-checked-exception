package core.basesyntax;

public class PasswordValidator {
    private static int result = 0;
    public void validate(String password, String repeatPassword) {
        if (password.equals(repeatPassword)) {
            if (password.toCharArray().length >= 10) {
                try {
                    throw new PasswordValidationException("Wrong passwords");
                } catch (PasswordValidationException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
