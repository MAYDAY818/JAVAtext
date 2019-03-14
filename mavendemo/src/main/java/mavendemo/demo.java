package mavendemo;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;

import javax.swing.text.Document;
import javax.swing.text.Element;

import org.jsoup.Jsoup;
import org.jsoup.select.Elements;

public class demo {
	
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Document doc = (Document) Jsoup.connect("www.gcores.com").get(); 
		String title = ((org.jsoup.nodes.Document) doc).title();
		System.out.println(title);
	}

	
}
