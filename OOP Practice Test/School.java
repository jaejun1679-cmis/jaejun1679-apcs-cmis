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