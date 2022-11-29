import java.util.Objects;

public class Scientist extends AHuman{
    private Science science;
    private Science default_science = Science.UNKNOWN_SCIENCE;

    Scientist(){
        super();
        science = default_science;
    }
    Scientist(String name){
        super(name);
        science = default_science;
    }
    Scientist(String name, Status status){
        super(name, status);
        science = default_science;
    }
    Scientist(String name, Status status, Science science){
        super(name, status);
        this.science = science;
    }
    public Science getScience(){
        return science;
    }
    public void ask_about_rocket(Rocket rocket){
        System.out.println("Ученый из области науки: "+ science.getName() +", по имени "+ name + " спрашивает про ракету \"" + rocket.getName() + "\"");
    }

    @Override
    public boolean equals(Object o){
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Scientist scientist = (Scientist) o;
        return getName().equals(scientist.getName())
                && getStatus() == scientist.getStatus()
                && getCondition() == scientist.getCondition()
                && getPlace().equals(scientist.getPlace())
                && getScience() == scientist.getScience();
    }
    @Override
    public int hashCode(){
        return Objects.hash(getName(), getStatus(), getCondition(), getPlace(), getScience());
    }
    @Override
    public String toString(){
        return "Scientist{" +
                "name='" + getName() + '\''+
                ", status=" + getStatus() +
                ", condition=" + getCondition() +
                ", place=" + getPlace() +
                ", science=" + getScience() +"}";
    }
}
