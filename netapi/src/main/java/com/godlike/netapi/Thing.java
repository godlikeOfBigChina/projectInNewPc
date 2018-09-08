package com.godlike.netapi;

import java.io.IOException;
import java.net.URLEncoder;

public class Thing {
	public static final String carDiyUrl="https://aip.baidubce.com/rpc/2.0/ai_custom/v1/classification/CarRCG";
	public static final String carUrl="https://aip.baidubce.com/rest/2.0/image-classify/v1/car";
	public static final String animalUrl="https://aip.baidubce.com/rest/2.0/image-classify/v1/animal";
	public static final String plantUrl="https://aip.baidubce.com/rest/2.0/image-classify/v1/plant";
	public static final String dishUrl="https://aip.baidubce.com/rest/2.0/image-classify/v2/dish";
	public static final String genalUrl="https://aip.baidubce.com/rest/2.0/image-classify/v2/advanced_general";
	private String token="24.b4ae2f5eb1ef6b7161e25a7ec2b536ff.2592000.1539006836.282335-11789522";
	private String url="";
	private String filePath="";
	private String params="";
	private boolean ifDiy=false;
	
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		if(Thing.carDiyUrl.equals(url)) ifDiy=true;
		this.url = url;
	}
	public void setFilePath(String filePath) {
		this.filePath = filePath;
	}
	public void setToken(String token) {
		this.token = token;
	}
	public String getToken() {
		return token;
	}
	public String getParams() throws IOException {
		byte[] imgData = FileUtil.readFileByBytes(filePath);
        String imgStr = Base64Util.encode(imgData);
        String params;
        if(ifDiy) {
        	params = "{\"image\":\"" + imgStr + "\",\"top_num\":5}";
        }else {
        	String imgParam = URLEncoder.encode(imgStr, "UTF-8");
            params = "image=" + imgParam + "&top_num=" + 5;
        }
        this.params=params;
		return params;
	}
	
	
}
