/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MiniProject;
import java.io.*;
/**
 *
 * @author srinivas pavan
 */
public class Student implements Serializable{
    String UserName;
    String Password;
    Student()
    {
    }
    Student(String UserName,String Password)
    {
        this.UserName=UserName;
        this.Password=Password;
    }
    void setName(String UserName)
    {
        this.UserName=UserName;
    }
    void setPword(String Password)
    {
        this.Password=Password;
    }
    String getName()
    {
        return UserName;
    }
    String getPword()
    {
        return Password;
    }
}
