package designpatterns.observer.meteoSurveillanceApp1;

public class WeatherData {
	private float temperature;
	private float pression;
	private float humidite;
	
	private  CurrentConditionDisplay currentConditionDisplay;
	private StatisticsConditionDisplay  statisticsConditionDisplay;
	private ForcasteConditionDisplay forcasteConditionDisplay;
	
	public WeatherData() {
		currentConditionDisplay=new CurrentConditionDisplay();
	}
		
	public void measurementsChanged() {
	  //get donn�es
		float temp=getTemperature();
		float press=getPression();
		float humid=getHumidite();
		
		currentConditionDisplay.update(temp,press,humid);  
		statisticsConditionDisplay.update(temp,press,humid);
		forcasteConditionDisplay.update(temp,press,humid);
		
	}

	private float computeHeatIndex(float t, float rh) {
        float index = (float)((16.923 + (0.185212 * t) + (5.37941 * rh) - (0.100254 * t * rh) +
            (0.00941695 * (t * t)) + (0.00728898 * (rh * rh)) +
            (0.000345372 * (t * t * rh)) - (0.000814971 * (t * rh * rh)) +
            (0.0000102102 * (t * t * rh * rh)) - (0.000038646 * (t * t * t)) + (0.0000291583 *  
            (rh * rh * rh)) + (0.00000142721 * (t * t * t * rh)) +
            (0.000000197483 * (t * rh * rh * rh)) - (0.0000000218429 * (t * t * t * rh * rh)) +     
            0.000000000843296 * (t * t * rh * rh * rh)) -
            (0.0000000000481975 * (t * t * t * rh * rh * rh)));
        return index;

    }
	
	public float getTemperature() {
		
		return temperature;
	}
	public float getPression() {
		return pression;
	}
	public float getHumidite() {
		return humidite;
	}
	
	
}
