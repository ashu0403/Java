public class VehicleService {
    public static void main(String[] args) {
        Bike bike = new Bike("KTM", "KTM123", "sportsBike");
        System.out.println(
                "Bike type is " + bike.getVehicletype() + " its speed is " + bike.maxSpeed(bike.getVehicletype()));

        System.out.println(bike.getManufacturerInformation());

        Car car = new Car("Santro", "Santro123", "sedan");
        System.out
                .println("Car type is " + car.getVehicletype() + " its speed is " + car.maxSpeed(car.getVehicletype()));

        System.out.println(car.getManufacturerInformation());

    }
}
