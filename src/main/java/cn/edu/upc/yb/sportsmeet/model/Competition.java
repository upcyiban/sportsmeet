package cn.edu.upc.yb.sportsmeet.model;
import javax.persistence.*;


/**
 * Created by wanghaojun on 2016/5/18.
 */
@Table(name = "Competition")
@Entity
public class Competition {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String sportname;

    private String studentname1;
    private String studentgrate1;
    private String studentname2;
    private String studentgrate2;
    private String studentname3;
    private String studentgrate3;
    private String studentname4;
    private String studentgrate4;
    private String studentname5;
    private String studentgrate5;
    private String studentname6;
    private String studentgrate6;
    private String studentname7;
    private String studentgrate7;
    private String studentname8;
    private String studentgrate8;

    public Competition(String sportname, String studentname1, String studentgrate1, String studentname2, String studentgrate2, String studentname3, String studentgrate3, String studentname4, String studentgrate4, String studentname5, String studentgrate5, String studentname6, String studentgrate6, String studentname7, String studentgrate7, String studentname8, String studentgrate8) {
        this.sportname = sportname;
        this.studentname1 = studentname1;
        this.studentgrate1 = studentgrate1;
        this.studentname2 = studentname2;
        this.studentgrate2 = studentgrate2;
        this.studentname3 = studentname3;
        this.studentgrate3 = studentgrate3;
        this.studentname4 = studentname4;
        this.studentgrate4 = studentgrate4;
        this.studentname5 = studentname5;
        this.studentgrate5 = studentgrate5;
        this.studentname6 = studentname6;
        this.studentgrate6 = studentgrate6;
        this.studentname7 = studentname7;
        this.studentgrate7 = studentgrate7;
        this.studentname8 = studentname8;
        this.studentgrate8 = studentgrate8;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSportname() {
        return sportname;
    }

    public void setSportname(String sportname) {
        this.sportname = sportname;
    }

    public String getStudentname1() {
        return studentname1;
    }

    public void setStudentname1(String studentname1) {
        this.studentname1 = studentname1;
    }

    public String getStudentgrate1() {
        return studentgrate1;
    }

    public void setStudentgrate1(String studentgrate1) {
        this.studentgrate1 = studentgrate1;
    }

    public String getStudentname2() {
        return studentname2;
    }

    public void setStudentname2(String studentname2) {
        this.studentname2 = studentname2;
    }

    public String getStudentgrate2() {
        return studentgrate2;
    }

    public void setStudentgrate2(String studentgrate2) {
        this.studentgrate2 = studentgrate2;
    }

    public String getStudentname3() {
        return studentname3;
    }

    public void setStudentname3(String studentname3) {
        this.studentname3 = studentname3;
    }

    public String getStudentgrate3() {
        return studentgrate3;
    }

    public void setStudentgrate3(String studentgrate3) {
        this.studentgrate3 = studentgrate3;
    }

    public String getStudentname4() {
        return studentname4;
    }

    public void setStudentname4(String studentname4) {
        this.studentname4 = studentname4;
    }

    public String getStudentgrate4() {
        return studentgrate4;
    }

    public void setStudentgrate4(String studentgrate4) {
        this.studentgrate4 = studentgrate4;
    }

    public String getStudentname5() {
        return studentname5;
    }

    public void setStudentname5(String studentname5) {
        this.studentname5 = studentname5;
    }

    public String getStudentgrate5() {
        return studentgrate5;
    }

    public void setStudentgrate5(String studentgrate5) {
        this.studentgrate5 = studentgrate5;
    }

    public String getStudentname6() {
        return studentname6;
    }

    public void setStudentname6(String studentname6) {
        this.studentname6 = studentname6;
    }

    public String getStudentgrate6() {
        return studentgrate6;
    }

    public void setStudentgrate6(String studentgrate6) {
        this.studentgrate6 = studentgrate6;
    }

    public String getStudentname7() {
        return studentname7;
    }

    public void setStudentname7(String studentname7) {
        this.studentname7 = studentname7;
    }

    public String getStudentgrate7() {
        return studentgrate7;
    }

    public void setStudentgrate7(String studentgrate7) {
        this.studentgrate7 = studentgrate7;
    }

    public String getStudentname8() {
        return studentname8;
    }

    public void setStudentname8(String studentname8) {
        this.studentname8 = studentname8;
    }

    public String getStudentgrate8() {
        return studentgrate8;
    }

    public void setStudentgrate8(String studentgrate8) {
        this.studentgrate8 = studentgrate8;
    }
}
