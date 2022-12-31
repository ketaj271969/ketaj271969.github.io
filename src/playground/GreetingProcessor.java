package playground;

import org.easybatch.core.api.AbstractRecordProcessor;

public class GreetingProcessor extends AbstractRecordProcessor<Greeting> {

	@Override
	public void processRecord(Greeting greeting) throws Exception {
		System.out.println(greeting.getGreetingMessage());
	}

}