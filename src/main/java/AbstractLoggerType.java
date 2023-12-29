abstract  public class AbstractLoggerType {
    int level ;
    AbstractLoggerType nextLoggingLevel ;

    public AbstractLoggerType(AbstractLoggerType nextLoggingLevel , int level){
        this.level = level;
        this.nextLoggingLevel = nextLoggingLevel;
    }

    void logMessage(int level , String msg , LoggerSubject loggerSubject)
    {
        if(this.level == level )
        {
            display(msg , loggerSubject);
        }

        if(nextLoggingLevel != null)
            nextLoggingLevel.logMessage(level ,msg ,loggerSubject);
    }

    abstract void display(String msg , LoggerSubject loggerSubject);


}
