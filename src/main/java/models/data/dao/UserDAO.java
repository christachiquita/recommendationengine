package models.data.dao;

import com.datastax.driver.mapping.annotations.PartitionKey;
import com.datastax.driver.mapping.annotations.Table;

/**
 * Created by christachiquita on 25/07/2017.
 */
@Table(keyspace = "recommendationengine",
        name = "users",
        caseSensitiveTable = false)
public class UserDAO {
    @PartitionKey
    private String username;

    public UserDAO(String username){
        this.username = username;
    }

    public String getUsername(){
        return this.username;
    }

    public void setUsername(String username){
        this.username = username;
    }
}
