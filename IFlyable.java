public interface IFlyable {
    void fly(String locaton) throws FlyingObjectNotReadyException;
    void fall();
    void landing();
    void takeoff();
}
