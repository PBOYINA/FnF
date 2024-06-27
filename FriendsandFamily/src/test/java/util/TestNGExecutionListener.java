package util;


import org.testng.IExecutionListener;

public class TestNGExecutionListener implements IExecutionListener {
    public void onExecutionStart() {
    	
    }
    public void onExecutionFinish() {
        
        try {
			GenerateReport.generateMasterthoughtReport();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
    }
}
