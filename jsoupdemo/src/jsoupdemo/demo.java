package jsoupdemo;

import java.io.IOException;
import java.sql.SQLException;

import javax.swing.text.Document;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class demo {
	public static void main(String[] args) throws IOException {
			
		org.jsoup.nodes.Document doc = Jsoup.connect("http://www.yystv.cn/b/recommend").get();
		System.out.println(doc.toString());
//		// TODO Auto-generated method stub
//		//获取题目,网址,简介,时间
//			org.jsoup.nodes.Document doc = Jsoup.connect("https://www.gcores.com/radios/104740").get();
//	        Elements titleLinks = doc.select("div.swiper-slide");
////	        Elements imgUrls= doc.select("div.audio_dot_img");
//	        //for循环遍历获取到每条新闻的四个数据并封装到News实体类中
//	        for(int j = 0;j < titleLinks.size();j++){
//	        	String title = titleLinks.get(j).select("h1").text();
//	        	int index = title.indexOf(' ');//获取空格的下标
//	        	String newStr = title.substring(0,index).toString();//分割字符串 得到结果
//	        	System.out.println(title);
//	            String time = titleLinks.get(j).select("a").attr("data-at");
//	            System.out.println(time);
//	            String info = titleLinks.get(j).select("p").text();
//	            System.out.println(info);
////	            String imgUrl =imgUrls.get(j).select("img").attr("src");
////	            System.out.println(imgUrl);
//
//		}
	}
}
