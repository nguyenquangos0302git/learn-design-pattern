package example.store.cache.impl;

import example.store.algorithm.IEvictionAlgo;
import example.store.cache.ICache;

public class Cache implements ICache {

    private IEvictionAlgo iEvictionAlgo;

    @Override
    public void setIEvictionAlgo(IEvictionAlgo iEvictionAlgo) {
        this.iEvictionAlgo = iEvictionAlgo;
    }

    @Override
    public void evict() {
        iEvictionAlgo.evict();
    }
}
