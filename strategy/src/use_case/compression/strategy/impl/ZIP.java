package use_case.compression.strategy.impl;

import use_case.compression.strategy.ICompressionStrategy;

public class ZIP implements ICompressionStrategy {

    @Override
    public void compress() {
        System.out.println("Zip");
    }

}
