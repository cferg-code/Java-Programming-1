import java.util.ArrayList;

public class logManager {
    private ArrayList<String> logManager = new ArrayList<>();

    public void addLog(String message) {
        logManager.add(message);
    }

    public void displayLogs() {
        if(logManager.isEmpty()) {
            System.out.println("No Logs are found");
        } else {
            for(String l : logManager) {
                System.out.println(l);
            }
        }
    }

}