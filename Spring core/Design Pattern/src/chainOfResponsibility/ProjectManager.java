package chainOfResponsibility;

public class ProjectManager implements ILeaveRequestHandler{

	ILeaveRequestHandler nextHandler;
	@Override
	public void HandleRequest(LeaveRequest request) {
		// TODO Auto-generated method stub
		if(request.getNoOfDays()>3 && request.getNoOfDays()<=5) 
			System.out.println(request.getNoOfDays()+" day/days leave granted for "+request.getName()+" from Project Manager.");
		else {
			ILeaveRequestHandler nextHandler = new HR();
			nextHandler.HandleRequest(request);
		}
	}

}
