package pl.asilver.university.entity;

public class University {
    private String universityName;

    public University() {
    }

    public University(String universityName) {
        this.universityName = universityName;
    }

    public String getUniversityName() {
        return this.universityName;
    }

    public void setUniversityName(String universityName) {
        this.universityName = universityName;
    }

    @Override
    public String toString() {
        return universityName;
    }
}
