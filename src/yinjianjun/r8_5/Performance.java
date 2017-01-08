package r8_5;

import org.junit.Test;

/**
 * Created by yinjianjun on 17-1-8.
 */
public class Performance {
    public String[] _data = new String[3];

//    public static void main(String[] args){

    @Test
    public void testArray(){
        Performance performance = new Performance();
        performance._data[0] = "Liverpool";
        performance._data[1] = "15";
        performance._data[2] = "13";
        System.out.println(performance._data);
        for (int i = 0; i < performance._data.length; i++){
            System.out.print(performance._data[i] + "\t");
        }
        System.out.println();
    }

    private String name;
    private int win;
    private int lose;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWin() {
        return win;
    }

    public void setWin(int win) {
        this.win = win;
    }

    public int getLose() {
        return lose;
    }

    public void setLose(int lose) {
        this.lose = lose;
    }

    @Override
    public String toString(){
        return "[name:" + name + ", win:" + win + ", lose:" + lose + "]";
    }

    @Test
    public void testObject(){
        Performance performance = new Performance();
        performance.setName("Liverpool");
        performance.setWin(15);
        performance.setLose(13);
        System.out.println(performance);
    }

}
