package use_case.store.context.impl;

import use_case.store.context.IStorageContext;
import use_case.store.strategy.IStorageStrategy;

public class StorageContext implements IStorageContext {
    @Override
    public void storeData(IStorageStrategy iStorageStrategy) {
        iStorageStrategy.storeData();
    }

    @Override
    public void retrieveData(IStorageStrategy iStorageStrategy) {
        iStorageStrategy.retrieveData();
    }
}
