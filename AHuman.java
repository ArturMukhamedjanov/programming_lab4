public abstract class AHuman implements IPerson{
    protected String name;
    protected final String default_name = "Безымянное существо";
    protected APlace place;
    protected Status status;
    protected Condition condition = Condition.STANDING;
    protected final Status default_status = Status.NEUTRAL;
    AHuman(){
        name = default_name;
        status = default_status;
    }
    AHuman(String name){
        this.name = name;
        status = default_status;
    }
    AHuman(String name, Status status){
        this.name = name;
        this.status = status;
    }
    public void setPlace(APlace place){
        System.out.println(name + " переходит в локацию " + place.getName());
        this.place = place;
    }
    public void setStatus(Status status){
        System.out.println(name + " становится " + status.name());
        this.status = status;
    }
    public APlace getPlace(){
        return place;
    }
    public String getName(){
        return name;
    }
    public Status getStatus(){
        return status;
    }
    public Condition getCondition(){return condition;}
    public void say(String massage){
        System.out.println(name +" говорит: \"" + massage + "\".");
    }
    public void listen(){
        System.out.println(name + " слушает, что говорят.");
    }
    public void ask(String massage){
        System.out.println(name +" спрашивает: \"" + massage + "\".");
    }
    public void answer(String massage){
        System.out.println(name +" отвечает: \"" + massage + "\".");
    }
    public void standUp(){
        if(condition == Condition.STANDING){
            System.out.println(name + " уже стоит.");
            return;
        }
        System.out.println(name +" встает.");
        condition = Condition.STANDING;
    }
    public void sitDown(AFurniture furniture){
        if(condition == Condition.SITTING){
            System.out.println(name + " уже сидит.");
            return;
        }
        System.out.println(name +" садиться на " + furniture.getName() + ".");
        condition = Condition.SITTING;
    }
}
