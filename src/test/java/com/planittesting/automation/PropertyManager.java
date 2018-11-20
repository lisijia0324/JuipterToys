package com.planittesting.automation;

import java.io.*;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class PropertyManager {

    public String getPropertyValue(String propertyKey) throws Exception {
        String propertyValue = null;
        Boolean keyFound = false;
        try{
            Properties properties = new Properties();

            File propertyFile = new File(Constants.PROPERTY_FILE_PATH);
            InputStream is = new FileInputStream(propertyFile);
            properties.load(is);

            Set<Map.Entry<Object, Object>> entries = properties.entrySet();
            for(Map.Entry<Object, Object> entry: entries){
                if (propertyKey.equals(entry.getKey())){
                    propertyValue = entry.getValue().toString();
                    keyFound = true;
                }
            }
        }catch (Exception e){
            System.out.println("Exception: " + e);
        }
        if(!keyFound){
            throw new Exception("Property is not in the file");
        }
        return propertyValue;
    }
}
