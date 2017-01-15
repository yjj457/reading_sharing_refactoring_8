package zhouliang.r8_11.refact;

import zhouliang.r8_11.Course;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * Created by Joez on 2017/1/15.
 */
public class RefactPerson {

    private Set<Course> _courses = new HashSet<>();

    public void addCourse(Course course){
        _courses.add(course);
    }
    public void removeCourse(Course course){
        _courses.remove(course);
    }
    public void initializeCourses(Set set){
        if(null == set){
            return;
        }
//        Iterator iterator = set.iterator();
//        while(iterator.hasNext()){
//            addCourse((Course)iterator.next());
//        }
        _courses.addAll(set);
    }
    public Set getCourses(){
        return Collections.unmodifiableSet(_courses);
    }

    public int numberOfCourses(){
        return _courses.size();
    }


}
