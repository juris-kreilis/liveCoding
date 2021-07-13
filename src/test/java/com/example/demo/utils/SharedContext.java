package com.example.demo.utils;

import java.util.HashMap;
import java.util.Map;

public class SharedContext {

    public static Map<String, Object> sharedContext = new HashMap<>();

    public static Object getContext(String key) {
        return sharedContext.get(key);
    }

    public static Object setContext(String key, Object value) {
        return sharedContext.put(key, value);
    }

}
