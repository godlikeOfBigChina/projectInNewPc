package com.godlike.netapi;

import java.io.IOException;

import org.json.JSONObject;

public class App 
{
    public static void main( String[] args )
    {
//    	String token=AuthService.getAuth("APP key", "Secret key");
//    	System.out.println(token);
    	Thing thing=new Thing();
//    	thing.setToken(token);
//    	thing.setFilePath("C:\\Users\\godli\\Pictures\\Camera Roll\\animal.jpg");
    	thing.setFilePath("C:\\Users\\godli\\Pictures\\Camera Roll\\car.png");
//    	thing.setFilePath("C:\\Users\\godli\\Pictures\\Camera Roll\\plant.jpg");
//    	thing.setFilePath("C:\\Users\\godli\\Pictures\\Camera Roll\\dish.jpg");
    	thing.setUrl(Thing.carDiyUrl);
        try {
			JSONObject result=new JSONObject(HttpUtil.post(thing.getUrl(),thing.getToken(), thing.getParams()));
			if(Thing.carDiyUrl.equals(thing.getUrl())) {
				System.out.print(result.getJSONArray("results").get(0));
			}else {
				System.out.print(result.getJSONArray("result").get(0));
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
}
