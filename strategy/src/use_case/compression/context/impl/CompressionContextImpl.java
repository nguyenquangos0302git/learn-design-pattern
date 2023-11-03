package use_case.compression.context.impl;

import use_case.compression.context.ICompressionContext;
import use_case.compression.strategy.ICompressionStrategy;

public class CompressionContextImpl implements ICompressionContext {

    @Override
    public void compress(ICompressionStrategy iCompressionStrategy) {
        iCompressionStrategy.compress();
    }

}
