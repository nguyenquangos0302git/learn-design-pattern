package example.store.algorithm.impl;

import example.store.algorithm.IEvictionAlgo;

public class LFU implements IEvictionAlgo {
    @Override
    public void evict() {
        System.out.println("LFU");
    }
}
