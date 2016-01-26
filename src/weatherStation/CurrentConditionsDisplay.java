package weatherStation;

import java.util.Observable;

/**
 *
 * @author Lama
 */
public class CurrentConditionsDisplay implements Observer, DisplayElement{
    Observable observable;
    private float temperature;
    private float humidity;
    private float pressure;
    private Subject weatherData;

    CurrentConditionsDisplay(WeatherData weatherData) {
        this.observable = observable;
        observable.addObserver((java.util.Observer) this);
    }

    public void update(Observable observable, Object arg) {
        if (observable instanceof WeatherData) {
            WeatherData weatherData = (WeatherData)observable;
            this.temperature = weatherData.getTemperature();
            this.humidity = weatherData.getHumidity();
            this.pressure = weatherData.getPressure();
            display();
        }
    }

    @Override
    public void display() {
        System.out.println("Current conditions: \n" + "temperature: " + temperature + "F degrees \n humidity: " + humidity + "%\n Pressure: " + pressure);
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
    }

}
