package Quiz2Solution;

public class School
{
    private Student[] students;
    private Course[] courses;
  
    public School(){
        students = new Student[5];
        courses = new Course[3];
        
        for ( int i = 0; i < courses.length; i++){
            courses[i] = new Course("Course:"+i, "Teacher:"+i);
        }
        
        for( int i = 0; i < students.length; i++){
            Student s = new Student("Student:"+i, 12);
            for ( Course c : courses ){
                s.addGrade(new Grade(c, Math.random() * 4.0));
            }
            students[i] = s;
        }
    }   
    
    public Student getStudentById(int searchId){
        Student match = null;
        for (  int i = 0; i < students.length; i++ ){
            Student thisStudent = students[i];
            
            if ( thisStudent != null && thisStudent.getId() == searchId ){
                match = students[i];
            }
        }
        
        return match;
    } 
    
    public double gpaForCourse(Course course){
        double gpa = -1;
        double count = 0;
        double total = 0;
        
        for ( int i = 0; i < students.length; i++){
            Student thisStudent = students[i];
            if ( thisStudent != null ){
                Grade[] myGrades = thisStudent.getGrade();
                for( int j = 0; j < myGrades.length; j++){
                    Grade thisGrade = myGrades[j];
                    if ( thisGrade != null && thisGrade.getCourse() == course ){
                            total += thisGrade.getGrade();
                            count++;
                        }
                        
                    }
                }
            }   
        
        if ( count > 0 ){
            gpa = total / count;
        }
        
        return gpa;
    }
 
    
    
    public static void main(String[] args){
        School school = new School();
        for ( Student s : school.students ){
            System.out.println(s.getName());
            for ( String courseName :  s.getCourseNamesWithGradeBetterThan(3.0)){
                if ( courseName != null ){
                    System.out.println(courseName);
                }
            }
        }
    }
}