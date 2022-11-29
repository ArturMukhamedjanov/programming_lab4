public enum Science {
    PHYSICS("физика"),
    BIOLOGY("биология"),
    MATHS("математика"),
    CHEMISTRY("химия"),
    INFORMATICS("информатика"),
    UNKNOWN_SCIENCE("делитант широкого профиля");

    private String name;

    Science(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
