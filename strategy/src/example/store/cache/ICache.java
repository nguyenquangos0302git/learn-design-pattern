package example.store.cache;

import example.store.algorithm.IEvictionAlgo;

public interface ICache {

    void setIEvictionAlgo(IEvictionAlgo iEvictionAlgo);

    void evict();

}
