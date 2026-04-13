package base;

public abstract class Observer {
    protected Subject subject;
    public abstract void notify(Object arg);
}
