package Patterns._3_Singleton;

public class ProgramLogger {

    private ProgramLogger(){}

    private static ProgramLogger logger;
    private static String logFile = "This is the log file. \n\n";

    public static ProgramLogger getLogger(){
        if (logger == null) {
            synchronized (ProgramLogger.class) {
                logger = new ProgramLogger();
            }
        }
        return logger;
    }

    public synchronized void addLogInfo(String logInfo){
        logFile += logInfo + "\n";
    }

    public void showLogFile(){
        System.out.println(logFile);
    }
}
