package example.post_method;

import example.post_method.test.Test;
import example.post_method.test.Tiger;

public class Main {

    public static void main(String[] args) {
        Tiger tiger1 = new Tiger("1");
        Tiger tiger2 = new Tiger("1");
        System.out.println(tiger1.equals(tiger2));
    }

}
