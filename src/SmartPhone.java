public class SmartPhone implements Observer{

    private String currentWeather = "";
    private Observable observable;
    @Override
    public void update() {
        this.currentWeather = observable.getData();
    }

    public SmartPhone(Observable o){
        this.observable = o;
        this.currentWeather = o.getData();
        observable.add(this);
    }

    public String getCurrentWeather() {
        return currentWeather;
    }
}
