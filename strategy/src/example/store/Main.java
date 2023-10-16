package example.store;

import example.store.algorithm.IEvictionAlgo;
import example.store.algorithm.impl.FIFO;
import example.store.algorithm.impl.LFU;
import example.store.algorithm.impl.LRU;
import example.store.cache.ICache;
import example.store.cache.impl.Cache;

public class Main {

    public static void main(String[] args) {
        String cacheType = "FIFO";
        cacheProcess(cacheType);
    }

    private static void cacheProcess(String cacheType) {
        ICache iCache = new Cache();
        IEvictionAlgo iEvictionAlgo = new FIFO();

        if ("LFU".equalsIgnoreCase(cacheType)) {
            iEvictionAlgo = new LFU();
        } else if ("LRU".equalsIgnoreCase(cacheType)) {
            iEvictionAlgo = new LRU();
        }

        iCache.setIEvictionAlgo(iEvictionAlgo);
        iCache.evict();
    }

}
