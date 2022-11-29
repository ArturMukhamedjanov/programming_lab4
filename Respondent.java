import java.util.Objects;

public class Respondent extends AHuman{
    Respondent(){
        super();
    }
    Respondent(String name){
        super(name);
    }
    Respondent(String name,Status status){
        super(name, status);
    }
    public void answer_about_rocket(Rocket rocket) throws NotRightPlaceException{
        if(!(this.getPlace() instanceof Scene)){
            throw new NotRightPlaceException("Персонаж не на сцене, говорить не может!!!");
        }
        else {
            System.out.println(name + " рассказывает про ракту :\"" + rocket.getName() + "\"");
            System.out.println("Ракета сделана из материала " + rocket.getMaterial().getName());
            if (rocket.getBroken()) {
                System.out.println("Ракета сломана");
            } else {
                System.out.println("Ракета в рабочем состоянии");
            }
            System.out.println();
            System.out.println("О двигателе ракеты:");
            System.out.println("Мощность двигателя: " + Rocket.RocketEngine.Drawing.getPower());
            System.out.println("Название модели двигателя: " + Rocket.RocketEngine.Drawing.getNameOfModel());
            System.out.println("Расход топлива в у.е: " + Rocket.RocketEngine.Drawing.getFuelConsumption());
            System.out.println();
        }
    }
    public void answer_about_dream(String dream_about){
        System.out.println("Мне снился сон:");
        IDream dream = new IDream() {
            @Override
            public void dreaming() {
                System.out.println(dream_about);
            }
        };
        dream.dreaming();
    }
    public void answer_about_Earth(String about_people, String about_view, String about_general){
        class Opinion{
            private String about_people;
            private String about_view;
            private String about_general;
            Opinion(String about_people, String about_view, String about_general){
                this.about_people = about_people;
                this.about_view = about_view;
                this.about_general = about_general;
            }
            public void give_opinion(){
                 System.out.println("Мнение о планете земля:");
                System.out.println("О людях: " + about_people);
                System.out.println("О внешнем виде: " + about_view);
                System.out.println("Общее мнение: " + about_general);
            }
        }
        Opinion opinion = new Opinion(about_people, about_view, about_general);
        opinion.give_opinion();
    }
    @Override
    public boolean equals(Object o){
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Respondent respondent = (Respondent) o;
        return getName().equals(respondent.getName())
                && getStatus() == respondent.getStatus()
                && getCondition() == respondent.getCondition()
                && getPlace().equals(respondent.getPlace());
    }
    @Override
    public int hashCode(){
        return Objects.hash(getName(), getStatus(), getCondition(), getPlace());
    }
    @Override
    public String toString(){
        return "Respondent{" +
                "name='" + getName() + '\''+
                ", status=" + getStatus() +
                ", condition=" + getCondition() +
                ", place=" + getPlace() +"}";
    }
}
