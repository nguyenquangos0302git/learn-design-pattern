package example.store.algorithm.impl;

import example.store.algorithm.IEvictionAlgo;

public class FIFO implements IEvictionAlgo {
    @Override
    public void evict() {
        System.out.println("FIFO");
    }
}
