package models.data.dao;

import com.datastax.driver.mapping.annotations.ClusteringColumn;
import com.datastax.driver.mapping.annotations.PartitionKey;
import com.datastax.driver.mapping.annotations.Table;

import java.util.Date;

/**
 * Created by christachiquita on 29/07/2017.
 */
@Table(keyspace = "recommendationengine",
        name = "userbyvideo",
        caseSensitiveTable = false)
public class UserByVideoDAO {
    @PartitionKey
    private String videoid;
    @ClusteringColumn(0)
    private Date id;
    @ClusteringColumn(1)
    private String username;

    public UserByVideoDAO(String videoid, Date id, String usernamae){
        this.videoid = videoid;
        this.id      = id;
        this.username = username;
    }

    public void setVideoId(String videoid){
        this.videoid = videoid;
    }

    public void setId(Date id){
        this.id = id;
    }

    public void setUsername(String username){
        this.username = username;
    }

    public String getVideoid() { return this.videoid; }

    public Date getId() { return this.id; }

    public String getUsername() { return this.username; }
}
