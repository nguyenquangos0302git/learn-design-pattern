package example.one_time_password.template;

public abstract class OTP {

    public final void send() {
        generateOTP();
        saveToCache();
        prepareContext();
        sendNotification();
    }

    private void generateOTP() {
        System.out.println("generate otp");
    }

    private void saveToCache() {
        System.out.println("save to cache");
    }

    protected abstract void prepareContext();

    protected abstract void sendNotification();

}
