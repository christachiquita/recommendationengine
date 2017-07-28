package models.apimodel;

import java.util.List;

public class BecauseYouWatch {
    public String           watchedVideoId;
    public List<VideoScore> recommendedVideos;

    public BecauseYouWatch(String trackingCode, List<VideoScore> videos){
        this.watchedVideoId = trackingCode;
        this.recommendedVideos   = videos;
    }
}
