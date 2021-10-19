package HomeWork01;

public class Main {
    public static void main(String[] args) {
        Team team1 = new Team("Команда 1");
        team1.allMembers();

        Course course = new Course();
        System.out.println(course.toString());

        team1.passedDistance(course);
    }
}