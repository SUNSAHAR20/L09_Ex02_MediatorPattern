public class SignUpDialogBox {
    private TextBox usernameTextBox = new TextBox();
    private TextBox passwordTextBox = new TextBox();
    private CheckBox termsCheckBox = new CheckBox();
    private Button signUpButton = new Button();

    public SignUpDialogBox() {
        usernameTextBox.addEventHandler(this::controlChanged);
        passwordTextBox.addEventHandler(this::controlChanged);
        termsCheckBox.addEventHandler(this::controlChanged);
    }
    private void controlChanged() {
        signUpButton.setEnabled(isFormValid());
    }
    private boolean isFormValid() {
        return !usernameTextBox.isEmpty() && !passwordTextBox.isEmpty() &&
        termsCheckBox.isChecked();
    }
    public void simulation() {
        System.out.println("Initially: " + signUpButton.isEnabled());

        usernameTextBox.setContent("username");
        System.out.println("Username Entered: " + signUpButton.isEnabled());

        passwordTextBox.setContent("password");
        System.out.println("Password Entered: " + signUpButton.isEnabled());

        termsCheckBox.setChecked(true);
        System.out.println("CheckBox Checked: " + signUpButton.isEnabled());

        passwordTextBox.setContent("");
        System.out.println("Password Cleared: " + signUpButton.isEnabled());

        passwordTextBox.setContent("password");
        System.out.println("Password Entered Again: " + signUpButton.isEnabled());
    }
}
