public class ErrorLog extends  AbstractLoggerType{
    AbstractLoggerType nextLoggingLevel;
    public ErrorLog(AbstractLoggerType nextLoggingLevel  , int level)
    {
        super(nextLoggingLevel, level);
    }

    @Override
    void display( String msg , LoggerSubject loggerSubject) {

       loggerSubject.notifyObserver(3,msg);

    }
}
