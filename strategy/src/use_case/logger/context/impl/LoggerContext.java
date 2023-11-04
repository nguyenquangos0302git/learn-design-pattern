package use_case.logger.context.impl;

import use_case.logger.context.ILoggerContext;
import use_case.logger.strategy.ILoggerStrategy;

public class LoggerContext implements ILoggerContext {
    @Override
    public void log(ILoggerStrategy iLoggerStrategy) {
        iLoggerStrategy.log();
    }
}
