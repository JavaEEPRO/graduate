package si.inspirited.graduation;

public class App {
    public static void main(String[] args) {
         showFinalMessage(0);
    }

    public static int showFinalMessage(int exitCode) {
        System.out.println("graduation completed successfully with exit code " + exitCode);
        return exitCode;
    }
}
