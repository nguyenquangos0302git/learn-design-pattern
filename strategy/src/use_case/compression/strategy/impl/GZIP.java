package use_case.compression.strategy.impl;

import use_case.compression.strategy.ICompressionStrategy;

public class GZIP implements ICompressionStrategy {

    @Override
    public void compress() {
        System.out.println("Gzip");
    }

}
