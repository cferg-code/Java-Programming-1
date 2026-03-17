public class pc extends device{
    private String osType;

    //We make it where we able to pass data through device and be able to extend it correctly
    public pc(String osType, String name, String ip, boolean status) {

        super(name, ip, status);
        this.osType = osType;
    }

    //setter
    public void setOsType(String osType) {
        this.osType = osType;
    }

    //getter
    public String getOsType() {
        return osType;
    }

    //now we set up a toString
    @Override
    public String toString() {
         return "Name: " + getName() + " | IP: " + getIP() + " | Status: " + getStatus() + " | OsType: " + getOsType();
    
    }
}
