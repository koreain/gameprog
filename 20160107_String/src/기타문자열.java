/*
 * Jsoup ���̺귯��: HTML �Ḻ̌�.
 */
import java.util.*;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
public class ��Ÿ���ڿ� {

	public static void main(String[] args) 
    throws Exception
	{
		// TODO Auto-generated method stub
		Document doc=Jsoup.connect("http://movie.naver.com/movie/sdb/rank/rmovie.nhn").get();
		//System.out.println(doc);
/*		<div class="tit3">
		<a href="/movie/bi/mi/basic.nhn?code=147001" title="�����ڵ�: �� ��������">�����ڵ�: �� ��������</a>
	</div>
*/
	Elements data=doc.select("td.title div.tit3"); //css���� Ŭ���� �ҷ��ö� . ����, id�� #����.
	Elements data1=doc.select("td.range ac"); //css���� Ŭ���� �ҷ��ö� . ����, id�� #����.
	
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
