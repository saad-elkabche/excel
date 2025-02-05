/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package helpers;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 *
 * @author SaaDev
 */
public class ObjectDB {
    
    
    public static void saveObject(Serializable obj,String fileName) throws IOException{
        File file=new File(fileName);
        if(!file.exists()){
            file.createNewFile();
        }
        FileOutputStream fos=new FileOutputStream(file);
        ObjectOutputStream oos=new ObjectOutputStream(fos);
        oos.writeObject(obj);
    }
    public static Object getObject(String fileName) throws IOException, ClassNotFoundException{
        File file=new File(fileName);
        if(!file.exists()){
            file.createNewFile();
            return null;
        }
        FileInputStream fos=new FileInputStream(file);
        ObjectInputStream ois=new ObjectInputStream(fos);
        return ois.readObject();
    }
    
    
    
    
}
