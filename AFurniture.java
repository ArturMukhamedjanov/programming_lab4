public abstract class AFurniture {
    private String name;
    private String default_name = "безымянный предмет интерьера";
    private Material material;
    AFurniture(Material material){
        this.name = default_name;
        this.material = material;
    }

    AFurniture(String name, Material material){
        this.name = name;
        this.material = material;
    }
    public String getName(){return name;}
    public Material getMaterial(){return material;}
}
