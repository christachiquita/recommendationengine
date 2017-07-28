package models.data;

import models.data.dao.UserByVideoDAO;

import java.util.Date;
import java.util.List;

/**
 * Created by christachiquita on 25/07/2017.
 */
public class UserByVideo extends UserByVideoDAO {

    public UserByVideo(Date id, String username, String videoId, double totalWatch, double similarity, List<VideosWatched> watchedVideos){
        super(videoId, id, username);
        this.totalWatch    = totalWatch;
        this.similarity    = similarity;
        this.watchedVideos = watchedVideos;
    }

    private double totalWatch;
    private double similarity;
    private List<VideosWatched> watchedVideos;

    public double getTotalWatch() { return this.totalWatch; }

    public double getSimilarity() { return this.similarity; }

    public List<VideosWatched> getWatchedVideos() { return this.watchedVideos; }
}
