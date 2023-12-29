public class FileLogger implements LoggerObesever {

    @Override
    public void display(String message ) {
        System.out.println(message +" Written in file");
    }
}
