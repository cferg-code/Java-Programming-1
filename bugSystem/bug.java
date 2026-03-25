
public class bug {

    private int id;
    private String title;
    private String description;
    private Status status;
    private Priorty priorty;

    //Constructors
    public bug(int id, String title, String description, Status status, Priorty priorty) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.status = status;
        this.priorty = priorty;
    }

    //we now set up setters
    public void setId(int id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public void setPriorty(Priorty priorty) {
        this.priorty = priorty;
    }

    //Now we set up the getters
    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public Status getStatus() {
        return status;
    }

    public Priorty getPriorty() {
        return priorty;
    }

    public enum Status {
        OPEN, IN_PROGRESS, RESOLVED
    }

    public enum Priorty {
        LOW, MEDIUM, HIGH
    }

}
