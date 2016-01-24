package weatherStation;

/**
 *
 * @author Lama
 */
public class CurrentConditionsDisplay implements Observer, DisplayElement{
    private float temperature;
    private float humidity;
    private float pressure;
    private Subject weatherData;

    CurrentConditionsDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        display();
    }

    @Override
    public void display() {
        System.out.println("Current conditions: \n" + "temperature: " + temperature + "F degrees \n humidity: " + humidity + "%\n Pressure: " + pressure);
    }

}
