public class DebugLog extends  AbstractLoggerType{
    AbstractLoggerType nextLoggingLevel;
    public DebugLog(AbstractLoggerType nextLoggingLevel  , int level)
    {
        super(nextLoggingLevel , level);
    }
    @Override
    void display( String msg , LoggerSubject loggerSubject) {

        loggerSubject.notifyObserver(2, msg);

    }

}
