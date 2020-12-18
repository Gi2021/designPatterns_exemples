package designpatterns.observer.meteoSurveillanceApp1;

public class ForcasteConditionDisplay {
	private float temp;
	
	public void update(float temp, float humidity, float pressure) {
		this.temp = temp;
		display();
	}

	public void display() {
		System.out.print("Previsions meteo: ");
		if (temp > 15) {
			System.out.println("Bonne meteo est au rendez-vous!");
		} else if (temp == 15) {
			System.out.println("Nous allons continuer une même temperature pour le moment");
		} else if (temp < 15) {
			System.out.println("La meteo s'annonce un peu dans le froid!");
		}
	}
	
}
