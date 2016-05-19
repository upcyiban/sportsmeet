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
    private String studentgrade1;
    private String studentname2;
    private String studentgrade2;
    private String studentname3;
    private String studentgrade3;
    private String studentname4;
    private String studentgrade4;
    private String studentname5;
    private String studentgrade5;
    private String studentname6;
    private String studentgrade6;
    private String studentname7;
    private String studentgrade7;
    private String studentname8;
    private String studentgrade8;

    public Competition(String sportname, String studentname1, String studentgrade1, String studentname2, String studentgrade2, String studentname3, String studentgrade3, String studentname4, String studentgrade4, String studentname5, String studentgrade5, String studentname6, String studentgrade6, String studentname7, String studentgrade7, String studentname8, String studentgrade8) {
        this.sportname = sportname;
        this.studentname1 = studentname1;
        this.studentgrade1 = studentgrade1;
        this.studentname2 = studentname2;
        this.studentgrade2 = studentgrade2;
        this.studentname3 = studentname3;
        this.studentgrade3 = studentgrade3;
        this.studentname4 = studentname4;
        this.studentgrade4 = studentgrade4;
        this.studentname5 = studentname5;
        this.studentgrade5 = studentgrade5;
        this.studentname6 = studentname6;
        this.studentgrade6 = studentgrade6;
        this.studentname7 = studentname7;
        this.studentgrade7 = studentgrade7;
        this.studentname8 = studentname8;
        this.studentgrade8 = studentgrade8;
    }
    public Competition(){}

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

    public String getStudentgrade1() {
        return studentgrade1;
    }

    public void setStudentgrade1(String studentgrade1) {
        this.studentgrade1 = studentgrade1;
    }

    public String getStudentname2() {
        return studentname2;
    }

    public void setStudentname2(String studentname2) {
        this.studentname2 = studentname2;
    }

    public String getStudentgrade2() {
        return studentgrade2;
    }

    public void setStudentgrade2(String studentgrade2) {
        this.studentgrade2 = studentgrade2;
    }

    public String getStudentname3() {
        return studentname3;
    }

    public void setStudentname3(String studentname3) {
        this.studentname3 = studentname3;
    }

    public String getStudentgrade3() {
        return studentgrade3;
    }

    public void setStudentgrade3(String studentgrade3) {
        this.studentgrade3 = studentgrade3;
    }

    public String getStudentname4() {
        return studentname4;
    }

    public void setStudentname4(String studentname4) {
        this.studentname4 = studentname4;
    }

    public String getStudentgrade4() {
        return studentgrade4;
    }

    public void setStudentgrade4(String studentgrade4) {
        this.studentgrade4 = studentgrade4;
    }

    public String getStudentname5() {
        return studentname5;
    }

    public void setStudentname5(String studentname5) {
        this.studentname5 = studentname5;
    }

    public String getStudentgrade5() {
        return studentgrade5;
    }

    public void setStudentgrade5(String studentgrade5) {
        this.studentgrade5 = studentgrade5;
    }

    public String getStudentname6() {
        return studentname6;
    }

    public void setStudentname6(String studentname6) {
        this.studentname6 = studentname6;
    }

    public String getStudentgrade6() {
        return studentgrade6;
    }

    public void setStudentgrade6(String studentgrade6) {
        this.studentgrade6 = studentgrade6;
    }

    public String getStudentname7() {
        return studentname7;
    }

    public void setStudentname7(String studentname7) {
        this.studentname7 = studentname7;
    }

    public String getStudentgrade7() {
        return studentgrade7;
    }

    public void setStudentgrade7(String studentgrade7) {
        this.studentgrade7 = studentgrade7;
    }

    public String getStudentname8() {
        return studentname8;
    }

    public void setStudentname8(String studentname8) {
        this.studentname8 = studentname8;
    }

    public String getStudentgrade8() {
        return studentgrade8;
    }

    public void setStudentgrade8(String studentgrade8) {
        this.studentgrade8 = studentgrade8;
    }
}
