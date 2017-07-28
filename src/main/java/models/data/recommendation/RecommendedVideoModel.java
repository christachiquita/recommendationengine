package models.data.recommendation;

/**
 * Created by christachiquita on 25/07/2017.
 */
public class RecommendedVideoModel {
    private String username;
    private String watchedVideoId;
    private String recommendedVideoId;
    private double userSimilarityScore;
    private double categoryScore;
    private double videoSimilarityScore;
    private double totalScore;
    private int    clickCounter;


}
