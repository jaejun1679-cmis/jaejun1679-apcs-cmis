public class Student
{
    private String name;
    private int gradeLevel;
    private Grade[] grades;
    
    public Student(String name, int gradeLevel){
        this.name = name;
        this.gradeLevel = gradeLevel;
        grades = new Grade[5];
    }
    
    public String getName(){
        return name;
    }
    
    public void addGrade(Grade newGrade){
        boolean added = false;
        for ( int i = 0; i < grades.length; i++){
            if ( grades[i] == null && !added ){
                grades[i] = newGrade;
                added = true;
            }
        }
    }
    
    public String[] getCourseNamesWithGradeBetterThan(double grade){
        String[] result = new String[grades.length];
        int resultIndex = 0;
        for( int i = 0; i < grades.length; i++){
            Grade thisGrade = grades[i];
            if( thisGrade != null && thisGrade.getGrade() > grade){
                Course course = thisGrade.getCourse();
                String courseName = course.getName();
                result[resultIndex++] = courseName;
            }
        }
        return result;
    }   
}