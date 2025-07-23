package core.basesyntax;

public class UserService {
    public void registerUser(User user) {
        PasswordValidator passwordValidator = new PasswordValidator();
        passwordValidator.validate("qweasdzxc", "qweasdzxc");
        try {
            throw new PasswordValidationException("Your passwords are incorrect. Try again.");
        } catch (PasswordValidationException e) {
            throw new RuntimeException(e);
        }
    }

    public void saveUser(User user) {
        System.out.println("User " + user.toString() + " was saved to database!!!");
    }
}
