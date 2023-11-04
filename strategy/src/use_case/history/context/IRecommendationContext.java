package use_case.history.context;

import use_case.history.strategy.IRecommendationStrategy;

public interface IRecommendationContext {

    void recommend(IRecommendationStrategy iRecommendationStrategy);

}
