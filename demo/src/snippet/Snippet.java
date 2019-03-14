package snippet;

public class Snippet {
	public static void main(String[] args) {
		    String host = "http://cowsms.market.alicloudapi.com";
		    String path = "/intf/smsapi";
		    String method = "GET";
		    String appcode = "���Լ���AppCode";
		    Map<String, String> headers = new HashMap<String, String>();
		    //�����header�еĸ�ʽ(�м���Ӣ�Ŀո�)ΪAuthorization:APPCODE 83359fd73fe94948385f570e3c139105
		    headers.put("Authorization", "APPCODE " + appcode);
		    Map<String, String> querys = new HashMap<String, String>();
		    querys.put("mobile", "13xxxxxxxxx");
		    querys.put("paras", "1234,2");
		    querys.put("sign", "��Ϣͨ");
		    querys.put("tpid", "009");
	
	
		    try {
		    	/**
		    	* ��Ҫ��ʾ����:
		    	* HttpUtils���
		    	* https://github.com/aliyun/api-gateway-demo-sign-java/blob/master/src/main/java/com/aliyun/api/gateway/demo/util/HttpUtils.java
		    	* ����
		    	*
		    	* ��Ӧ�����������
		    	* https://github.com/aliyun/api-gateway-demo-sign-java/blob/master/pom.xml
		    	*/
		    	HttpResponse response = HttpUtils.doGet(host, path, method, headers, querys);
		    	System.out.println(response.toString());
		    	//��ȡresponse��body
		    	//System.out.println(EntityUtils.toString(response.getEntity()));
		    } catch (Exception e) {
		    	e.printStackTrace();
		    }
		}
}

