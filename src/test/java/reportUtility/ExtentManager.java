package reportUtility;

import com.relevantcodes.extentreports.ExtentReports;

public class ExtentManager {
    private static ExtentReports extent;
    
    public synchronized static ExtentReports getReporter(String filePath) {
        if (extent == null) {
            extent = new ExtentReports(filePath, true);
            
            extent
                .addSystemInfo("Host Name", "Ritesh Saw")
                .addSystemInfo("Environment", "QA")
                .addSystemInfo("Sprint", "2")
                .addSystemInfo("Application", "Java VM Solutions");
        }
        
        return extent;
    }
}