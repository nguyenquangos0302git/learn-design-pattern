package use_case.logger;

import use_case.logger.context.ILoggerContext;
import use_case.logger.context.impl.LoggerContext;
import use_case.logger.strategy.impl.ConsoleLogger;

public class Main {

    public static void main(String[] args) {
        ILoggerContext iLoggerContext = new LoggerContext();
        iLoggerContext.log(new ConsoleLogger());
    }

}
