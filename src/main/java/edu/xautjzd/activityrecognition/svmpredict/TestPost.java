package edu.xautjzd.activityrecognition.svmpredict;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;

import com.google.gson.Gson;

public class TestPost {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = TestPost.sendPost("http://localhost:8080/svmpredict/hello");
		System.out.println(s1);
	}

	/**
	 * ��ָ��URL����POST����������
	 * 
	 * @param url
	 *            ���������URL
	 * @param param
	 *            ����������������Ӧ����name1=value1&name2=value2����ʽ��
	 * @return URL������Զ����Դ����Ӧ
	 */
	public static String sendPost(String url) {
//		HttpClient httpClient = HttpClientBuilder.create().build();     // Android����ʹ�ã�ֻ��ʹ��DefaultHttpClient()
		HttpClient httpClient = new DefaultHttpClient();
		String result = "";
		
		try {
			
			User user = new User("xautjzd", "����ʡ������");
		//	Angry a = new Angry(7,"red","not angry");
			Gson gson = new Gson();
			
			HttpPost request = new HttpPost(url);
			// ��ֹ��������
			StringEntity postString = new StringEntity(gson.toJson(user), "UTF-8");
			request.setEntity(postString);
			request.setHeader("Content-Type", "application/json;charset=UTF-8");
			
			HttpResponse  response = httpClient.execute(request);
			result = EntityUtils.toString(response.getEntity());
		} catch (Exception e) {
			System.out.println("����ʧ��");
		}
		return result;
	}
}
