package use_case.security.context.impl;

import use_case.security.context.IEncryptionContext;
import use_case.security.strategy.IEncryptionStrategy;

public class EncryptionContextImpl implements IEncryptionContext {


    @Override
    public void encrypt(IEncryptionStrategy iEncryptionStrategy) {
        iEncryptionStrategy.encrypt();
    }

    @Override
    public void decrypt(IEncryptionStrategy iEncryptionStrategy) {
        iEncryptionStrategy.decrypt();
    }
}
