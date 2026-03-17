public abstract class device {
    private String name;
    private String ip;
    private boolean status;


    //setting up the constructor
    public device(String name, String ip, boolean status) {
        this.name = name;
        this.ip = ip;
        this.status = status;
    }

    //setter
    public void setIp(String ip) {
        this.ip = ip;
    }

    //setter
    public void setStatus(boolean status) {
        this.status = status;
    }

    //getter
    public String getName() {
        return name;
    }

    //getter
    public String getIP() {
        return ip;
    }

    //getter
    public boolean getStatus() {
        return status;
    }

}