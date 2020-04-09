
public class Project {
    private String name;
    private String desc;
    public String project(){
        return name+desc;
    }
    public void project(String name){
        this.name = name;
    }
    public void project(String name, String description){
        this.name = name;
        this.desc = description;
    }
}