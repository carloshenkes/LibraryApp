package com.acme.model.file;

import com.acme.model.Library;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class FileManager {


    public static void saveFile(Library lib, File f) {

        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        try {
            fos = new FileOutputStream(f);
            oos = new ObjectOutputStream(fos);
            oos.writeObject(lib);
        } catch (FileNotFoundException ex) {
            System.out.println("Problema: " + ex.getMessage());
        } catch (IOException ex) {
            System.out.println("Problema: " + ex.getMessage());
        } finally {
            try {
                oos.close();
                fos.close();
            } catch (Exception ex) {
                System.out.println("Erro: " + ex.getMessage());
            }
            System.out.println("Arquivo salvo com sucesso!!");
        }
    }
    
    public static Library openFile(File f){
        
        FileInputStream fis = null;
        ObjectInputStream ois = null;
        
        try {
            fis = new FileInputStream(f);
            ois = new ObjectInputStream(fis);
            Library lib = (Library)ois.readObject();
            return lib;

        } catch (FileNotFoundException ex) {
            System.out.println("Problema:" + ex.getMessage());
            return null;
        } catch (ClassNotFoundException ex) {
            System.out.println("Problema:" + ex.getMessage());
            return null;
        } catch (IOException ex) {
            System.out.println("Problema:" + ex.getMessage());
            return null;
        } finally {
            try {
                fis.close();
                ois.close();
            } catch (IOException ex) {
                System.out.println("Problema:" + ex.getMessage());
            }catch (Exception ex){
                System.out.println("Problem:"+ex.getMessage());
            }
            System.out.println("Arquivo recuperado com sucesso!!");
        }
    }

}
