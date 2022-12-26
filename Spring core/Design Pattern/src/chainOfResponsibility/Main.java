package chainOfResponsibility;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LeaveRequest request = new LeaveRequest("Priya",6);
		Supervisor supervisor = new Supervisor();
		supervisor.HandleRequest(request);
	}

}
