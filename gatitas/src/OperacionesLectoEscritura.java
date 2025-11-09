import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;

import java.io.*;

public class OperacionesLectoEscritura {
    public OperacionesLectoEscritura() {
    }
    public static void escribir(String fileName, JSONObject jsonObject){
        try(FileWriter fileWriter=new FileWriter(fileName)){
            fileWriter.write(jsonObject.toString(4));
        }catch (IOException e){e.printStackTrace();}
    }
    public static void escribir(String fileName, JSONArray jsonObject){
        try(FileWriter fileWriter=new FileWriter(fileName)){
            fileWriter.write(jsonObject.toString(4));
        }catch (IOException e){e.printStackTrace();}
    }


    public static JSONTokener tokener(String fileName){
        JSONTokener tokener=null;
        try {tokener=new JSONTokener(new FileReader(fileName));

        }catch (JSONException| FileNotFoundException exception){exception.printStackTrace();}

        return tokener;
    }


}
