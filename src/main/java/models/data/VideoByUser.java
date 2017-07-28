package models.data;

import models.data.dao.VideoByUserDAO;
import models.data.recommendation.ScoredRecommendedVideo;

import java.util.Date;
import java.util.List;

/**
 * Created by christachiquita on 25/07/2017.
 */
public class VideoByUser extends VideoByUserDAO{

    public VideoByUser(Date id, String username, String videoId, List<ScoredRecommendedVideo> videos) {
        super(videoId, id, username);
        this.recommendedVideos = videos;
    }

    private List<ScoredRecommendedVideo> recommendedVideos;

    public List<ScoredRecommendedVideo> getRecommendedVideos() { return this.recommendedVideos; }

    public void setRecommendedVideos(List<ScoredRecommendedVideo> videos) { this.recommendedVideos = videos; }
}
