import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LoggerSubject {
    Map<Integer, List<LoggerObesever>> logger = new HashMap<>();

     void addLogger(int level , LoggerObesever loggerObesver)
     {
        logger.computeIfAbsent(level , k -> new ArrayList<LoggerObesever>()).add(loggerObesver);
     }

     void remove(LoggerObesever loggerObesver)
     {
         for(Map.Entry<Integer, List<LoggerObesever>> entry : logger.entrySet())
         {
           entry.getValue().remove(loggerObesver);
         }
     }

     void notifyObserver(int level , String message)
     {
         for(Map.Entry<Integer, List<LoggerObesever>> entry : logger.entrySet())
         {
             if(entry.getKey() == level)
             {
                 entry.getValue().forEach(loggerObesver -> loggerObesver.display(message));
             }
         }
     }
}
