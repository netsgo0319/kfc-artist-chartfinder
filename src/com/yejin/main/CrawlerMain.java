package com.yejin.main;

import java.io.IOException;
import java.util.HashMap;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class CrawlerMain {

	public static void main(String[] args) {
		// 가수 검색으로 아이디 받아오기
		crawlBySinger("108316");
		// 챠트 파인더
	}

	private static void crawlBySinger(final String artistId) {
		int pageSize = 50;
		int startIndex = 1;
		String orderByType = "ISSUE_DATE";

		String no = null;
		String songName = null;
		String albumName = null;
		String singer = null;

		StringBuffer result = new StringBuffer();
		HashMap<String, String> dataMap = new HashMap<String, String>();
		dataMap.put("artistId", artistId);
		dataMap.put("pageSize", String.valueOf(pageSize));
		dataMap.put("orderBy", orderByType);
		dataMap.put("listType", "0");
		try {
			while (true) {
				dataMap.put("startIndex", String.valueOf(startIndex));
				Document doc = Jsoup
						.connect("http://www.melon.com/artist/song.htm")
						.data(dataMap).get();
				Elements rows = doc.select(".d_song_list tr");
				if (rows.size() > 1) {
					for (int i = 0; i < rows.size(); i++) {
						Element row = rows.get(i);

						no = row.select(".no .wrap").text();
						songName = row.select(".ellipsis a > span").text();
						singer = row.select("#artistName > span").text();
						albumName = row.select(".ellipsis > .fc_mgray").text();

						result.append("  곡 번호: ").append(no)
								.append(" /  곡 이름 : ").append(songName)
								.append(" /  가수 : ").append(singer)
								.append(" /  앨범명 : ").append(albumName)
								.append(System.lineSeparator());

						startIndex += pageSize;
					}

					System.out.print(result.toString());
				} else {
					break;
				}
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
