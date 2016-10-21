public class Student
{
    private String name;
    private int gradeLevel;
    private Grade[] grades;

    public String[] getCourseNameWithGradesBetterThan(double grade)
    {
        for(int index = 0; index < grades.length; index++)
        {
            if(grades[index] > grade)
            {
                System.out.println(grades[index]);
            }
        }
    }
}