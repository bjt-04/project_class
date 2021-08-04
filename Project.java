public class Project  {
    private String name;
    private String description;

    public Project() {
        this.name = "";
        this.description = "";
    }

    public Project(String projectName) {
        this.name = projectName;
        this.description = "";
    }

    public Project(String projectName, String projectDescription) {
        this.name = projectName;
        this.description = projectDescription;
    }


    public void setName(String newName) {
        this.name = newName;
    }
    
    public void setDescription(String newDescription) {
        this.description = newDescription;
    }


    public String getName() {
        return (name);
    }

    public String getDescription() {
        return (description);
    }


    public String elevatorPitch() {
        return (this.getName() + " : " + this.getDescription());
    }
}