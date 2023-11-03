package use_case.security.strategy.impl;

import use_case.security.strategy.IEncryptionStrategy;

public class RSA implements IEncryptionStrategy {

    @Override
    public void encrypt() {
        System.out.println("RSA");
    }

    @Override
    public void decrypt() {
        System.out.println("RSA");
    }

}
