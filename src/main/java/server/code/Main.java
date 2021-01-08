package server.code;

import com.google.gson.Gson;
import server.code.ActionJson;

public class Main{
    public static void main(String[] args){

    }
    private static ActionJson GetJsonFromClient(String jsonString){
        Gson gson = new Gson();
        ActionJson deserialized = gson.fromJson(jsonString,ActionJson.class);
        return deserialized;
    }


}
