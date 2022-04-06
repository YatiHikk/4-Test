package university;

import java.util.Objects;

public class StudentInstitut extends Student{
    String institutName;
    String department;
    String speciality;
    int groupNumber;

    public StudentInstitut(String surname, String name, String middlename, int year, String institutName, String department, String speciality, int groupNumber) {
        super(surname, name, middlename, year);
        this.institutName = institutName;
        this.department = department;
        this.speciality = speciality;
        this.groupNumber = groupNumber;
    }

    public String getInstitutName() {
        return institutName;
    }

    public String getDepartment() {
        return department;
    }

    public String getSpeciality() {
        return speciality;
    }

    public int getGroupNumber() {
        return groupNumber;
    }

    public void setInstitutName(String institutName) {
        this.institutName = institutName;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    public void setGroupNumber(int groupNumber) {
        this.groupNumber = groupNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof StudentInstitut)) return false;
        StudentInstitut that = (StudentInstitut) o;
        return groupNumber == that.groupNumber && Objects.equals(institutName, that.institutName) && Objects.equals(department, that.department) && Objects.equals(speciality, that.speciality);
    }

    @Override
    public int hashCode() {
        return Objects.hash(institutName, department, speciality, groupNumber);
    }
}
