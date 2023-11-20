package example.one_time_password.template;

public class SMS extends OTP {
    @Override
    protected void prepareContext() {
        System.out.println("sms prepare context");
    }

    @Override
    protected void sendNotification() {
        System.out.println("sms send notification");
    }
}
