public class server extends device {
    private double cpuUsage = 0;

    public server(String name, String ip, boolean status, double cpuUsage) {


        //we are passing data to the device file
        super(name, ip, status);
        this.cpuUsage = cpuUsage;
    }

    public void setCpuUsage(double cpuUsage) {
        this.cpuUsage = cpuUsage;
    }

    public double getCpuUsage() {
        return cpuUsage;
    }

    @Override
    public String toString() {
        return "Name: " + getName() + " | IP: " + getIP() + " | Status: " + getStatus() + "| cpuUsage: " + cpuUsage;
    }



}
