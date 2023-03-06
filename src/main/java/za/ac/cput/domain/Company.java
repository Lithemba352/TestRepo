package za.ac.cput.domain;

public class Company {

    private String companyId;
    private String companyLocation;
    private String jobSpecs;
    private String companyName;

    public Company(String companyId, String companyLocation, String jobSpecs, String companyName) {
        this.companyId = companyId;
        this.companyLocation = companyLocation;
        this.jobSpecs = jobSpecs;
        this.companyName = companyName;
    }

    public String getCompanyId() {
        return companyId;
    }

    public void setCompanyId(String companyId) {
        this.companyId = companyId;
    }

    public String getCompanyLocation() {
        return companyLocation;
    }

    public void setCompanyLocation(String companyLocation) {
        this.companyLocation = companyLocation;
    }

    public String getJobSpecs() {
        return jobSpecs;
    }

    public void setJobSpecs(String jobSpecs) {
        this.jobSpecs = jobSpecs;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    @Override
    public String toString() {
        return "Company{" +
                "companyId='" + companyId + '\'' +
                ", companyLocation='" + companyLocation + '\'' +
                ", jobSpecs='" + jobSpecs + '\'' +
                ", companyName='" + companyName + '\'' +
                '}';
    }
}
