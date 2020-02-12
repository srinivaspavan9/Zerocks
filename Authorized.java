/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MiniProject;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author srinivas pavan
 */
public class Authorized {
    
  public  static  boolean isPresent (String s) throws IOException{
      File f1=new File("C:\\Users\\srinivas pavan\\Documents\\NetBeansProjects\\MyjavaApplication\\StudentID.ser");
      if(!f1.exists())
      {
          f1.createNewFile();
      }
        try {
            ObjectInputStream ois=new ObjectInputStream(new FileInputStream(f1));
            Student   s1=(Student)ois.readObject();
            while(s1.UserName!=null){
                if(s1.UserName.equals(s))
                    return true;
                s1=(Student)ois.readObject();
            }
            return false;
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Authorized.class.getName()).log(Level.SEVERE, null, ex);
        }
        catch(EOFException exp)
            {
                return false;
            }
        return false;
    }
  public static boolean isPassCorrect (String s) throws IOException{
      File f1=new File("C:\\Users\\srinivas pavan\\Documents\\NetBeansProjects\\MyjavaApplication\\StudentID.ser");
      if(!f1.exists())
      {
          f1.createNewFile();
      }
      try {
            ObjectInputStream ois=new ObjectInputStream(new FileInputStream(f1));
            Student s1=(Student)ois.readObject();
            while(s1.Password!=null){
                if(s1.Password.equals(s))
                    return true;
                s1=(Student)ois.readObject();
            }
            return false;
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Authorized.class.getName()).log(Level.SEVERE, null, ex);
        }
        catch(EOFException exp)
            {
                return false;
            }
        return false;
  }
}
