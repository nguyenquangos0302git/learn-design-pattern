package use_case.store;

import use_case.store.context.IStorageContext;
import use_case.store.context.impl.StorageContext;
import use_case.store.strategy.impl.Cloud;

public class Main {

    public static void main(String[] args) {
        IStorageContext iStorageContext = new StorageContext();
        iStorageContext.storeData(new Cloud());
        iStorageContext.retrieveData(new Cloud());
    }

}
