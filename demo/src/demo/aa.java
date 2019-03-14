package demo;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.jsoup.Connection;
import org.jsoup.Connection.Method;
import org.jsoup.Connection.Response;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

public class aa {
	public static Document login(String pagePath,String name,String password){
		try {
			//pagePath=http://eol.jxau.edu.cn/meol/homepage/common/index.jsp
			Response rs=Jsoup.connect(pagePath).method(Method.GET).execute();
			Document rd=rs.parse();
			//��ȡform����action=/meol/loginCheck.do
			String actionPath=rd.select("form").attr("action");
			//��ȡaction�е�һ������meol
			String firstWordInAction=new String("https://www.gcores.com/account/signin");
			int index=pagePath.indexOf(firstWordInAction);
			// connectPath=http://eol.jxau.edu.cn/meol/loginCheck.do
			String connectPath=pagePath.substring(0, index-1)+actionPath;
			//�����û���������
			Map<String,String> datas=new HashMap<String, String>();
			datas.put("IPT_LOGINUSERNAME", name);
			datas.put("IPT_LOGINPASSWORD", password);
			//ִ��post   ִ�гɹ�����Document����
			Document document=Jsoup.connect(connectPath).data(datas).post();
			System.out.println(document);
			return document;
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}
	public static void main(String[] args) throws IOException {
		login("https://www.gcores.com/account/signin", "xiaojingfei818@gmail.com", "jingfei971206");
	}

}
