package DP_01_b;

public class Main {
	public static void main(String args[]) {
		SamsungNote phone1 = new SamsungNote();
		System.out.println("Samsung Phone: " + phone1.GetPhonePart1() + " " + phone1.GetPart1Cost());
		
		Redmi7 phone2 = new Redmi7();
		System.out.println("Chinese Phone: " + phone2.GetPhonePart1() + " " + phone2.GetPart1Cost());
	}
}
