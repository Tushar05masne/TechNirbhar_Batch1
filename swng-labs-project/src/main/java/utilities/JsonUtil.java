package utilities;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import org.json.JSONObject;

public class JsonUtil {

//    // Reads a JSON file and returns the JSONObject for a given sheet
//    public static JSONObject Readjson(String jsonPath, String JsonSheet) throws IOException {
//    	
//    	
//	    String content = new String(Files.readAllBytes(Paths.get(jsonPath)));
//
//	   // JSONObject obj = new JSONObject(content);
//
//    	
//      //  String content = new String(Files.readAllBytes(Paths.get(jsonPath)));
//        JSONObject obj = new JSONObject(content);
//        return obj.getJSONObject(JsonSheet);
//    }
//
//    // Converts JSONObject into a Map<String, String>
//    public static Map<String, String> getTestData(String jsonPath, String testName) {
//        Map<String, String> dataMap = new HashMap<>();
//        try {
//            JSONObject jobj = Readjson(jsonPath, testName);
//            Iterator<String> keys = jobj.keys();
//
//            while (keys.hasNext()) {
//                String key = keys.next();
//                dataMap.put(key, jobj.getString(key));
//            }
//        } catch (Exception e) {
//            throw new RuntimeException("Failed to fetch test data for: " + testName, e);
//        }
//        return dataMap;
//    }
	
	public static Map<String, String> getTestData(String fileName, String testCaseName) {
	    Map<String, String> dataMap = new HashMap<>();
	    try (InputStream is = JsonUtil.class.getClassLoader().getResourceAsStream(fileName)) {
	        if (is == null) {
	            throw new RuntimeException("File not found in resources: " + fileName);
	        }
	        String content = new String(is.readAllBytes(), StandardCharsets.UTF_8);
	        JSONObject obj = new JSONObject(content);

	        if (!obj.has(testCaseName)) {
	            throw new RuntimeException("Test case not found: " + testCaseName);
	        }

	        JSONObject testData = obj.getJSONObject(testCaseName);
	        Iterator<String> keys = testData.keys();
	        while (keys.hasNext()) {
	            String key = keys.next();
	            dataMap.put(key, testData.getString(key));
	        }
	    } catch (Exception e) {
	        throw new RuntimeException("Failed to fetch test data for: " + testCaseName, e);
	    }
	    return dataMap;
	}

}
