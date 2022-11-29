import java.util.Objects;

public class Journalist extends AHuman{
    private String name_of_journal;
    private final String default_name_of_journal = "Неизвестный журнал";

    Journalist(){
        super();
        name_of_journal = default_name_of_journal;
    }
    Journalist(String name){
        super(name);
        name_of_journal = default_name_of_journal;
    }
    Journalist(String name,Status status){
        super(name, status);
        name_of_journal = default_name_of_journal;
    }
    Journalist(String name, Status status, String name_of_journal){
        super(name, status);
        this.name_of_journal = name_of_journal;
    }

    public String getName_of_journal(){
        return name_of_journal;
    }

    public void ask_about_rocket(Rocket rocket){
        System.out.println("Журналист " + name + " спрашивает про ракету \"" + rocket.getName() + "\"");
    }
    public void ask_about_dream(){
        System.out.println("Журналист " + name + " спрашивает про сон во время полета");
    }
    public void ask_about_Earth(){
        System.out.println("Журналист " + name + " спрашивает про Землю");
    }


    @Override
    public boolean equals(Object o){
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Journalist journalist = (Journalist) o;
        return getName().equals(journalist.getName())
                && getStatus() == journalist.getStatus()
                && getCondition() == journalist.getCondition()
                && getPlace().equals(journalist.getPlace())
                && getName_of_journal().equals(journalist.getName_of_journal());
    }
    @Override
    public int hashCode(){
        return Objects.hash(getName(), getStatus(), getCondition(), getPlace(), getName_of_journal());
    }
    @Override
    public String toString(){
        return "Journalist{" +
                "name='" + getName() + '\''+
                ", status=" + getStatus() +
                ", condition=" + getCondition() +
                ", place=" + getPlace() +
                ", name_of_journal=" + getName_of_journal() +"}";
    }
}
