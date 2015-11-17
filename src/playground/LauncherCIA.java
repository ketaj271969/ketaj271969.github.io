package playground;

import java.io.File;

import org.easybatch.core.job.Job;
import org.easybatch.core.job.JobBuilder;
import org.easybatch.core.job.JobExecutor;
import org.easybatch.core.job.JobReport;
import org.easybatch.flatfile.FlatFileRecordReader;
import org.easybatch.flatfile.DelimitedRecordMapper;

public class LauncherCIA {

	    public static void main(String[] args) throws Exception {

	        // Build an easy batch job
			Job job = new JobBuilder()
	            // requirement N�1
	            .reader(new FlatFileRecordReader(new File("C:/Users/Tobias/Documents/CIAInquiryReport.csv")))
	            // requirement N�2
	            .mapper(
						new DelimitedRecordMapper(CentralIdentityAuditPoint.class, "DateTimeStamp", "LANID", "SourceApplication", "SourceProcess", "RequestIdentifier", "RequestSubmitter", "RequestApprover", "AuditAction", "AuditPointDetails"))
	            // requirement N�3
	            .processor(new CIAProcessor())
	            .build();

	        // Run easy batch job
	        JobReport jobReport = JobExecutor.execute(job);

	        // Print the job execution report
	        System.out.println(jobReport);
	    }

	}
