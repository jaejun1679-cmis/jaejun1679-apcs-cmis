public class Grade
{
    private Course course;
    private double grade;
    public Grade(Course course, double grade){
        this.course = course;
        this.grade = grade;
    }
    public Course getCourse(){
        return course;
    }
    public double getGrade(){
        return grade;
    }
    public void setGrade(double newGrade){
        grade = newGrade;
    }
}