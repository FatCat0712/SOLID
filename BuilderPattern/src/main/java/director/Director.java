package director;

import builder.Builder;

public class Director {
    public void constructSportsCar(Builder builder) {
        builder.setCarType(cars.CarType.SPORTS_CAR);
        builder.setSeats(2);
        builder.setEngine(new components.Engine(3.0, 0));
        builder.setTransmission(components.Transmission.SEMI_AUTOMATIC);
        builder.setTripComputer(new components.TripComputer());
        builder.setGPSNavigator(new components.GPSNavigator());
    }

    public void constructCityCar(Builder builder) {
        builder.setCarType(cars.CarType.CITY_CAR);
        builder.setSeats(4);
        builder.setEngine(new components.Engine(1.2, 0));
        builder.setTransmission(components.Transmission.AUTOMATIC);
        builder.setTripComputer(new components.TripComputer());
        builder.setGPSNavigator(new components.GPSNavigator());
    }

    public void constructSUV(Builder builder) {
        builder.setCarType(cars.CarType.SUV);
        builder.setSeats(5);
        builder.setEngine(new components.Engine(2.5, 0));
        builder.setTransmission(components.Transmission.MANUAL);
        builder.setTripComputer(new components.TripComputer());
        builder.setGPSNavigator(new components.GPSNavigator());
    }
}
