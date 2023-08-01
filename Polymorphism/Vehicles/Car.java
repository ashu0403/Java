public class Car extends VehicleManufacturer implements Vehicle {
    public Car(String vehicleName, String vehicleModelName, String vehicleType) {
        super.setVehicleName(vehicleName);
        super.setVehicleModelName(vehicleModelName);
        super.setVehicletype(vehicleType);
    }

    public int maxSpeed(String VehicleType) {
        if (VehicleType.equals("sportsCar")) {
            return 170;
        } else if (VehicleType.equals("Sedan")) {
            return 300;
        } else {
            return 0;
        }
    }

    public String getManufacturerInformation() {
        String s = "Car{Manufacturer Name: " + getVehicleName() + ", Model Name: " + getVehicleModelName() + ", Type: "
                + getVehicletype() + "}";
        return s;
    }
}
