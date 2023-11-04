package use_case.history.context.impl;

import use_case.history.context.IRecommendationContext;
import use_case.history.strategy.IRecommendationStrategy;

public class RecommendationContext implements IRecommendationContext {
    @Override
    public void recommend(IRecommendationStrategy iRecommendationStrategy) {
        iRecommendationStrategy.recommend();
    }
}
