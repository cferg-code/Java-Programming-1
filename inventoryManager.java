import java.util.ArrayList;

public class inventoryManager {
    private ArrayList<device> inventory = new ArrayList<>();

    // This is the ability to add devices to the list
    public void addDevice(device d) {
        inventory.add(d);
    }

    // This searches for the array for devices
    public void listDevices() {
        if (inventory.isEmpty()) {
            System.out.println("No Devices Found");
            return;
        }

        for (device d : inventory) {
            System.out.println(d);
        }
    }

    // This is to search for names of devices
    public device findByName(String name) {
        for (device d : inventory) {
            if (d.getName().equalsIgnoreCase(name)) {
                return d;
            }

        }
        return null;
    }
}
