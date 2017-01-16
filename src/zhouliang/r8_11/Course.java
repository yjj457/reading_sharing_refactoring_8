package zhouliang.r8_11;

/**
 * Created by Joez on 2017/1/15.
 */
public class Course {

    private String name;

    public boolean isAdvanced() {
        return isAdvanced;
    }

    public void setAdvanced(boolean advanced) {
        isAdvanced = advanced;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private boolean isAdvanced;

    public Course(String name,boolean isAdvanced){
        this.name = name;
        this.isAdvanced = isAdvanced;
    }

}
