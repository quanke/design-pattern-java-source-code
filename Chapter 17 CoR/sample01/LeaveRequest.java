public class LeaveRequest
{
	private String leaveName;
	private int leaveDays;
	
	public LeaveRequest(String leaveName,int leaveDays)
	{
		this.leaveName=leaveName;
		this.leaveDays=leaveDays;
	}
	
	public void setLeaveName(String leaveName) {
		this.leaveName = leaveName; 
	}

	public void setLeaveDays(int leaveDays) {
		this.leaveDays = leaveDays; 
	}

	public String getLeaveName() {
		return (this.leaveName); 
	}

	public int getLeaveDays() {
		return (this.leaveDays); 
	}	
}