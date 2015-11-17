package playground;

import java.sql.Connection;
import java.sql.DriverManager;

import org.easybatch.core.job.Job;
import org.easybatch.core.job.JobBuilder;
import org.easybatch.core.job.JobExecutor;
import org.easybatch.core.job.JobReport;
import org.easybatch.jdbc.JdbcRecordReader;
import org.easybatch.jdbc.JdbcRecordMapper;

public class Launcher {

    public static void main(String[] args) throws Exception {

        // create an embedded hsqldb in-memory database
        Connection connection = DriverManager.getConnection("jdbc:hsqldb:mem", "sa", "");
        DbUtils.populateEmbeddedDB(connection);

        // Build a batch job
        Job job = new JobBuilder()
            // requirement N�1
            .reader(new JdbcRecordReader(
                    connection, // database JDBC connection
                    "select * from greeting")) // Query string to fetch data
            // requirement N�2
            .mapper(new JdbcRecordMapper(Greeting.class))
            // requirement N�3
            .processor(new GreetingProcessor())
            .build();

        // Run the job
        JobReport jobReport = JobExecutor.execute(job);

        // Print the job execution report
        System.out.println(jobReport);
    }
}
