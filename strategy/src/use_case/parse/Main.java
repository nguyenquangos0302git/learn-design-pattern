package use_case.parse;

import use_case.parse.context.ITextParserContext;
import use_case.parse.context.impl.TextParserContext;
import use_case.parse.strategy.impl.CSVParser;

public class Main {

    public static void main(String[] args) {
        ITextParserContext iTextParserContext = new TextParserContext();
        iTextParserContext.parse(new CSVParser());
    }

}
