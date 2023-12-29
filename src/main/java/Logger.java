


public class Logger implements  Cloneable {

    private volatile static  Logger logger ;
    private volatile static AbstractLoggerType abstractLoggerType;
    private volatile static LoggerSubject loggerSubject;

    private  Logger () {
        if(logger != null)
        throw new IllegalStateException("Object already created");
    }


    public static Logger getInstance()
    {
        if(logger == null)
        {
            synchronized (Logger.class)
            {
                if(logger == null)
                    logger = new Logger();
                    abstractLoggerType = LoggerManager.buildChainofLog();
                    loggerSubject = LoggerManager.addObserver();
            }
        }
        return logger;
    }

    private void printLog(int level , String msg)
    {
        abstractLoggerType.logMessage(level , msg , loggerSubject);
    }

    public void info(String msg)
    {
        printLog(1, msg);
    }
    public void error(String msg)
    {
        printLog(3, msg);
    }
    public void debug(String msg)
    {
        printLog(2, msg);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException();
    }
}
