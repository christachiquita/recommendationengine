package models.apimodel;

import java.util.List;

public class BecauseYouWatch {
    public String           watchedTrackingCode;
    public List<VideoScore> recommendedVideos;

    public BecauseYouWatch(String trackingCode, List<VideoScore> videos){
        this.watchedTrackingCode = trackingCode;
        this.recommendedVideos   = videos;
    }
}
