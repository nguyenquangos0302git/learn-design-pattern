package use_case.chatbot.context;

import use_case.chatbot.strategy.IAnswerStrategy;

public interface IChatContext {

    void getAnswer(IAnswerStrategy iAnswerStrategy);

}
