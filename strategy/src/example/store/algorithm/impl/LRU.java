package example.store.algorithm.impl;

import example.store.algorithm.IEvictionAlgo;

public class LRU implements IEvictionAlgo {

    @Override
    public void evict() {
        System.out.println("LRU");
    }

}
