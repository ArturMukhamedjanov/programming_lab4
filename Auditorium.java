import java.util.Collection;
import java.util.Collections;
import java.util.Objects;

public class Auditorium extends APlace{
    Auditorium(){
        super();
    }
    Auditorium(String name) {
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
        Auditorium auditorium = (Auditorium) o;
        if(getName() != auditorium.getName()){
            return false;
        }
        if(getFurnitures().size() != auditorium.getFurnitures().size() || !getFurnitures().containsAll(auditorium.getFurnitures()) || !auditorium.getFurnitures().containsAll(getFurnitures())){
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
        return "Auditorium{" +
                "name='" + getName() + '\''+
                ", furnitures=" + getFurnitures() + "}";
    }
}
