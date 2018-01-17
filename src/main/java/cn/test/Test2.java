package cn.test;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;


import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

public class Test2 {
	 public static final String getMedial_URL = "http://192.168.1.25:6055/collectInfo/userList";

	    public static void appadd() {

	        try {
	            //创建连接
	            URL url = new URL(getMedial_URL);
	            HttpURLConnection connection = (HttpURLConnection) url
	                    .openConnection();
	            connection.setDoOutput(true);
	            connection.setDoInput(true);
	            connection.setRequestMethod("POST");
	            connection.setUseCaches(false);
	            connection.setInstanceFollowRedirects(true);
	         /*   connection.setRequestProperty("Content-Type",
	                    "application/x-www-form-urlencoded");*/
	            connection.setRequestProperty("Content-Type", "application/json; charset=utf-8");  //防止出现IO异常 415

	            connection.connect();
	           /* 
	            // @RequestBody ModelEntity model实体类
	            private String uniqueNo;
	        	private String serialNo;
	        	private String mac;
	        	private String imei;
	        	private String imsi;
	        	private String terType;
	        	private String osStr;
	        	private String model;
	        	private String userAgt;
	        	private Integer scrnW;
	        	private Integer scrnH;
	        	private String ip;
	        	private Integer longitude;
	        	private Integer latitude;
	        	private Integer netOper;
	        	private String country;
	        	private String province;
	        	private String city;
	        	private Timestamp date;
	        	private AppEntity[]   appList;
	        	private String   appJson;
	        	
	        	//AppEntity 实体类
				private String app_name;
				private String pkg_name;
				private int isload;
*/
	      
	            //POST请求
	            DataOutputStream out = new DataOutputStream(
	                    connection.getOutputStream());
	            JSONObject obj = new JSONObject();
	            JSONObject o=new JSONObject();
	            JSONObject o1=new JSONObject();
	            JSONArray array=new JSONArray();
	            //obj.element("uniqueNo", "asdf");
	            obj.element("serialNo", "12345");
	            obj.element("mac", "air");
	            obj.element("imei", "1");
	            //obj.element("appList", "appList");
	            obj.element("terType", "2");
	            obj.element("osStr", "3");
	            obj.element("model", "4");
	            obj.element("userAgt", "5");
	            obj.element("scrnW", 6);
	            obj.element("scrnH", 7);
	            obj.element("ip", "8");
	            obj.element("longitude", "9");
	            obj.element("latitude", "10");
	            obj.element("netOper", "11");
	            obj.element("country", "12");
	            obj.element("date", "2018-01-12");
	            obj.element("appJson", "13");
	            
	            o.element("app_name", "app_name");
	            o.element("pkg_name", "pkg_name");
	            o.element("isload", 14);
	            array.add(0, o);
	            o1.element("app_name", "app_name1");
	            o1.element("pkg_name", "pkg_name1");
	            o1.element("isload", 15);
	            array.add(1, o1);
	            obj.element("appList", array);

	            out.write(obj.toString().getBytes("UTF-8"));//这样可以处理中文乱码问题  
	            //out.writeBytes(obj.toString());
	            out.flush();
	            out.close();

	            //读取响应
	           BufferedReader reader = new BufferedReader(new InputStreamReader(
	                    connection.getInputStream()));
	            String lines;
	            StringBuffer sb = new StringBuffer("");
	            while ((lines = reader.readLine()) != null) {
	                lines = new String(lines.getBytes(), "utf-8");
	                sb.append(lines);
	                System.out.println("=====%%%%====="+sb);
	            }
	            
	            System.out.println("============"+sb);
	            reader.close();

	            // 断开连接
	            connection.disconnect();
	        } catch (MalformedURLException e) {
	            // TODO Auto-generated catch block
	            e.printStackTrace();
	        } catch (UnsupportedEncodingException e) {
	            // TODO Auto-generated catch block
	            e.printStackTrace();
	        } catch (IOException e) {
	            // TODO Auto-generated catch block
	            e.printStackTrace();
	        }

	    }

	    public static void main(String[] args) {
	        appadd();
	    }

}

