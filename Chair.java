import java.util.Objects;

public class Chair extends AFurniture{
    Chair(Material material){
        super(material);
    }
    Chair(String name, Material material){
        super(name, material);
    }
    @Override
    public boolean equals(Object o){
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Chair chair = (Chair) o;
        return chair.getName().equals(getName()) && chair.getMaterial() == getMaterial();
    }
    @Override
    public int hashCode(){
        return Objects.hash(getName(), getMaterial());
    }
    @Override
    public String toString(){
        return "Chair{" +
                "name='" + getName() + '\''+
                ", material=" + getMaterial() + "}";
    }
}
