package za.ac.cput.domain;
public class Resume {
    private String firstName;
    private String lastName;
    private String streetAddress;
    private String postalCode;
    private String phoneNumber;
    private String email;
    private String education;
    private String workExperience;
    private String skills;

    public Resume() {}

    public Resume(String firstName, String lastName, String streetAddress, String postalCode, String phoneNumber, String email, String education, String workExperience, String skills) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.streetAddress = streetAddress;
        this.postalCode = postalCode;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.education = education;
        this.workExperience = workExperience;
        this.skills = skills;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getStreetAddress() {
        return streetAddress;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public String getEducation() {
        return education;
    }

    public String getWorkExperience() {
        return workExperience;
    }

    public String getSkills() {
        return skills;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setStreetAddress(String streetAddress) {
        this.streetAddress = streetAddress;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    public void setWorkExperience(String workExperience) {
        this.workExperience = workExperience;
    }

    public void setSkills(String skills) {
        this.skills = skills;
    }

    @Override
    public String toString() {
        return "Resume{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", streetAddress='" + streetAddress + '\'' +
                ", postalCode='" + postalCode + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", email='" + email + '\'' +
                ", education='" + education + '\'' +
                ", workExperience='" + workExperience + '\'' +
                ", skills='" + skills + '\'' +
                '}';
    }
}