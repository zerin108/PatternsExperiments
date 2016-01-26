package weatherStation;

import java.util.Observable;

/**
 *
 * @author Lama
 */
public class WeatherData extends Observable{
    
//    private ArrayList observers;  //теперь структура для хранения данных не нужна
    private float temperature;
    private float humidity;
    private float pressure;
    
    public WeatherData(){
//        observers = new ArrayList();
    }
    
    public void measurementsChanged(){
        setChanged();
        notifyObservers();
    }
    
    float getTemperature(){
        return 0;
    }
    
    float getHumidity(){
        return 0;
    }
    
    float getPressure(){
        return 0;
    }
        
    public void setMeasurements(float temperature, float humidity, float pressure){
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }}
