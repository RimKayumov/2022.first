package Patterns._3_Singleton;

public class Main {
    public static void main(String[] args) {
        ProgramLogger.getLogger().addLogInfo("First log...");
        ProgramLogger programLogger1 = ProgramLogger.getLogger();
        //programLogger1.showLogFile();
        ProgramLogger programLogger2 = ProgramLogger.getLogger();
        programLogger2.addLogInfo("Second log...");
        ///programLogger2.showLogFile();
        programLogger2.addLogInfo("Third log...");

        System.out.println(programLogger1.toString());
        System.out.println(programLogger2.toString());
        System.out.println(ProgramLogger.getLogger().toString());

        System.out.println();
        ProgramLogger.getLogger().showLogFile();
    }
}
