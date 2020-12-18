package designpatterns.observer.meteoSurveillanceApp1;
// add comment !!
//Add comment 3
public class CurrentConditionDisplay {
	private float temperature;
	private float humidity;
	
	
	public void update(float temperature, float humidity, float pressure) {
		this.temperature = temperature;
		this.humidity = humidity;
		display();
	}
	
	public void display() {
		System.out.println("Current conditions: " + temperature 
			+ "F degrees and " + humidity + "% humidity");
	}
}
