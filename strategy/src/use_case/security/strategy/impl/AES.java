package use_case.security.strategy.impl;

import use_case.security.strategy.IEncryptionStrategy;

public class AES implements IEncryptionStrategy {

    @Override
    public void encrypt() {
        System.out.println("AES");
    }

    @Override
    public void decrypt() {
        System.out.println("AES");
    }

}
