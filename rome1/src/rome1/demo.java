package rome1;

import java.net.URL;

import com.rometools.rome.feed.synd.SyndFeed;
import com.rometools.rome.io.SyndFeedInput;
import com.rometools.rome.io.XmlReader;

public class demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String url = "https://www.gcores.com/rss";
		SyndFeed feed = new SyndFeedInput().build(new XmlReader(new URL(url)));
		System.out.println(feed.getTitle());
	}

}
