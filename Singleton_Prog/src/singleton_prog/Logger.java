package singleton_prog;

public class Logger {

    private static Logger logs;
    private String logger;

    private Logger() {

    }

    static {

        logs = new Logger();
    }

    public static Logger getInstance() {

        return logs;

    }

    public void log(String msg){
        System.out.println("Msg: "+msg);
    }

    /**
     * @return the logger
     */
    public String getLogger() {
        return logger;
    }

    /**
     * @param logger the logger to set
     */
    public void setLogger(String logger) {
        this.logger = logger;
    }

}
