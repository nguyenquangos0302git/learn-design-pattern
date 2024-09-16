package example.post_method;

import example.post_method.network.Facebook;
import example.post_method.network.Google;
import example.post_method.network.Network;

public class Main {

    public static void main(String[] args) {
        Network google = new Google();
        google.post();

        Network facebook = new Facebook();
        facebook.post();
    }

}
