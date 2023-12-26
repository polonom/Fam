package model.writer;

import java.io.Serializable;

public interface Saviable {
    boolean save(Serializable serializable, String filePath);
    Object  read(String filePath);
    
}
