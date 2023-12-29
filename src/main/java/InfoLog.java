public class InfoLog extends AbstractLoggerType{
    AbstractLoggerType nextLoggingLevel;
    public InfoLog(AbstractLoggerType nextLoggingLevel , int level)
    {
        super(nextLoggingLevel , level);
    }
    @Override
    void display( String msg  , LoggerSubject loggerSubject) {


        loggerSubject.notifyObserver(1, msg);

    }
}
