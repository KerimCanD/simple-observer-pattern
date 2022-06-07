import java.util.ArrayList;

public class WeatherStation implements Observable {

    private String currentWeather = "";

    @Override
    public void setData(String currentWeather) {
        this.currentWeather = currentWeather;
        updateAll();
    }


    @Override
    public void add(Observer observer) {
        this.observers.add(observer);
    }

    @Override
    public void remove(Observer observer) {
        this.observers.remove(observer);
    }

    @Override
    public void updateAll() {
        for (Observer o :
                observers) {
            o.update();
        }
    }

    @Override
    public String getData() {
        return currentWeather;

    }
}
