public class LoggerManager {

    static AbstractLoggerType buildChainofLog()
    {
        AbstractLoggerType chainOfLog = new InfoLog(new DebugLog(new ErrorLog(null, 3) , 2) , 1);
        return chainOfLog;
    }

       static LoggerSubject addObserver ()
       {
           LoggerObesever consoleLogObesver = new ConsoleLog();
           LoggerObesever fileLogObserver = new FileLogger();
           LoggerSubject loggerSubject = new LoggerSubject();
           loggerSubject.addLogger(1,fileLogObserver);
           loggerSubject.addLogger(2,consoleLogObesver);
           loggerSubject.addLogger(2,consoleLogObesver);
           return loggerSubject;
       }
}
