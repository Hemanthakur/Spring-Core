package chainOfResponsibility;

public class Supervisor implements ILeaveRequestHandler{
	
	ILeaveRequestHandler nextHandler; 
	@Override
	public void HandleRequest(LeaveRequest request) {
		// TODO Auto-generated method stub
		if(request.getNoOfDays()>=1 && request.getNoOfDays()<=3) 
			System.out.println(request.getNoOfDays()+" day/days leave granted for "+request.getName()+" from Supervisor.");
		else {
			ILeaveRequestHandler nextHandler = new ProjectManager();
			nextHandler.HandleRequest(request);
		}
			
	}

}
