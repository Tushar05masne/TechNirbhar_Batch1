package utilities;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import org.json.JSONArray;
import org.json.JSONObject;

public class JsonUtil2 {

	public static Map<String, String> getTestData(String logicalName, String arrayName) {
        Map<String, String> dataMap = new HashMap<>();
        try {
            String content = new String(Files.readAllBytes(Paths.get("src/test/resources/TestData.json")));
            JSONObject obj = new JSONObject(content);
            JSONArray arr = obj.getJSONArray(arrayName);

            for (int i = 0; i < arr.length(); i++) {
                JSONObject jobj = arr.getJSONObject(i);
                if (jobj.getString("LogicalName").equalsIgnoreCase(logicalName)) {
                    Iterator<String> keys = jobj.keys();
                    while (keys.hasNext()) {
                        String key = keys.next();
                        dataMap.put(key, jobj.getString(key));
                    }
                    break;
                }
            }
        } catch (Exception e) {
            throw new RuntimeException("Failed to fetch test data for: " + logicalName, e);
        }
        return dataMap;
    }
}
