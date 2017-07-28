package models.data.cql;

/**
 * Created by christachiquita on 25/07/2017.
 */
public class CqlPreparedStatementStrings {
    public static final String GET_ALL_TOKENS_VIDEOBYUSER =
            "SELECT TOKEN(username) FROM videobyuser_exchange" +
            "PER PARTITION LIMIT 1";

    public static final String GET_ROWS_BETWEEN_TOKEN_VIDEOBYUSER =
            "SELECT * FROM videobyuser_exchange" +
            "WHERE TOKEN(username) > :startToken" +
            "AND TOKEN(username) < :endToken";

    public static final String GET_USER_BY_TRACKINGCODE =
            "SELECT *" +
            "FROM userbyvideo_exchange" +
            "WHERE trackingcode = ?";

    public static final String GET_VIDEO_BY_USERNAME =
            "SELECT *" +
            "FROM videobyuser_exchange" +
            "WHERE username = :username";

    public static final String GET_ALL_VIDEO_USER =
            "SELECT *" +
            "FROM videobyuser_exchange";

    public static final String GET_VIDEO_COUNT_BY_CATEGORY =
            "SELECT *" +
            "FROM exchangevideocounter" +
            "WHERE category = :category";

    public static final String GET_VIDEO_COUNT_BY_TRACKING_CODE =
            "SELECT *" +
            "FROM exchangevideocounter" +
            "WHERE trackingcode = :trackingCode" +
            "ALLOW FILTERING";

    public static final String GET_USER_LAST_WATCHTIME_FROM =
            "SELECT *" +
            "FROM videobyuser_exchange" +
            "WHERE id > :id" +
            "PER PARTITION LIMIT 1 ALLOW FILTERING";

    public static final String GET_ALL_UNIQUE_USERS =
            "SELECT DISTINCT username" +
            "FROM videobyuser_exchange";

    public static final String GET_ALL_UNIQUE_VIDEOS =
            "SELECT DISTINCT trackingcode" +
            "FROM userbyvideo_exchange";

    public static final String INSERT_EXCHANGE_VIDEO_BY_USER =
            "INSERT INTO videobyuser_exchange (id, username, trackingcode)" +
            "VALUES (:id, :username, :trackingCode);";

    public static final String INSERT_USER_BY_EXCHANGE_VIDEO =
            "INSERT INTO userbyvideo_exchange (id, username, trackingcode)" +
            "VALUES (:id, :username, :trackingCode);";

    public static final String UPDATE_EXCHANGE_VIDEO_COUNTER =
            "UPDATE exchangevideocounter" +
            "SET watchcount = watchcount + 1" +
            "WHERE category = :category AND trackingcode = :trackingCode";

    public static final String UPDATE_EXCHANGE_VIDEO_COUNTER_CUSTOM =
            "UPDATE exchangevideocounter" +
            "SET watchcount = watchcount + :watchCount" +
            "WHERE category = :category AND trackingcode = :trackingCode";

    public static final String DELETE_FROM_VIDEO_BY_USER =
            "DELETE FROM videobyuser_exchange" +
            "WHERE username = :username";

    public static final String DELETE_FROM_USER_BY_VIDEOS =
            "DELETE FROM userbyvideo_exchange" +
            "WHERE trackingcode IN :trackingCodes";

}
