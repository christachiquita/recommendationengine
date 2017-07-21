package interfaces.data.factory;

import com.datastax.driver.core.*;

/**
 * Created by christachiquita on 21/07/2017.
 */

public interface ICassandraConnectionFactory {

    Session getSession();
}
