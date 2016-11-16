package Quiz2Solution;

public class Student
{
    private String name;
    private int gradeLevel;
    private Grade[] grades;
    private static int nextId = 0;
    private int id;
    
    public Student(String name, int gradeLevel){
        id = nextId++;
        this.name = name;
        this.gradeLevel = gradeLevel;
        grades = new Grade[5];
    }
    
    public int getId(){
        return id;   
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
    
    public Grade[] minMaxGrades(){
        
        Grade[] minMax = new Grade[2];
        Grade min = null;
        Grade max = null;
        for( int i = 0; i < grades.length; i++){
            Grade thisGrade = grades[i];
            if ( thisGrade != null ){
                double score = thisGrade.getGrade();
                if ( min == null || score < min.getGrade() ){
                    min = thisGrade;
                }
                if ( max == null || score > max.getGrade() ){
                    max = thisGrade;
                }
            }
        }

        minMax[0] = min;
        minMax[1] = max;
        
        return minMax;
    }    
}