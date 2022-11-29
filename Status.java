public enum Status {
    ANGRY("злой"),
    HAPPY("радостный"),
    CALM("спокойный"),
    SAD("грустный"),
    NEUTRAL("нейтральный");

    private String name;

    Status(String name){
        this.name = name;
    }
}
