package example.one_time_password.template;

public class Email extends OTP {
    @Override
    protected void prepareContext() {
        System.out.println("email prepare context");
    }

    @Override
    protected void sendNotification() {
        System.out.println("email send notification");
    }
}
