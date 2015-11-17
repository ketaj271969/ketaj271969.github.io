package playground;

import java.io.File;

import org.easybatch.core.job.Job;
import org.easybatch.core.job.JobBuilder;
import org.easybatch.core.job.JobExecutor;
import org.easybatch.core.job.JobReport;
import org.easybatch.flatfile.FlatFileRecordReader;
import org.easybatch.flatfile.DelimitedRecordMapper;

public class LauncherCSV {

	    public static void main(String[] args) throws Exception {

	        // Build an easy batch engine
	        Job job = new JobBuilder()
	            // requirement N�1
	            .reader(new FlatFileRecordReader(new File("C:/Users/Tobias/Documents/greetings.csv")))
	            // requirement N�2
	            .mapper(
						new DelimitedRecordMapper(Greeting.class, "id", "name"))
	            // requirement N�3
	            .processor(new GreetingProcessor())
	            .build();

	        // Run easy batch job
	        JobReport jobReport = JobExecutor.execute(job);

	        // Print the job execution report
	        System.out.println(jobReport);
	    }

	}
