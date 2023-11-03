package use_case.compression.context;

import use_case.compression.strategy.ICompressionStrategy;

public interface ICompressionContext {

    void compress(ICompressionStrategy iCompressionStrategy);

}
