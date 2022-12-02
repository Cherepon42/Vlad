import java.util.Objects;

public class User implements Cloneable {
    private final int ID = (int) (Math.random() * 100000);
    private String name;
    private String surName;

    public int getID() {
        return ID;
    }

    public String getName() {
        return name;
    }

    public String getSurName() {
        return surName;
    }

    public User(String name, String surName) {
        this.name = name;
        this.surName = surName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof User user)) return false;
        return ID == user.ID && Objects.equals(name, user.name) && Objects.equals(surName, user.surName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ID, name, surName);
    }

    @Override
    public String toString() {
        return "User{" +
                "ID=" + ID +
                ", name='" + name + '\'' +
                ", surName='" + surName + '\'' +
                '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
