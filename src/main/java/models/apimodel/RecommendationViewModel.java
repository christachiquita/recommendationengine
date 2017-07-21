package models.apimodel;

import java.util.List;

/**
 * Created by chris on 21/07/2017.
 */
public class RecommendationViewModel {
    public List<BecauseYouWatch> becauseYouWatchedRecommendations;

    public RecommendationViewModel(List<BecauseYouWatch> recommendations){
        this.becauseYouWatchedRecommendations = recommendations;
    }
}

