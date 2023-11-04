package use_case.logger.context;

import use_case.logger.strategy.ILoggerStrategy;

public interface ILoggerContext {

    void log(ILoggerStrategy iLoggerStrategy);

}
