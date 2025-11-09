import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

public class GestorGatita {
    private String nombreArchivo="gatitas.json";

    public GestorGatita() {
        this.nombreArchivo = nombreArchivo;
    }


    //leer
    public void gatitaArchivo(gatita g){OperacionesLectoEscritura.escribir(nombreArchivo,serializar(g));}
public JSONObject serializar(gatita a){
        JSONObject jsonObject=null;
        try {
            jsonObject = new JSONObject();
            jsonObject.put("name",a.getName());
            jsonObject.put("breed",a.getBreed());
            jsonObject.put("color",a.getColor());
            jsonObject.put("kittens",a.getGatitos());
        }catch (JSONException e){e.printStackTrace();}
        return jsonObject;
}
public void archivoGatita(){
    JSONTokener tokener=OperacionesLectoEscritura.tokener(nombreArchivo);
gatita leida=null;
try {
leida=deserializar(new JSONObject(tokener));
}catch (JSONException e){e.printStackTrace();}
}
public gatita deserializar(JSONObject jsonObject){
gatita gatita=new gatita();
try {
    gatita.setName(jsonObject.getString("name"));
    gatita.setBreed(jsonObject.getString("breed"));
    gatita.setColor(jsonObject.getString("color"));
    gatita.setGatitos(deserializarLista(jsonObject.getJSONArray("kittens")));
}catch (JSONException e){e.printStackTrace();}
return gatita;
}

public ArrayList<Kittens> deserializarLista(JSONArray jsonArray){
        ArrayList<Kittens> gatitos=new ArrayList<>();
        try {
            for (int i=0;i<jsonArray.length();i++){
                Kittens gatito=deserializargatitos(jsonArray.getJSONObject(i));
                gatitos.add(gatito);
            }
        }catch (JSONException e){e.printStackTrace();}
        return gatitos;
}
    public Kittens deserializargatitos(JSONObject jsonObject){
        Kittens gatito=new Kittens();
        try {
            gatito.setGender(jsonObject.getString("gender"));
            gatito.setName(jsonObject.getString("name"));

        }catch (JSONException e){e.printStackTrace();}
        return gatito;
    }

    public ArrayList<gatita>deserializarListaDeGATAS(JSONArray jsonArray){
        ArrayList<gatita>Lista=new ArrayList<>();
        try {
            for (int i=0;i<jsonArray.length();i++){
                gatita gata=deserializar(jsonArray.getJSONObject(i));
                Lista.add(gata);
            }
        }catch (JSONException e){e.printStackTrace();}
        return Lista;
    }

    public ArrayList<gatita> archivoLista(String nombreArchivo){
        JSONTokener tokener=OperacionesLectoEscritura.tokener(nombreArchivo);
        ArrayList<gatita>lista=null;
        try {
            lista=deserializarListaDeGATAS(new JSONArray(tokener));
        }catch (JSONException e){e.printStackTrace();}return lista;}

}
