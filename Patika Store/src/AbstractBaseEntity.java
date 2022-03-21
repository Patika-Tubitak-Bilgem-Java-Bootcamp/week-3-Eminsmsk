public abstract class AbstractBaseEntity {


    private final int id;
    private String name;
    private static int idCounter=0;

    public AbstractBaseEntity(String name) {
        this.id = idCounter++;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
