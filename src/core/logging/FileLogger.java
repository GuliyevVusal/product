package core.logging;

public class FileLogger implements Logger {
    @Override
    public void log(String data) {
        System.out.println("File is logged : " + data);
    }
}
