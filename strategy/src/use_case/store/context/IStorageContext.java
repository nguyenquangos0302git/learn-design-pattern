package use_case.store.context;

import use_case.store.strategy.IStorageStrategy;

public interface IStorageContext {

    void storeData(IStorageStrategy iStorageStrategy);

    void retrieveData(IStorageStrategy iStorageStrategy);

}
