public enum Material {
    WOOD("Дерево"),
    METAL("Метал"),
    WATER("Вода"),
    PLASTIC("Пластик");

    private String name;
    Material(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
