package designpatterns.observer.meteoSurveillanceApp2;

public interface Observer {
	public void update(float temp, float humidity, float pressure);
}
