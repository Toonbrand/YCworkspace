package nl.youngcapital.mobilephone;

import java.util.ArrayList;

public class MobileMain {
	public static void main(String[] args){
		ArrayList<MobilePhone> PhoneList = new ArrayList<>();
		PhoneList.add(new Motorola());	
		PhoneList.add(new Samsung());	
		PhoneList.add(new Apple());	
		PhoneList.add(new Nokia());	
		
		for(MobilePhone m: PhoneList){
			System.out.println(m.getOS());
			if(m instanceof USBCharger){
				((USBCharger) m).charge();
			}
			else{
				System.out.println("cannot charge");	
			}
		}
	}
}
