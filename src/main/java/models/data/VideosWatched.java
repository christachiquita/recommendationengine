package models.data;

import java.util.Date;
import java.util.List;

/**
 * Created by christachiquita on 25/07/2017.
 */
public class VideosWatched {
    private String videoId;
    private List<Date> watchedAt;

    public VideosWatched(String videoId, List<Date> watchedAt){
        this.videoId   = videoId;
        this.watchedAt = watchedAt;
    }

    public String getVideoId()       { return this.videoId; }
    public List<Date> getWatchedAt() { return this.watchedAt; }
}
