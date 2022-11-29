import java.util.Objects;

public class Scene extends APlace {
    Scene(){
        super();
    }
    Scene(String name) {
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
        Scene scene = (Scene) o;
        if(getName() != scene.getName()){
            return false;
        }
        if(getFurnitures().size() != scene.getFurnitures().size() || !getFurnitures().containsAll(scene.getFurnitures()) || !scene.getFurnitures().containsAll(getFurnitures())){
            return false;
        }
        return true;
    }
    @Override
    public String toString(){
        return "Scene{" +
                "name='" + getName() + '\''+
                ", furnitures=" + getFurnitures() + "}";
    }
}
