package playground;

import java.io.File;

import org.easybatch.core.impl.EasyBatchEngine;
import org.easybatch.core.impl.EasyBatchEngineBuilder;
import org.easybatch.core.api.EasyBatchReport;
import org.easybatch.flatfile.FlatFileRecordReader;
import org.easybatch.flatfile.dsv.DelimitedRecordMapper;

public class LauncherCIA {

	    public static void main(String[] args) throws Exception {

	        // Build an easy batch engine
	        EasyBatchEngine easyBatchEngine = new EasyBatchEngineBuilder()
	            // requirement N°1
	            .registerRecordReader(new FlatFileRecordReader(new File("C:/Users/Tobias/Documents/CIAInquiryReport.csv")))
	            // requirement N°2
	            .registerRecordMapper(
	                new DelimitedRecordMapper(CentralIdentityAuditPoint.class, new String[]{"DateTimeStamp", "LANID", "SourceApplication", "SourceProcess", "RequestIdentifier", "RequestSubmitter", "RequestApprover", "AuditAction", "AuditPointDetails"}))
	            // requirement N°3
	            .registerRecordProcessor(new CIAProcessor())
	            .build();

	        // Run easy batch engine
	        EasyBatchReport easyBatchReport = easyBatchEngine.call();

	        // Print the batch execution report
	        System.out.println(easyBatchReport);
	    }

	}
