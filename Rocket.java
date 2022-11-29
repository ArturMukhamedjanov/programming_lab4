import java.util.Objects;
import java.util.Random;

public class Rocket implements IFlyable{
    private String name;
    private RocketEngine engine;
    private Material material;
    private boolean broken;
    Rocket(String name, Material material){
        this.name = name;
        this.material = material;
        this.broken = false;
    }
    public void setEngine(RocketEngine engine){
        this.engine = engine;
    }

    public String getName() {
        return name;
    }
    public Material getMaterial(){
        return material;
    }
    public boolean getBroken(){return broken;}
    public RocketEngine getEngine(){return engine;}

    public void fly(String location) throws FlyingObjectNotReadyException{
        //проверка готовности двигателя
        if(engine == null || engine.getBroken() || !engine.getOn() || broken){
            throw new FlyingObjectNotReadyException("Ракета " + getName() + " 2не готова к полету");
        }
        else{
            takeoff();
            Random random = new Random();
            if(random.nextBoolean()){
                fall();
                broken = true;

            }
            else {
                System.out.println("Ракета \"" + name + "\" летит на локацию " + location);
                landing();
            }
        }
    }
    public void crash(){
        System.out.println("Ракета \"" + name + "\" сломалась");
        this.broken = true;
    }
    public void fall(){
        System.out.println("Ракета \"" + name + "\" упала");
    }
    public void landing(){
        System.out.println("Ракета \"" + name+ "\" успешно приземлилась");
    }
    public void takeoff(){
        System.out.println("Ракета \"" + name + "\" успешно взелета");
    }

    @Override
    public boolean equals(Object o){
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Rocket rocket = (Rocket) o;
        return rocket.getName().equals(getName())
                && rocket.getMaterial() == getMaterial()
                && rocket.getBroken() == getBroken();
    }

    public class RocketEngine{
        private static int power = 100;
        private static String name_of_model = "Model_1";
        private static int fuel_consumption = 50;
        private int date_of_creation;
        private boolean broken;
        private boolean on;


        RocketEngine(int date_of_creation){
            this.date_of_creation = date_of_creation;
            this.broken = false;
            this.on = false;
        }

        public boolean getBroken(){
            return broken;
        }

        public boolean getOn(){
            return on;
        }

        public void turnOn(){
            if (this.broken){
                System.out.println("Двигатель сломан, запуск невозможен.");
                return;
            }
            System.out.println("Двигатель запущен.");
            this.on = true;
        }
        public void turnOff(){
            this.on = false;
            System.out.println("Двигатель отключен.");
        }
        public void crash(){
            System.out.println("Двигатель сломался.");
            this.broken = true;
            Rocket.this.crash();
        }

        public static class Drawing{
            public static int getPower(){return power;}
            public static String getNameOfModel(){return name_of_model;}
            public static int getFuelConsumption(){return fuel_consumption;}
        }

    }


    @Override
    public int hashCode(){
        return Objects.hash(getName(), getMaterial(), getBroken());
    }
    @Override
    public String toString(){
        return "Rocket{" +
                "name='" + getName() + '\''+
                ", material=" + getMaterial() +
                ", isBroken=" + getBroken() +"}";
    }
}
