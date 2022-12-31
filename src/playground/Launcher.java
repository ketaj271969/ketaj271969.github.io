package playground;

import java.sql.Connection;
import java.sql.DriverManager;

import org.easybatch.core.impl.EasyBatchEngine;
import org.easybatch.core.impl.EasyBatchEngineBuilder;
import org.easybatch.jdbc.JdbcRecordReader;
import org.easybatch.jdbc.JdbcRecordMapper;

public class Launcher {

    public static void main(String[] args) throws Exception {

        // create an embedded hsqldb in-memory database
        Connection connection = DriverManager.getConnection("jdbc:hsqldb:mem", "sa", "");
        DbUtils.populateEmbeddedDB(connection);

        // Build an easy batch engine
        EasyBatchEngine easyBatchEngine = new EasyBatchEngineBuilder()
            // requirement N°1
            .registerRecordReader(new JdbcRecordReader( 
                connection, // database JDBC connection
                "select * from greeting")) // Query string to fetch data
            // requirement N°2
            .registerRecordMapper(new JdbcRecordMapper(Greeting.class))
            // requirement N°3 
            .registerRecordProcessor(new GreetingProcessor()) 
            .build();

        // Run easy batch engine
        EasyBatchReport easyBatchReport = easyBatchEngine.call();

        // Print the batch execution report
        System.out.println(easyBatchReport);
    }
}
