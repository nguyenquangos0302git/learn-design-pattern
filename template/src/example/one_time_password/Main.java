package example.one_time_password;

import example.one_time_password.template.Email;
import example.one_time_password.template.OTP;

public class Main {

    public static void main(String[] args) {
        OTP email = new Email();
        email.send();
    }

}
