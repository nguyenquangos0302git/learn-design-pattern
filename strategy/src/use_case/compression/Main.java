package use_case.compression;

import use_case.compression.context.ICompressionContext;
import use_case.compression.context.impl.CompressionContextImpl;
import use_case.compression.strategy.impl.RAR;

public class Main {

    public static void main(String[] args) {
        ICompressionContext iCompressionContext = new CompressionContextImpl();
        iCompressionContext.compress(new RAR());
    }

}
