package 校招笔试.迅雷;



/**
 * Created by 周杰伦 on 2018/9/12.
 */
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

import java.util.*;
public class 成绩列表 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        sort(s);
    }
    public static void sort(String s) {

        JSONArray arr = JSONArray.parseArray(s);

        List<JSONObject> list = new ArrayList<>();
        for (Object object : arr) {
            JSONObject json = (JSONObject) object;
            list.add(json);
        }
        list.sort(new Comparator<JSONObject>() {
            @Override
            public int compare(JSONObject json1, JSONObject json2) {
                if (json1.getIntValue("class") == json2.getIntValue("class")) {
                    return json1.getIntValue("score") - json2.getIntValue("score");
                }else {
                    return json1.getIntValue("class") - json2.getIntValue("class");
                }
            }
        });
        JSONArray res = new JSONArray();
        for (JSONObject object : list) {
            JSONObject obj = new JSONObject(new LinkedHashMap<>());
            obj.put("name",object.get("name"));
            obj.put("class",object.get("class"));
            obj.put("score",object.get("score"));
            res.add(obj);
        }
        System.out.println(res);
    }
}
