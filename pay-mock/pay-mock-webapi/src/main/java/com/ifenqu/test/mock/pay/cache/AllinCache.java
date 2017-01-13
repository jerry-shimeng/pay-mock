package com.ifenqu.test.mock.pay.cache;

import com.ifenqu.test.mock.pay.models.AllinRequestModel;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by shi on 2017/1/9.
 */
public class AllinCache {

    private static Map<String, AllinRequestModel> map = new HashMap<>();

    private static Map<String, Integer> resultMap = new HashMap<>();

    public static String add(AllinRequestModel model) {
        String key = time();
        map.put(key, model);
        setResult(model.getOrder_id(), 0);
        return key;
    }

    public static AllinRequestModel get(String key) {
        return map.get(key);
    }

    public static void setResult(String key, int r) {
        AllinRequestModel allinRequestModel = get(key);
        if (allinRequestModel != null) {
            resultMap.put(allinRequestModel.getOrder_id(), r);
        }
    }

    public static int getResult(String orderId) {
        if (!resultMap.containsKey(orderId))
            return 111;
        return resultMap.get(orderId);
    }


    private static String time() {
        return String.valueOf(new Date().getTime());
    }
}
