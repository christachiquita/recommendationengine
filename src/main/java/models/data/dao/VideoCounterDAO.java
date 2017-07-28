package models.data.dao;

import com.datastax.driver.mapping.annotations.ClusteringColumn;
import com.datastax.driver.mapping.annotations.PartitionKey;
import com.datastax.driver.mapping.annotations.Table;

/**
 * Created by christachiquita on 29/07/2017.
 */
@Table(keyspace = "recommendationengine",
        name = "videocounter",
        caseSensitiveTable = false)
public class VideoCounterDAO {

    public VideoCounterDAO(String category, String videoId, int counter){
        this.category = category;
        this.videoId  = videoId;
        this.counter  = counter;
    }

    @PartitionKey
    private String category;
    @ClusteringColumn
    private String videoId;
    private int    counter;
}
