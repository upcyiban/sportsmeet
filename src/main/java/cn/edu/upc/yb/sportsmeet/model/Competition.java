package cn.edu.upc.yb.sportsmeet.model;

/**
 * Created by wanghaojun on 2016/5/18.
 */
public class Competition {
    private String name;
    private int id;
    private String[] studentnumber = new String[8];
    private String[] studentname = new String[8];
    private String[] studentmark = new String[8];

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public String[] getStudentnumber() {
        return studentnumber;
    }

    public String[] getStudentname() {
        return studentname;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setStudentnumber(String[] studentnumber) {
        this.studentnumber = studentnumber;
    }

    public void setStudentname(String[] studentname) {
        this.studentname = studentname;
    }

    public void setStudentmark(String[] studentmark) {
        this.studentmark = studentmark;
    }

    public String[] getStudentmark() {
        return studentmark;
    }
}
