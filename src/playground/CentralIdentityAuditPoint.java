package playground;

public class CentralIdentityAuditPoint {
	/*
	 *
	 */

	public String getDateTimeStamp() {
		return DateTimeStamp;
	}

	public void setDateTimeStamp(String dateTimeStamp) {
		this.DateTimeStamp = dateTimeStamp;
	}

	public String getLANID() {
		return LANID;
	}

	public void setLANID(String lanID) {
		this.LANID = lanID;
	}

	public String getSourceApplication() {
		return SourceApplication;
	}

	public void setSourceApplication(String sourceApplication) {
		this.SourceApplication = sourceApplication;
	}

	public String getSourceProcess() {
		return SourceProcess;
	}

	public void setSourceProcess(String sourceProcess) {
		this.SourceProcess = sourceProcess;
	}

	public String getRequestIdentifier() {
		return RequestIdentifier;
	}

	public void setRequestIdentifier(String requestIdentifier) {
		this.RequestIdentifier = requestIdentifier;
	}

	public String getRequestSubmitter() {
		return RequestSubmitter;
	}

	public void setRequestSubmitter(String requestSubmitter) {
		this.RequestSubmitter = requestSubmitter;
	}

	public String getRequestApprover() {
		return RequestApprover;
	}

	public void setRequestApprover(String requestApprover) {
		this.RequestApprover = requestApprover;
	}

	public String getAuditAction() {
		return AuditAction;
	}

	public void setAuditAction(String auditAction) {
		this.AuditAction = auditAction;
	}

	public String getAuditPointDetails() {
		return AuditPointDetails;
	}

	public void setAuditPointDetails(String auditPointDetails) {
		this.AuditPointDetails = auditPointDetails;
	}

	private String DateTimeStamp;
	private String LANID;
	private String SourceApplication;
	private String SourceProcess;
	private String RequestIdentifier;
	private String RequestSubmitter;
	private String RequestApprover;
	private String AuditAction;
	private String AuditPointDetails;

	public String getCIAPoint() {
		return "DateTimeStamp: " + DateTimeStamp + " LANID: " + LANID;
	}

}