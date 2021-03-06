package nz.org.nesi.appmanage;

import com.beust.jcommander.Parameter;
import nz.org.nesi.appmanage.model.Documentation;

import java.util.List;

abstract class CreateAppListCliParameters extends AppManageModule {

	@Parameter(names = { "-o", "--output-file" }, description = "the path write the result page", required = false)
	private String outputFile = null;

    @Parameter(names = {"-t", "--tags"}, description = "only use applications with one of the specified tags (comman-seperated)")
    private String tags = null;

    @Parameter(names = {"--applications"}, description = "only create documentation for the specified application(s) (comma-separated list)")
    private List<String> applications;

    @Parameter(names = {"--template"}, description = "the velocity template to create the application list frontpage (optional, default is plain list of applications)")
    private String summaryTemplate = Documentation.SUMMARY_TEMPLATE_FILE_NAME;

    @Parameter(names = {"--ignore"}, description = "Blacklist (file or comma-separated list of strings) for applications to not include")
    private String ignore;

	public String getOutputFile() {
		return outputFile;
	}

    public List<String> getApplications() {
        return applications;
    }

    public String getSummaryTemplate() { return summaryTemplate; }

    public String getIgnore() { return ignore; }

    public String getTags() {
        return tags;
    }

}
