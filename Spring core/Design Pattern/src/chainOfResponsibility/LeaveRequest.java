package chainOfResponsibility;

public class LeaveRequest {
	private String empName;
	private int noOfDays;
	
	
	public int getNoOfDays() {
		return noOfDays;
	}
	public String getName() {
		return empName;
	} 
	
	public LeaveRequest(String name, int days) {
		this.empName=name;
		this.noOfDays=days;
	}
}
