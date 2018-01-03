package trafficsignalsimulator.ProjectClasses.ObserverInterfaces;

public interface ISubject {
    
    public void addObserver(IObserver obsvr);
    public void removeObserver(IObserver obsvr);
    public void notifyObserver();
    
}
