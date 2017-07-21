package services.primitives;

import org.apache.log4j.Logger;
/**
 * Created by christachiquita on 21/07/2017.
 */
public class BaseService {
    static final Logger logger = Logger.getLogger(BaseService.class);

    protected void infoLog(String log){
        logger.info(log);
    }

    protected void debugLog(String log){
        logger.debug(log);
    }

    protected void errorLog(String log){
        logger.error(log);
    }
}
