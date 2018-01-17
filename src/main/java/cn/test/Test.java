package cn.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import net.sf.json.JSONArray;

public class Test {
	public void jsonTest(String user,String username){
		//声明一个Hash对象并添加数据
		Map params =  new HashMap();

		params.put("username", username);
		params.put("user_json", user);

		//声明JSONArray对象并输入JSON字符串
		JSONArray array = JSONArray.fromObject(params);
		System.out.println(array.toString());
		
	}
	public static void main(String[] args) {
		Test test=new Test();
		test.jsonTest("11", "22");
		
		//初始化ArrayList集合并添加数据
        List<String> list = new ArrayList<String>();
        list.add("username");
        list.add("age");
        list.add("sex");
      
        
        //初始化HashMap集合并添加数组
        Map map = new HashMap();
        map.put("bookname", "CSS3实战");
        map.put("price", 69.0);
        
        //初始化JSONArray对象，并添加数据
        JSONArray array = new JSONArray();
        array.add(list);
        array.add(map);
        System.out.println(array.toString());
        
        //生成的JSON字符串为：[["username","age","sex"],{"price":69,"bookname":"CSS3实战"}]
		
	}


}
