package playground;

import org.easybatch.core.api.AbstractRecordProcessor;

public class CIAProcessor extends AbstractRecordProcessor<CentralIdentityAuditPoint> {

	@Override
	public void processRecord(CentralIdentityAuditPoint CIAPoint) throws Exception {
		System.out.println(CIAPoint.getCIAPoint());
	}

}