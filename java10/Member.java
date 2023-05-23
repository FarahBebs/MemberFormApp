public class Member {
    private String fullName;
    private String phoneNumber;
    private String email;
    private String gender;

    public Member(String fullName, String phoneNumber, String email, String gender) {
        this.fullName = fullName;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.gender = gender;
    }

    public String getFullName() {
        return fullName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public String getGender() {
        return gender;
    }

    public String toString() {
        return fullName + "\t" + phoneNumber + "\t" + email + "\t" + gender;
    }
}
