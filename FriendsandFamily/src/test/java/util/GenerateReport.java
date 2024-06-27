package util;


import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;


import java.io.File;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.io.FileUtils;



import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;
import org.apache.commons.io.FileUtils;

import java.io.File;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

public class GenerateReport {

    @SuppressWarnings("deprecation")
    public static void removeHooks(String jsonFile) throws Exception {
        String jsonValue = FileUtils.readFileToString(new File(jsonFile), StandardCharsets.UTF_8);
        jsonValue = jsonValue.replace("\"before\": [", "\"replacedToRemoveHook\": [");
        FileUtils.writeStringToFile(new File(jsonFile), jsonValue, StandardCharsets.UTF_8);
    }

    public static void generateMasterthoughtReport() throws Exception {
        File reportOutputDirectory = new File("target/Report");
        List<String> list = new ArrayList();
        String reportFolder = new File("./target/surefire-reports/json").getAbsolutePath();
        File folder = new File(reportFolder);
        File[] listOfFiles = folder.listFiles();
        if (listOfFiles != null) {
            for (File file : listOfFiles) {
                list.add(file.getPath());
                removeHooks(file.getPath());
            }

            Configuration configuration = new Configuration(reportOutputDirectory, "DisneyWorld");
            //configuration.setBuildNumber("Version - -- - 15.0.2");

            ReportBuilder reportBuilder = new ReportBuilder(list, configuration);
            reportBuilder.generateReports();
        }
    }
}
