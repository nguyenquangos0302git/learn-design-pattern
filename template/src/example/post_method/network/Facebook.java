package example.post_method.network;

public class Facebook extends Network {
    @Override
    protected void logIn() {
        System.out.println("login facebook");
    }

    @Override
    protected void sendData() {
        System.out.println("facebook send data");
    }

    @Override
    protected void logOut() {
        System.out.println("logout facebook");
    }
}
