package use_case.security.strategy.impl;

import use_case.security.strategy.IEncryptionStrategy;

public class DES implements IEncryptionStrategy {

    @Override
    public void encrypt() {
        System.out.println("DES");
    }

    @Override
    public void decrypt() {
        System.out.println("DES");
    }

}
