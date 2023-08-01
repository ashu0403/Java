public class Engine {
    // The engines can have common attributes like Model No, displacement, max
    // power, max rpm, # of cylinders.
    String model;
    int maxpower;
    int maxRPM;
    int maxTorque;
    int weight;
    // Call these value in other class using Super
    int displacement;
    int cyclinder;
    String compRatio;

    // Parameterised Constructor
    public Engine(String model, int maxpower, int maxRPM, int maxTorque, int weight) {
        this.model = model;
        this.maxpower = maxpower;
        this.maxRPM = maxRPM;
        this.maxTorque = maxTorque;
        this.weight = weight;

    }
}
