public class School
{
    private Student[] students;
    private Course[] catalog;
    
    public Student getStudentbyId(int searchId)
    {
        for(int index =0; index < students.length; index++)
        {
            if (students[index].getId() == (searchId) && students[index] != null)
            {
                return students[index];
            }
            else
            {
                return null;
            }
        }
        return null;
    }

    public double gpaForCourse(Course course)
    {
        int sum  = 0;
        for(int index = 0; index < Grades[].length;index++)
        {
            sum += grades[index].getGrade().getScore();
        }
    }
}