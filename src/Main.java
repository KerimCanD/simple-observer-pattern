public class Main {
    public static void main(String[] args) {
        Observable weatherStation = new WeatherStation();
        weatherStation.setData("Rainy");
        Observer smartPhone1 = new SmartPhone(weatherStation);
        Observer smartPhone2 = new SmartPhone(weatherStation);

        System.out.println(((SmartPhone) smartPhone1).getCurrentWeather()+ "-" +
                ((SmartPhone) smartPhone2).getCurrentWeather());

        weatherStation.setData("Sunny");

        System.out.println(((SmartPhone) smartPhone1).getCurrentWeather()+ "-" +
                ((SmartPhone) smartPhone2).getCurrentWeather());

    }
}