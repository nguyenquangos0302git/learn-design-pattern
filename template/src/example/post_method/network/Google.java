package example.post_method.network;

public class Google extends Network {
    @Override
    protected void logIn() {
        System.out.println("login google");
    }

    @Override
    protected void sendData() {
        System.out.println("google send data");
    }

    @Override
    protected void logOut() {
        System.out.println("logout google");
    }
}
