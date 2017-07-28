package models.data.dao;

import com.datastax.driver.mapping.annotations.ClusteringColumn;
import com.datastax.driver.mapping.annotations.PartitionKey;
import com.datastax.driver.mapping.annotations.Table;

import java.util.Date;

/**
 * Created by christachiquita on 29/07/2017.
 */
@Table(keyspace = "recommendationengine",
        name = "migrationtimestamp",
        caseSensitiveTable = false)
public class MigrationTimestampDAO {

    @PartitionKey
    String id;
    @ClusteringColumn
    Date   last;

    public MigrationTimestampDAO(String id, Date last) {
        this.id = id;
        this.last = last;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Date getLast() {
        return last;
    }

    public void setLast(Date last) {
        this.last = last;
    }
}
