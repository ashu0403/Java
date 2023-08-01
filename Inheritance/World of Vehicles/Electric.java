public class Electric extends Engine{
    String currentType;
    int voltage;
//Parameterised Constructor
    public Electric(String model, int maxpower, int maxRPM, int maxTorque, int weight, String currentType, int voltage) {
        super(model, maxpower, maxRPM, maxTorque, weight);
        this.currentType = currentType;
        this.voltage = voltage;
        System.out.println("---------------- Electric Engine --------------------");
        System.out.println("Model #"+model);
        System.out.println("Max Power(kW)-"+maxpower);
        System.out.println("Max RPM-"+maxRPM);
        System.out.println("Max Torque (Nm)-"+maxTorque);
        System.out.println("Weight(kgs)-"+weight);
        System.out.println("Current Type-"+currentType);
        System.out.println("Voltage-"+voltage);
    }
}
