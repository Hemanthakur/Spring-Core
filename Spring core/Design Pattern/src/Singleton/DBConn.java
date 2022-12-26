package Singleton;


public class DBConn {

	private static DBConn obj = null;

	private DBConn() {

	}

	public static DBConn getInstance() {
		if(obj==null) {
			synchronized(AppConfig.class) {
				if(obj==null) {
					obj=new DBConn();				}
			}
		}
				return obj;
	}
	public void display() {
		System.out.println("This is an object of DBConn class");
	}
}
