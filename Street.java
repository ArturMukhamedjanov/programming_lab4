import java.util.Objects;

public class Street extends APlace{
    Street(){
        super();
    }
    Street(String name) {
        super(name);
    }
    @Override
    public boolean equals(Object o){
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Street street = (Street) o;
        if(getName() != street.getName()){
            return false;
        }
        if(getFurnitures().size() != street.getFurnitures().size() || !getFurnitures().containsAll(street.getFurnitures()) || !street.getFurnitures().containsAll(getFurnitures())){
            return false;
        }
        return true;
    }
    @Override
    public int hashCode(){
        return Objects.hash(getName(), getFurnitures());
    }
    @Override
    public String toString(){
        return "Street{" +
                "name='" + getName() + '\''+
                ", furnitures=" + getFurnitures() + "}";
    }
}
