/*
 * Jsoup 라이브러리: HTML 파싱기.
 */
import java.util.*;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
public class 기타문자열 {

	public static void main(String[] args) 
    throws Exception
	{
		// TODO Auto-generated method stub
		Document doc=Jsoup.connect("http://movie.naver.com/movie/sdb/rank/rmovie.nhn").get();
		//System.out.println(doc);
/*		<div class="tit3">
		<a href="/movie/bi/mi/basic.nhn?code=147001" title="내부자들: 디 오리지널">내부자들: 디 오리지널</a>
	</div>
*/
	Elements data=doc.select("td.title div.tit3"); //css에서 클래스 불러올땐 . 으로, id는 #으로.
	Elements data1=doc.select("td.range ac"); //css에서 클래스 불러올땐 . 으로, id는 #으로.
	
	for(int i=0; i<data.size();i++)
	{
		System.out.println(data.get(i).text());
		//System.out.println(data1.get(i).text());
	}
	
	for(int i=0; i<data1.size();i++)
	{
	System.out.println(data1.get(i).text());
	}
	}

}
