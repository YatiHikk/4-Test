package university;
import java.util.ArrayList;

public class Student {
    String name, surname, middlename;
    int studentBookNumber;
    int year;
    ArrayList<Competition> competitions = new ArrayList<>();
    ArrayList<Conference> conferences = new ArrayList<>();
    ArrayList<Olympiad> olympiads = new ArrayList<>();


    public Student(String surname, String name, String middlename, int year){
        this.name = name;
        this.surname = surname;
        this.middlename = middlename;
        this.year = year;
        this.studentBookNumber = newStudentBookNumber();
    }

    public int newStudentBookNumber(){
        return (int)(Math.random()*(899999+1)) + 100000;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getMiddlename() {
        return middlename;
    }

    public void  getMiddlename(String surname) {
        this.middlename = middlename;
    }

    public int getStudentBookNumber() {
        return studentBookNumber;
    }

    public void setStudentBookNumber(int studentBookNumber) {
        this.studentBookNumber = studentBookNumber;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void addConference(Conference conference){
        conferences.add(conference);
    }

    public void addCompetition(Competition competition){
        competitions.add(competition);
    }

    public void addOlympiad(Olympiad olympiad){
        olympiads.add(olympiad);
    }

    public Competition getCompetition(int num) {
        return competitions.get(num);
    }

    public Conference getConference(int num) {
        return conferences.get(num);
    }

    public Olympiad getOlympiad(int num) {
        return olympiads.get(num);
    }

    public void printEvents(){
        printCompetitions();
        printConferences();
        printOlympiads();
    }

    public void printCompetitions(){
        System.out.println("Competitions");
        for(int i = 0; i < competitions.size(); i++){
            System.out.println("Town: " + getCompetition(i).getTown() + "; date: " +  getCompetition(i).getDate() + "; sum: "+ getCompetition(i).getSum());
        }
    }

    public void printConferences(){
        System.out.println("Conferences");
        for(int i = 0; i < conferences.size(); i++){
            System.out.println("Town: " + getConference(i).getTown() + "; date: " +  getConference(i).getDate() + "; material name: "+ getConference(i).getMaterialName());
        }
    }

    public void printOlympiads(){
        System.out.println("Olympiads");
        for(int i = 0; i < conferences.size(); i++){
            System.out.println("Town: " + getOlympiad(i).getTown() + "; date: " +  getOlympiad(i).getDate() + "; place: "+ getOlympiad(i).getPlace());
        }
    }
}
