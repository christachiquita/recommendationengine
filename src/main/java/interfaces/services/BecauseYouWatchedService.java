package interfaces.services;

import models.apimodel.RecommendationViewModel;

/**
 * Created by christachiquita on 22/07/2017.
 */
public interface BecauseYouWatchedService {

    RecommendationViewModel getRecommendations(String username);
}
