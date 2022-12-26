package Singleton;

public class AppConfig {
	private static AppConfig obj = null;
	private AppConfig(){
	   }
	public static AppConfig getInstance(){
		if(obj==null) {
			synchronized(AppConfig.class) {
				if(obj==null) {
					obj=new AppConfig();				}
			}
		}
				return obj;
	}
	public void show() {
		System.out.println("Appconfig class object");
		
	}
}
