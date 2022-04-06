package service;

import university.*;

import java.util.Date;

public interface UniversityService {
    public Competition createCompetition(String town, Date date, int sum);

    public Conference createConference(String town, Date date, String materialName);

    public Olympiad createOlympiad(String town, Date date, int place);

    public Student createStudent(String surname, String name, String middlename, int year);

    public StudentInstitut createStudentInstitut(String surname, String name, String middlename, int year, String institutName, String department, String speciality, int groupNumber);
}