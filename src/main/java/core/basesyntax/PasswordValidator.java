package core.basesyntax;

public class PasswordValidator {
    private static int result = 0;
    public void validate(String password, String repeatPassword) throws PasswordValidationException {
        if (!password.equals(repeatPassword)) {
            if (password.toCharArray().length < 10) {
                throw new PasswordValidationException("Wrong passwords");
            }
        }
    }
}
