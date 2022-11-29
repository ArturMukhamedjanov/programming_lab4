public interface IPerson {
    void setPlace(APlace place);
    void standUp();
    void sitDown(AFurniture furniture);
    void setStatus(Status status);
    APlace getPlace();
    String getName();
    Status getStatus();
    Condition getCondition();
}
