package use_case.history;

import use_case.history.context.IRecommendationContext;
import use_case.history.context.impl.RecommendationContext;
import use_case.history.strategy.impl.PurchaseHistoryRecommendation;

public class Main {

    public static void main(String[] args) {
        IRecommendationContext iRecommendationContext = new RecommendationContext();
        iRecommendationContext.recommend(new PurchaseHistoryRecommendation());
    }

}
