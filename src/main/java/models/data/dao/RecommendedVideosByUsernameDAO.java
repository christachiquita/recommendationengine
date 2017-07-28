package models.data.dao;

import com.datastax.driver.mapping.annotations.ClusteringColumn;
import com.datastax.driver.mapping.annotations.PartitionKey;
import com.datastax.driver.mapping.annotations.Table;

/**
 * Created by christachiquita on 29/07/2017.
 */
@Table(keyspace = "recommendationengine",
        name = "recommendedvideos_by_username",
        caseSensitiveTable = false)
public class RecommendedVideosByUsernameDAO {
    @PartitionKey
    private String username;
    @ClusteringColumn(0)
    private double totalscore;
    @ClusteringColumn(1)
    private String watchedvideoid;
    @ClusteringColumn(2)
    private String recommendedvideoid;

    private double categoryscore;
    private int    clickcounter;
    private double usersimilarityscore;
    private double videosimilarityscore;

    public RecommendedVideosByUsernameDAO(String username, double totalscore, String watchedvideoid, String recommendedvideoid,
                                          double categoryscore, int clickcounter, double usersimilarityscore, double videosimilarityscore) {
        this.username = username;
        this.totalscore = totalscore;
        this.watchedvideoid = watchedvideoid;
        this.recommendedvideoid = recommendedvideoid;
        this.categoryscore = categoryscore;
        this.clickcounter = clickcounter;
        this.usersimilarityscore = usersimilarityscore;
        this.videosimilarityscore = videosimilarityscore;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public double getTotalscore() {
        return totalscore;
    }

    public void setTotalscore(double totalscore) {
        this.totalscore = totalscore;
    }

    public String getWatchedvideoid() {
        return watchedvideoid;
    }

    public void setWatchedvideoid(String watchedvideoid) {
        this.watchedvideoid = watchedvideoid;
    }

    public String getRecommendedvideoid() {
        return recommendedvideoid;
    }

    public void setRecommendedvideoid(String recommendedvideoid) {
        this.recommendedvideoid = recommendedvideoid;
    }

    public double getCategoryscore() {
        return categoryscore;
    }

    public void setCategoryscore(double categoryscore) {
        this.categoryscore = categoryscore;
    }

    public int getClickcounter() {
        return clickcounter;
    }

    public void setClickcounter(int clickcounter) {
        this.clickcounter = clickcounter;
    }

    public double getUsersimilarityscore() {
        return usersimilarityscore;
    }

    public void setUsersimilarityscore(double usersimilarityscore) {
        this.usersimilarityscore = usersimilarityscore;
    }

    public double getVideosimilarityscore() {
        return videosimilarityscore;
    }

    public void setVideosimilarityscore(double videosimilarityscore) {
        this.videosimilarityscore = videosimilarityscore;
    }
}
