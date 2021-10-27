import org.apache.log4j.Logger;
import org.w3c.dom.DOMConfiguration;

import java.util.logging.Logger;

public class Log {
    static Logger logger = Logger.getLogger(String.valueOf(Log.class));

    public void Log(){
        DOMConfiguration.configure("log4j.xml");
    }

    public void info(String message){
        logger.info(message);
    }

    public void warn(String message){
        logger.warning(message);
    }



}
