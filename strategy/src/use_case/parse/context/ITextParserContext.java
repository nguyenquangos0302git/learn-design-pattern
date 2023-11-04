package use_case.parse.context;

import use_case.parse.strategy.ITextParserStrategy;

public interface ITextParserContext {

    void parse(ITextParserStrategy iTextParserStrategy);

}
