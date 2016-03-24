package nl.youngcapital.demos;

public class AccessDemo {
	
	class LowLevelDeviceAccess { public void clear(){} }

	/* Superclass */
	class TemperatureSensor { 
		private LowLevelDeviceAccess _myDevice;
		protected void calibrate(){}
		public int tempInKelvin(){ return 0; }
	}
	
	class CelciusTempSensor extends TemperatureSensor {
		void myCalibrate(){ 
			calibrate();      // ok: protected in super
			this.calibrate();
			super.calibrate();
			
			/* _myDevice.clear(); // not ok: private in super
			this._myDevice.clear();
			super._myDevice.clear(); */
			
		}
		
		public int tempInCelcius(){ 
			return tempInKelvin() + 273; // ok: public in super
		}
	}
}
