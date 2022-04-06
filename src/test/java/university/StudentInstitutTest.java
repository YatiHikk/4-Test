package university;

import org.junit.Assert;
import org.junit.Test;
import service.UniversityService;
import service.UniversityServiceImpl;

import java.util.Date;

public class StudentInstitutTest {

    UniversityService universityService = new UniversityServiceImpl();

    @Test
    public void instantiationInstitut() {
        //Arrange & Act
        StudentInstitut actualInstitut = new StudentInstitut("surname",
                                                             "name",
                                                             "middle",
                                                             2000,
                                                             "instName",
                                                             "depart",
                                                             "spec",
                                                             1);
        //Assert

        StudentInstitut expectedInstitut = new StudentInstitut("surname",
                                                               "name",
                                                               "middle",
                                                               2000,
                                                               "instName",
                                                               "depart",
                                                               "spec",
                                                               1);

        Assert.assertEquals(expectedInstitut, actualInstitut);
    }


    @Test
    public void groupNumberCheck() {
        //Arrange & Act
        StudentInstitut actualInstitut = new StudentInstitut("surname",
                                                             "name",
                                                             "middle",
                                                             2000,
                                                             "instName",
                                                             "depart",
                                                             "spec",
                                                             -24);
        //Assert

    }

    @Test
    public void yearCheck() {
        //Arrange & Act
        StudentInstitut actualInstitut = new StudentInstitut("surname",
                                                             "name",
                                                             "middle",
                                                             2020,
                                                             "instName",
                                                             "depart",
                                                             "spec",
                                                             -24);
        //Assert
        Assert.assertNull(actualInstitut.getGroupNumber());
    }

    @Test
    public void competitionSumThrowCheck() {
        //Arrange & Act & Assert
        Assert.assertThrows(RuntimeException.class,
                            ()->universityService.createCompetition("town",
                                                                    new Date(),
                                                                    -20));
    }

    @Test
    public void competitionSumDoesntThrowCheck() {
        //Arrange & Act & Assert
        universityService.createCompetition("town",
                                            new Date(),
                                            1);
    }

    @Test
    public void olympiadPlaceThrowCheck() {
        //Arrange & Act & Assert
        Assert.assertThrows(RuntimeException.class,
                ()->universityService.createOlympiad("town",
                        new Date(),
                        -20));
    }

    @Test
    public void olympiadPlaceDoesntThrowCheck() {
        //Arrange & Act & Assert
        universityService.createOlympiad("town",
                new Date(),
                1);
    }

    @Test
    public void studentYearThrowCheck() {
        //Arrange & Act & Assert
        Assert.assertThrows(RuntimeException.class,
                ()->universityService.createStudent("surname",
                                                    "name",
                                                    "middle",
                                                    2001));
    }

    @Test
    public void studentYearDoesntThrowCheck() {
        //Arrange & Act & Assert
        universityService.createStudent("surname",
                                        "name",
                                        "middle",
                                        2099);
    }

    @Test
    public void studentInctitutGroupNumberThrowCheck() {
        //Arrange & Act & Assert
        Assert.assertThrows(RuntimeException.class,
                ()->universityService.createStudentInstitut("surname",
                                                            "name",
                                                            "middle",
                                                            2000,
                                                            "ENI",
                                                            "VYiKG",
                                                            "Applied Informatics",
                                                            10));
    }

    @Test
    public void studentInctitutGroupNumberDoesntThrowCheck() {
        //Arrange & Act & Assert
        universityService.createStudentInstitut("surname",
                                                "name",
                                                "middle",
                                                2000,
                                                "ENI",
                                                "VYiKG",
                                                "Applied Informatics",
                                                941);
    }

}