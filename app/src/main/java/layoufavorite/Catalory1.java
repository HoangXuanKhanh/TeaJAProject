package layoufavorite;

public class Catalory1 {

    private  int id;
    private int resourceID1;
    private String name1;

    public Catalory1(int id, int resourceID1, String name1) {
        this.id = id;
        this.resourceID1 = resourceID1;
        this.name1 = name1;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getResourceID1() {
        return resourceID1;
    }

    public void setResourceID1(int resourceID1) {
        this.resourceID1 = resourceID1;
    }

    public String getName1() {
        return name1;
    }

    public void setName1(String name1) {
        this.name1 = name1;
    }
}
