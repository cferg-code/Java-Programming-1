
import java.util.ArrayList;

public class bugManager {

    private ArrayList<bug> bugManager = new ArrayList<>();

    public void addBug(bug b) {
        bugManager.add(b);
    }

    public bug findBugById(int searchId) {
        for (bug b : bugManager) {
            if (b.getId() == searchId) {
                return b;
            }
        }
        return null;
    }

    public bug updateStatus(int searchId, bug.Status newStatus) {
        bug bugStat = findBugById(searchId);

       if (bugStat != null) {
        bugStat.setStatus(newStatus);
        return bugStat;
       } else {
        return null;
       }
              
    }

    public bug updatePriorty(int searchId, bug.Priorty newPriorty) {
        bug bugPrio = findBugById(searchId);

        if(bugPrio != null) {
            bugPrio.setPriorty(newPriorty);
            return bugPrio;
        } else {
            return null;
        }
    }

    public boolean  removeBug(int searchId) {
        bug removeBug = findBugById(searchId);

        //we remove the variable that we made
        if(removeBug != null) {
            bugManager.remove(removeBug);
            return true;
        } else {
            return false;
        }

    }

    public void displayBugs() {
        if (bugManager.isEmpty()) {
            System.out.println("You have no active bugs to resolve");
        } else {
            System.out.println("Here are your active loops: ");

            for(bug b : bugManager) {
                System.out.println(b);
            }
        }
    }

}
