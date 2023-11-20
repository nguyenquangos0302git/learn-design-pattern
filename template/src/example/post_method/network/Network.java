package example.post_method.network;

public abstract class Network {

    public final void post() {
        logIn();
        sendData();
        logOut();
    }

    protected abstract void logIn();

    protected abstract void sendData();

    protected abstract void logOut();

}
