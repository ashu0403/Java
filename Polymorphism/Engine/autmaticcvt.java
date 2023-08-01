public class autmaticcvt extends lukxtech {
	public autmaticcvt(String typeoftransmission) {
		if (typeoftransmission.equals("Automatic-CVT")) {
			super.setForwardgears(6);
			super.setFirstgearratio(2.631f);
			super.setSecondgearratio(1.440f);
			super.setThirdgearratio(1.165f);
			super.setFourthgearratio(0.906f);
			super.setFifthgearratio(0.680f);
			super.setSixthgearratio(0.499f);

		} else if (typeoftransmission.equals("Automatic-DCT")) {
			super.setForwardgears(8);
			super.setFirstgearratio(4.714f);
			super.setSecondgearratio(3.143f);
			super.setThirdgearratio(2.106f);
			super.setFourthgearratio(1.6676f);
			super.setFifthgearratio(1.285f);
			super.setSixthgearratio(1.00f);
			super.setSeventhgearratio(0.839f);
			super.setEighthgearratio(0.667f);

		}
	}

	public void automaticcvt(String typeoftransmission) {
		if (typeoftransmission.equals("Automatic-CVT")) {
			System.out.println("Key Specisfications :");
			System.out.println("The Number of forward gears : " + getForwardgears());
			System.out.println("The First Gear ratio is :     " + getFirstgearratio());
			System.out.println("The Second Gear ratio is :    " + getSecondgearratio());
			System.out.println("The Third Gear ratio is :     " + getThirdgearratio());
			System.out.println("The Fourth Gear ratio is :    " + getFourthgearratio());
			System.out.println("The Fifth Gear ratio is :    " + getFifthgearratio());
			System.out.println("The Sixth Gear ratio is :    " + getSixthgearratio());

		} else if (typeoftransmission.equals("Automatic-DCT")) {
			System.out.println("Key Specisfications :");
			System.out.println("The Number of forward gears : " + getForwardgears());
			System.out.println("The First Gear ratio is :     " + getFirstgearratio());
			System.out.println("The Second Gear ratio is :    " + getSecondgearratio());
			System.out.println("The Third Gear ratio is :     " + getThirdgearratio());
			System.out.println("The Fourth Gear ratio is :    " + getFourthgearratio());
			System.out.println("The Fifth Gear ratio is :    " + getFifthgearratio());
			System.out.println("The Sixth Gear ratio is :    " + getSixthgearratio());
			System.out.println("The Seventh Gear ratio is :  " + getSeventhgearratio());
			System.out.println("The Eight Gear ratio is :    " + getEighthgearratio());

		}
	}

}