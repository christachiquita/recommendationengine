package data.factory;

import com.datastax.driver.core.*;
import com.datastax.driver.core.policies.DefaultRetryPolicy;
import interfaces.data.factory.ICassandraConnectionFactory;

/**
 *
 * @author christachiquita
 */

public class CassandraConnectionFactory implements ICassandraConnectionFactory {
    private Session  _session;
    private Cluster  _cluster;
    private String[] _nodes;
    private String   _username;
    private String   _password;
    private String   _keyspace;

    public CassandraConnectionFactory(String[] nodes, String username, String password, String keyspace){
        _nodes    = nodes;
        _username = username;
        _password = password;
        _keyspace = keyspace;
    }

    @Override
    public Session getSession() {
        if (_session == null){
            _cluster = Cluster.builder()
                    .addContactPoints(_nodes)
                    .withRetryPolicy(DefaultRetryPolicy.INSTANCE)
                    .withCredentials(_username, _password)
                    .build();

            _session = _cluster.connect(_keyspace);
        }

        return _session;
    }

    public void Dispose(){
        _session.close();
        _cluster.close();
    }
}