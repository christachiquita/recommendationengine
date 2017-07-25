package models.data;

import models.data.recommendation.ScoredRecommendedVideo;

import java.util.Date;
import java.util.List;

/**
 * Created by christachiquita on 25/07/2017.
 */
public class VideoByUser extends VideoUserPair {

    private List<ScoredRecommendedVideo> recommendedVideos;

    public VideoByUser(Date id, String username, String videoId, List<ScoredRecommendedVideo> videos) {
        super(id, username, videoId);
        this.recommendedVideos = videos;
    }

    public List<ScoredRecommendedVideo> getRecommendedVideos() { return this.recommendedVideos; }

    public void setRecommendedVideos(List<ScoredRecommendedVideo> videos) { this.recommendedVideos = videos; }
}
