import com.google.gson.Gson;

import java.util.HashMap;
import java.util.Map;

public class HelloWorld {

    public String helloWorld(){
        Gson gson = new Gson();
        Map<String,String> map = new HashMap<>();
        map.put("hello", "world");
        String jsonString = gson.toJson(map);
        return jsonString;
    }





}
