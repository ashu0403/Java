public class manual extends lukxtech {

	public manual(String typeoftransmission, String model)

	{
		if (typeoftransmission.equals("Manual")) {
			switch (model) {
				case "MP4":
					super.setForwardgears(4);
					super.setFirstgearratio(2.54f);
					super.setSecondgearratio(1.92f);
					super.setThirdgearratio(1.51f);
					super.setFourthgearratio(1.00f);
					break;

				case "MP5":
					super.setForwardgears(5);
					super.setFirstgearratio(3.545f);
					super.setSecondgearratio(1.904f);
					super.setThirdgearratio(1.280f);
					super.setFourthgearratio(0.914f);
					super.setFifthgearratio(0.757f);
					break;

				case "MP6":
					super.setForwardgears(6);
					super.setFirstgearratio(3.010f);
					super.setSecondgearratio(2.070f);
					super.setThirdgearratio(1.430f);
					super.setFourthgearratio(1.00f);
					super.setFifthgearratio(0.710f);
					super.setSixthgearratio(0.570f);
					break;

				case "MD5":
					super.setForwardgears(5);
					super.setFirstgearratio(3.545f);
					super.setSecondgearratio(1.904f);
					super.setThirdgearratio(1.233f);
					super.setFourthgearratio(0.911f);
					super.setFifthgearratio(0.725f);
					break;

				case "MD6":
					super.setForwardgears(6);
					super.setFirstgearratio(3.640f);
					super.setSecondgearratio(2.150f);
					super.setThirdgearratio(1.360f);
					super.setFourthgearratio(1.00f);
					super.setFifthgearratio(0.750f);
					super.setSixthgearratio(0.630f);
			}
		}
	}

	public void printdetails(String typeoftransmission, String model) {
		if (typeoftransmission.equals("Manual")) {
			switch (model) {
				case "MP4":
					System.out.println("Key Specisfications :");
					System.out.println("The Number of forward gears : " + getForwardgears());
					System.out.println("The First Gear ratio is :     " + getFirstgearratio());
					System.out.println("The Second Gear ratio is :    " + getSecondgearratio());
					System.out.println("The Third Gear ratio is :     " + getThirdgearratio());
					System.out.println("The Fourth Gear ratio is :    " + getFourthgearratio());
					break;

				case "MP5":
					System.out.println("Key Specisfications :");
					System.out.println("The Number of forward gears : " + getForwardgears());
					System.out.println("The First Gear ratio is :     " + getFirstgearratio());
					System.out.println("The Second Gear ratio is :    " + getSecondgearratio());
					System.out.println("The Third Gear ratio is :     " + getThirdgearratio());
					System.out.println("The Fourth Gear ratio is :    " + getFourthgearratio());
					System.out.println("The Fifth Gear ratio is :     " + getFifthgearratio());
					break;

				case "MP6":
					System.out.println("Key Specisfications :");
					System.out.println("The Number of forward gears : " + getForwardgears());
					System.out.println("The First Gear ratio is :     " + getFirstgearratio());
					System.out.println("The Second Gear ratio is :    " + getSecondgearratio());
					System.out.println("The Third Gear ratio is :     " + getThirdgearratio());
					System.out.println("The Fourth Gear ratio is :    " + getFourthgearratio());
					System.out.println("The Fifth Gear ratio is :     " + getFifthgearratio());
					System.out.println("The Sixth Gear ratio is :     " + getSixthgearratio());
					break;

				case "MD5":
					System.out.println("Key Specisfications :");
					System.out.println("The Number of forward gears : " + getForwardgears());
					System.out.println("The First Gear ratio is :     " + getFirstgearratio());
					System.out.println("The Second Gear ratio is :    " + getSecondgearratio());
					System.out.println("The Third Gear ratio is :     " + getThirdgearratio());
					System.out.println("The Fourth Gear ratio is :    " + getFourthgearratio());
					System.out.println("The Fifth Gear ratio is :    " + getFifthgearratio());
					break;

				case "MD6":
					System.out.println("Key Specisfications :");
					System.out.println("The Number of forward gears : " + getForwardgears());
					System.out.println("The First Gear ratio is :     " + getFirstgearratio());
					System.out.println("The Second Gear ratio is :    " + getSecondgearratio());
					System.out.println("The Third Gear ratio is :     " + getThirdgearratio());
					System.out.println("The Fourth Gear ratio is :    " + getFourthgearratio());
					System.out.println("The Fifth Gear ratio is :    " + getFifthgearratio());
					System.out.println("The Sixth Gear ratio is :    " + getSixthgearratio());
					break;
			}
		}
	}
}
