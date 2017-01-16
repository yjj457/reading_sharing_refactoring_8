package zhouliang.r8_11.Before;

import zhouliang.r8_11.Course;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by Joez on 2017/1/15.
 */
public class TestMain {
    public static void main(String[] args){
        Person person = new Person();
        Set<Course> s = new HashSet<>();
        s.add(new Course("first",true));
        s.add(new Course("second",false));
        person.set_courses(s);

        //
        int size = person.get_courses().size();
        System.out.println(size);

        Course third = new Course("third",false);
        person.get_courses().add(third);

        size = person.get_courses().size();
        System.out.println(size);

        person.get_courses().remove(third);
        size = person.get_courses().size();
        System.out.println(size);

    }
}
