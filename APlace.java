import java.util.ArrayList;

public abstract class APlace {

    private String name;
    private String default_name = "Неизвестная сцена";
    private ArrayList<AFurniture> furnitures = new ArrayList<AFurniture>();

    APlace(){name = default_name;}
    APlace(String name) {
        this.name = name;
    }

    public String getName(){return this.name;}
    public ArrayList<AFurniture> getFurnitures(){return this.furnitures;}
    public void setFurniture(AFurniture furniture){
        furnitures.add(furniture);
    }
    public void deleteFurniture(AFurniture furniture){
        furnitures.remove(furniture);
    }
}
