package json;

import java.util.ArrayList;
import java.util.List;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

public class demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				//��ȡ��Ŀ,��ַ,���,ʱ��
					org.jsoup.nodes.Document doc = Jsoup.connect("https://www.gcores.com/radios/104740").get();
			        Elements titleLinks = doc.select("div.swiper-slide");
//			        Elements imgUrls= doc.select("div.audio_dot_img");
			        //forѭ��������ȡ��ÿ�����ŵ��ĸ����ݲ���װ��Newsʵ������
			        for(int j = 0;j < titleLinks.size();j++){
			        	String title = titleLinks.get(j).select("h1").text();
			        	int index = title.indexOf(' ');//��ȡ�ո���±�
			        	String newStr = title.substring(0,index);//�ָ��ַ��� �õ����
			        	System.out.println(title);
			            String time = titleLinks.get(j).select("a").attr("data-at");
			            System.out.println(time);
			            String info = titleLinks.get(j).select("p").text();
			            System.out.println(info);
//			            String imgUrl =imgUrls.get(j).select("img").attr("src");
//			            System.out.println(imgUrl);

				}
		
	}

}
