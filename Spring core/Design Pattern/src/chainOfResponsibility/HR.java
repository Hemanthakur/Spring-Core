package chainOfResponsibility;

public class HR implements ILeaveRequestHandler{
	
	
	@Override
	public void HandleRequest(LeaveRequest request) {
		// TODO Auto-generated method stub
		System.out.println(request.getNoOfDays()+" day/days leave granted for "+request.getName()+" from HR.");
		
	}

}
