package data.repository;

import com.datastax.driver.mapping.Mapper;
import data.factory.CassandraConnectionFactory;
import data.repository.primitives.BaseRepository;
import models.data.UserDAO;

import java.util.Collections;
import java.util.List;

/**
 * Created by christachiquita on 21/07/2017.
 */
public class StaffRepository extends BaseRepository {

    public StaffRepository(CassandraConnectionFactory factory) {
        super(factory);
    }

    public List<String> getStaffUsernames(){
        /* TODO : create database, query to return staff usernames */
        Mapper<UserDAO> mapper = this.getMappingManager().mapper(UserDAO.class);
        return Collections.emptyList();
    }
}
