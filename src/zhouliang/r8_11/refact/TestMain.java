package zhouliang.r8_11.refact;

import zhouliang.r8_11.Course;

import java.util.Set;

/**
 * Created by Joez on 2017/1/15.
 */
public class TestMain {
    public static void main(String[] args){

        RefactPerson refactPerson = new RefactPerson();

        Course course = new Course("first",false);
        refactPerson.addCourse(course);

        int size = refactPerson.numberOfCourses();

        Set set = refactPerson.getCourses();
    }
}
