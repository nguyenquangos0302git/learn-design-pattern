package use_case.security;

import use_case.security.context.IEncryptionContext;
import use_case.security.context.impl.EncryptionContextImpl;
import use_case.security.strategy.impl.AES;

public class Main {

    public static void main(String[] args) {
        IEncryptionContext iEncryptionContext = new EncryptionContextImpl();
        iEncryptionContext.encrypt(new AES());
        iEncryptionContext.decrypt(new AES());
    }

}
