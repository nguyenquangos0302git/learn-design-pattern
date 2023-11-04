package use_case.chatbot.context.impl;

import use_case.chatbot.context.IChatContext;
import use_case.chatbot.strategy.IAnswerStrategy;

public class ChatContext implements IChatContext {
    @Override
    public void getAnswer(IAnswerStrategy iAnswerStrategy) {
        iAnswerStrategy.getAnswer();
    }
}
