package model.writer;
import java.io.*;

public class FileHandlere implements Saviable{

    public boolean save(Serializable serializable, String filePath){
        try(ObjectOutputStream objectOutputStream = new ObjectOutputStream( new FileOutputStream(filePath))) {
            objectOutputStream.writeObject(serializable);
            return true;
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    } 

    public Object read(String filePath){
        try(ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(filePath))) {
            return objectInputStream.readObject();
        } catch (ClassNotFoundException e) {    
            e.printStackTrace();
            return null;
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
   


    
}
