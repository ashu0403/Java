import java.util.Scanner;

public class automaticdct {

	public static void main(String args[]) {
		Scanner sca = new Scanner(System.in);
		System.out.print("Input the Engine type : ");
		String type = sca.nextLine();
		System.out.print("Input the model number :");
		String model = sca.nextLine();
		System.out.println("The Engine Type is : " + type);
		System.out.println("The Model Number is : " + model);
		System.out.println();

		if (type.equals("Manual")) {
			manual obj = new manual(type, model);
			obj.printdetails(type, model);
		} else if (type.equals("AMT")) {
			Amt obj1 = new Amt(type, model);
			obj1.displayamt(type, model);
		} else if (type.equals("Automatic-CVT") || type.equals("Automatic-DCT")) {
			autmaticcvt obj2 = new autmaticcvt(type);
			obj2.automaticcvt(type);
		}
	}

}
