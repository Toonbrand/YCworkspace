package nl.youngcapital.mobilephone;

public class Samsung extends MobilePhone implements USBCharger{
	
	private String brand = "Samsung";

	@Override
	public void charge() {
		System.out.println("charging");
	}
	
	@Override
	public String getOS() {
		return brand;
	}
}
