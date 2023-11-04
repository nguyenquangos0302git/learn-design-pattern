package use_case.chatbot;

import use_case.chatbot.context.IChatContext;
import use_case.chatbot.context.impl.ChatContext;
import use_case.chatbot.strategy.impl.MLStrategy;

public class Main {

    public static void main(String[] args) {
        IChatContext iChatContext = new ChatContext();
        iChatContext.getAnswer(new MLStrategy());
    }

}
