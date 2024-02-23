package pl.asilver.university.entity;

public class University {
    private String universityName;

    public University(String universityName) {
        this.universityName = universityName;
    }

    public String getUniversityName() {
        return this.universityName;
    }

    public void setUniversityName(String universityName) {
        universityName = this.universityName;
    }
}
