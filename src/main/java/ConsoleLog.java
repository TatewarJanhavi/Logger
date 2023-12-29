public class ConsoleLog implements LoggerObesever {


    @Override
    public void display(String message) {
        System.out.println("Console :" + message);
    }
}
