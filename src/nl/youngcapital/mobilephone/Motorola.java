package nl.youngcapital.mobilephone;

public class Motorola extends MobilePhone implements USBCharger {
	public String brand = "Motorola";

	@Override
	public void charge() {
		System.out.println("Charging");
	}

	@Override
	public	String getOS() {
		return brand;
	}

	

}
