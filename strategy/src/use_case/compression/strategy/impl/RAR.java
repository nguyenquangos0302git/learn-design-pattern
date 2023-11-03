package use_case.compression.strategy.impl;

import use_case.compression.strategy.ICompressionStrategy;

public class RAR implements ICompressionStrategy {

    @Override
    public void compress() {
        System.out.println("Rar");
    }

}
