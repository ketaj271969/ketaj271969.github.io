package playground;

import org.easybatch.core.processor.RecordProcessingException;
import org.easybatch.core.processor.RecordProcessor;
import org.easybatch.core.record.Record;

public class CIAProcessor implements RecordProcessor<Record<CentralIdentityAuditPoint>, Record<CentralIdentityAuditPoint>> {

	@Override
	public Record<CentralIdentityAuditPoint> processRecord(Record<CentralIdentityAuditPoint> record) throws RecordProcessingException {
		System.out.println(record.getPayload().getCIAPoint());
		return record;
	}

}
