public class Bike extends VehicleManufacturer implements Vehicle {
    public Bike(String vehicleName, String vehicleModelName, String vehicleType) {
        super.setVehicleName(vehicleName);
        super.setVehicleModelName(vehicleModelName);
        super.setVehicletype(vehicleType);
    }

    public int maxSpeed(String VehicleType) {
        if (VehicleType.equals("sportsBike")) {
            return 170;
        } else if (VehicleType.equals("Cruiser")) {
            return 300;
        } else {
            return 0;
        }
    }

    public String getManufacturerInformation() {
        String s = "Bike{Manufacturer Name: " + getVehicleName() + ", Model Name: " + getVehicleModelName() + ", Type: "
                + getVehicletype() + "}";
        return s;
    }

}
