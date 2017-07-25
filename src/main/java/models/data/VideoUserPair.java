package models.data;

import java.util.Date;

/**
 * Created by christachiquita on 25/07/2017.
 */
public class VideoUserPair {

    private Date id;
    private String username;
    private String videoId;

    public VideoUserPair(Date id, String username, String videoId){
        this.id       = id;
        this.username = username;
        this.videoId  = videoId;
    }

    public Date getId() { return this.id; }

    public String getUsername() { return this.username; }

    public String getVideoId() { return this.videoId; }
}
