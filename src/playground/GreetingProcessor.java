package playground;

import org.easybatch.core.processor.RecordProcessingException;
import org.easybatch.core.processor.RecordProcessor;
import org.easybatch.core.record.Record;

public class GreetingProcessor implements RecordProcessor<Record<Greeting>, Record<Greeting>> {

	@Override
	public Record<Greeting> processRecord(Record<Greeting> record) throws RecordProcessingException {
		System.out.println(record.getPayload().getGreetingMessage());
		return record;
	}

}
