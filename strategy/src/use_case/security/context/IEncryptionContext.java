package use_case.security.context;

import use_case.security.strategy.IEncryptionStrategy;

public interface IEncryptionContext {

    void encrypt(IEncryptionStrategy iEncryptionStrategy);

    void decrypt(IEncryptionStrategy iEncryptionStrategy);

}
