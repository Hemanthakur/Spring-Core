package chainOfResponsibility;

public interface ILeaveRequestHandler {
	public ILeaveRequestHandler nextHandler = null;
	public void HandleRequest(LeaveRequest request);
}
