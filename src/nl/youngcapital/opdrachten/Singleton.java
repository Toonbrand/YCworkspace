package nl.youngcapital.opdrachten;

public class Singleton {
	private static Singleton _theInstance;
	
	private Singleton(){
		_theInstance = this;
	}
	
	public static Singleton getInstance(){
		if(_theInstance == null){
			new Singleton();
		}
		return _theInstance;
	}
}
