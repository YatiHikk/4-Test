package service;

import university.*;

import java.util.Date;

public class UniversityServiceImpl implements UniversityService {
    @Override
    public Competition createCompetition(String town, Date date, int sum) {

        if (sum < 0) {
            throw new RuntimeException("sum < 0");
        }

        return new Competition(town, date, sum);
    }

    @Override
    public Conference createConference(String town, Date date, String materialName) {
        return new Conference(town, date, materialName);
    }

    @Override
    public Olympiad createOlympiad(String town, Date date, int place) {

        if (place < 0) {
            throw new RuntimeException("place < 0");
        }

        return new Olympiad(town, date, place);
    }

    @Override
    public Student createStudent(String surname, String name, String middlename, int year) {

        if (year > 2003) {
            throw new RuntimeException("too young");
        }
        else if (year < 1950){
            throw new RuntimeException("too old");
        }

        return new Student(surname, name, middlename, year);
    }

    @Override
    public StudentInstitut createStudentInstitut(String surname, String name, String middlename, int year, String institutName, String department, String speciality, int groupNumber) {
        if (groupNumber < 100) {
            throw new RuntimeException("wrong number");
        }

        return new StudentInstitut(surname, name, middlename, year, institutName, department, speciality, groupNumber);
    }

}
