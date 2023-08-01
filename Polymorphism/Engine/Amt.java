public class Amt extends lukxtech {
	public Amt(String typeoftransmission, String model) {
		if (typeoftransmission.equals("AMT")) {
			switch (model) {
				case "AMTP4":
					super.setForwardgears(4);
					super.setFirstgearratio(2.540f);
					super.setSecondgearratio(1.92f);
					super.setThirdgearratio(1.51f);
					super.setFourthgearratio(1.00f);
					break;

				case "AMTD5":
					setForwardgears(5);
					setFirstgearratio(2.950f);
					setSecondgearratio(1.940f);
					setThirdgearratio(1.340f);
					setFourthgearratio(1.000f);
					setSixthgearratio(0.630f);

			}

		}
	}

	public void displayamt(String typeoftransmission, String model) {
		if (typeoftransmission.equals("AMT")) {
			switch (model) {
				case "AMTP4":
					System.out.println("Key Specisfications :");
					System.out.println("The Number of forward gears : " + getForwardgears());
					System.out.println("The First Gear ratio is :     " + getFirstgearratio());
					System.out.println("The Second Gear ratio is :    " + getSecondgearratio());
					System.out.println("The Third Gear ratio is :     " + getThirdgearratio());
					System.out.println("The Fourth Gear ratio is :    " + getFourthgearratio());
					break;

				case "AMTD5":
					System.out.println("Key Specisfications :");
					System.out.println("The Number of forward gears : " + getForwardgears());
					System.out.println("The First Gear ratio is :     " + getFirstgearratio());
					System.out.println("The Second Gear ratio is :    " + getSecondgearratio());
					System.out.println("The Third Gear ratio is :     " + getThirdgearratio());
					System.out.println("The Fourth Gear ratio is :    " + getFourthgearratio());
					System.out.println("The Fifth Gear ratio is :    " + getFifthgearratio());
					break;

			}

		}
	}

}
