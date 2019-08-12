package com.godlike.netapi;

public class TestPost {

	public static void main(String[] args) {
		try {
//			System.out.println(HttpUtil.postGeneralUrl("http://localhost:8080/ciws/ajaxLogin?userid=9999&password=111111", "application/json","","UTF-8"));
			System.out.println(HttpUtil.postGeneralUrl(
					"http://localhost:8080/ciws/row_cb_move?"
					+ "subwarehouseid=1&startrowid=1&targetrowid=2",
					"application/json","","UTF-8"));
//			System.out.println(HttpUtil.postGeneralUrl("http://localhost:60000", "XML","","UTF-8"));
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
