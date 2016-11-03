public class Student
{
    private String name; 
    private int gradeLevel;
    private int id;
    private Grade[] grades = new Grade[8];

    public Student(String name, int gradeLevel)
    {
        this.name = name;
        this.gradeLevel = gradeLevel; 
    }

    public int getId()
    {
        return id;
    }

    public Grade[] getGrades()
    {
        return grades;
    }

    /*public double getGpa()
    {

    }
     */
    public Grade[] minMaxGrades()
    {
        String[] result = new String[2];
        int index = 0;
        double min = 4.0;
        double max = 0;
               
        
        for(int index2 = 0; index2 < grades.length; index2++)
        {
            if(grades[index].getScore() > min)
            {
                grades[index].getScore() = min;
            }
            if(grade[index].getScore() > max)
            {
                grades[index].getScore() = max;
            }
            
            if (min == max)
            {
                result[0] = min;
                return min;
            }
            
            return null;
        }
        
        
        
    }
}