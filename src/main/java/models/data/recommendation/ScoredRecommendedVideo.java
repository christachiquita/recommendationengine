package models.data.recommendation;

import models.resources.Constants;

/**
 * Created by christachiquita on 25/07/2017.
 */
public class ScoredRecommendedVideo {
    public String videoId;
    public double userSimilarityScore;
    public double categoryScore;
    public double videoSimilarityScore;
    public double totalScore;
    public boolean isNewDiscovered;

    public  ScoredRecommendedVideo(String videoId, double userScore, double categoryScore, double videoScore, boolean isNew){
        this.videoId              = videoId;
        this.userSimilarityScore  = userScore;
        this.categoryScore        = categoryScore;
        this.videoSimilarityScore = videoScore;
        this.totalScore           =
                Constants.RecomendationWeights.USER_SIMILARITY_WEIGHT * userSimilarityScore +
                Constants.RecomendationWeights.CATEGORY_WEIGHT * categoryScore +
                Constants.RecomendationWeights.VIDEO_SIMILARITY_WEIGHT * videoSimilarityScore;
        this.isNewDiscovered      = isNew;
    }
}
