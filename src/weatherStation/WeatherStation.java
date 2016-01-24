package weatherStation;

/**
 *
 * @author Lama
 */
public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);
        
        weatherData.setMeasurements(80.0f, 65.0f, 30.4f);
        weatherData.setMeasurements(222.0f, 12.0f, 34.4f);
    }

}
