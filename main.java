public class main {
    public static void main(String[] args) {
        inventoryManager myInventory = new inventoryManager();
        logAnalyzer myLog = new logAnalyzer();

        server myServer = new server("Server1", "192.168.1.10", true, 60);

        pc myPC = new pc("Windows", "OfficePC", "192.168.1.30", false);

        myInventory.addDevice(myPC);
        myInventory.addDevice(myServer);

        myLog.log("Added device: " + myPC.getName());
        myLog.log("Added device: " + myServer.getName());

        myInventory.listDevices();
        device result = myInventory.findByName("Server1");

        if (result != null) {
            System.out.println("Found: ");
            System.out.println("Log Found");
        } else {
            System.out.println("Not Found");
            System.out.println("Log Failure");
        }

    }

}
