import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        bugManager bManager = new bugManager();
        logManager lManager = new logManager();
        bug newBug1 = new bug(1, "Bug 1", "Getting Errors when I type in my password", 
        bug.Status.OPEN, bug.Priorty.LOW);
        bManager.addBug(newBug1);
        lManager.addLog("Bug1 Added");
        bug resultStat = bManager.updateStatus(1, bug.Status.IN_PROGRESS);
        bug resultPrio = bManager.updatePriorty(1, bug.Priorty.LOW);
        boolean removeBug = bManager.removeBug(1);

        bug newBug2 = new bug(2, "Bug 2", "I cannot sign into my email", 
        bug.Status.OPEN, bug.Priorty.LOW);

        bManager.addBug(newBug2);
        lManager.addLog("Bug2 Added");

        bug newBug3 = new bug(3, "Bug 3", "My password is locked for my work  account", 
        bug.Status.OPEN, bug.Priorty.LOW);

        bManager.addBug(newBug3);
        lManager.addLog("Bug3 Added");

        if (resultStat != null) {
            lManager.addLog("Bug status has been updated");
        } else {
            System.err.println("Bug not found");
        }

        if(resultPrio != null) {
            lManager.addLog("Bug priorty has been updated");
        } else {
            System.err.println("Bug not found");
        }

        if(removeBug==true) {
            lManager.addLog("Bug removed");
        } else {
            System.err.println("False");
        }

        bManager.displayBugs();
        lManager.displayLogs();
        /* 
        bManager.updateStatus(1, bug.Status.IN_PROGRESS);
        bManager.updatePriorty(1, bug.Priorty.LOW);
        bManager.updateStatus(2, bug.Status.OPEN);
        bManager.updatePriorty(2, bug.Priorty.MEDIUM);
        bManager.updateStatus(3, bug.Status.RESOLVED);
        bManager.updatePriorty(3, bug.Priorty.HIGH);
        */



    }
}