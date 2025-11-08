import java.util.List;
import java.util.Arrays;

abstract class CourseType {}
class ExamCourse extends CourseType {}
class AssignmentCourse extends CourseType {}
class ResearchCourse extends CourseType {}

class Course<T extends CourseType> {
    private String title;
    public Course(String t){ title = t; }
    public String toString(){ return title; }
}

public class CourseManagement {
    public static void printCourses(List<? extends CourseType> types){
        for(CourseType c: types) System.out.println(c.getClass().getSimpleName());
    }
    public static void main(String[] args){
        Course<ExamCourse> c1 = new Course<>("Math Exam");
        Course<AssignmentCourse> c2 = new Course<>("English Assignment");
        System.out.println(c1);
        System.out.println(c2);
        printCourses(Arrays.asList(new ExamCourse(), new ResearchCourse()));
    }
}
