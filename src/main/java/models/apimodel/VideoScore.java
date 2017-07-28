package models.apimodel;

import models.resources.Constants;

public class VideoScore {
    public String recommendedVideoId;
    public double totalScore;
    public double userSimilarityScore;
    public double userSimilarityWeight = Constants.RecomendationWeights.USER_SIMILARITY_WEIGHT;
    public double videoSimilarityScore;
    public double videoSimilarityWeight = Constants.RecomendationWeights.VIDEO_SIMILARITY_WEIGHT;
}
