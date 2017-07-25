package data.repository.primitives;

import com.datastax.driver.core.Session;
import com.datastax.driver.mapping.MappingManager;
import data.factory.CassandraConnectionFactory;

/**
 * Created by christachiquita on 22/07/2017.
 */
public class BaseRepository {

    private Session                    session;
    private MappingManager             mappingManager;
    private CassandraConnectionFactory factory;

    public BaseRepository(CassandraConnectionFactory factory){
        this.factory        = factory;
        this.session        = this.factory.getSession();
        this.mappingManager = new MappingManager(this.session);
    }

    public MappingManager getMappingManager(){
        return this.mappingManager;
    }
}
