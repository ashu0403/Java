public class Diesel extends Engine{
//Parameterised Constructor
    public Diesel(String model, int maxpower, int maxRPM, int maxTorque, int weight,int displacement,int cyclinder,String compRatio) {
        super(model, maxpower, maxRPM, maxTorque, weight);
        super.displacement=displacement;
        super.cyclinder=cyclinder;
        super.compRatio=compRatio;
        System.out.println("---------------- Diesel Engine --------------------");
        System.out.println("Model #"+model);
        System.out.println("Displacment (cc)-"+displacement);
        System.out.println("Max Power(kW)-"+maxpower);
        System.out.println("Max RPM-"+maxRPM);
        System.out.println("Max Torque (Nm)-"+maxTorque);
        System.out.println("Weight(kgs)-"+weight);
        System.out.println("Cyclinder-"+cyclinder);
        System.out.println("Comp ratio-"+compRatio);
    }
}
