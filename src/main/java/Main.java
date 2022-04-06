import university.Competition;
import university.Conference;
import university.Olympiad;
import university.StudentInstitut;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        StudentInstitut studentInstitut = new StudentInstitut("Ponomareva",
                                                              "Katy",
                                                              "Romanovna",
                                                              2000,
                                                              "ENI",
                                                              "VYiKG",
                                                              "Applied Informatics",
                                                              941);

        System.out.println(studentInstitut.getSurname() + " " +
                           studentInstitut.getName() + " " +
                           studentInstitut.getMiddlename() + " " +
                           studentInstitut.getYear() + " год. ");
        System.out.println(studentInstitut.getInstitutName() + " " +
                           studentInstitut.getDepartment() + " " +
                           studentInstitut.getSpeciality() + " " +
                           studentInstitut.getGroupNumber());

        System.out.println("Номер студенческой книжки: " +
                           studentInstitut.getStudentBookNumber());

        Date date = new Date();

        Conference conference = new Conference("Владивосток",
                                               date,
                                               "Проблемы управления Ж/Д путями");

        Competition competition = new Competition("Хабаровск",
                                                  date,
                                                  150000);

        Olympiad olympiad = new Olympiad("Биробиджан",
                                         date,
                                         2);

        studentInstitut.addCompetition(competition);
        studentInstitut.addConference(conference);
        studentInstitut.addOlympiad(olympiad);

        studentInstitut.printEvents();
    }
}
