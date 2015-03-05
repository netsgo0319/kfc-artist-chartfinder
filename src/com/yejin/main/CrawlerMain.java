package com.yejin.main;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import javax.swing.UIManager;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import com.yejin.main.util.ConstantsUtil;
import com.yejin.main.util.StringFormatUtil;
import com.yejin.main.util.SwingUtil;
import com.yejin.main.vo.SongVO;


public class CrawlerMain {
	public static void main(String[] args) {
		// 가수 이름으로 곡 리스트 검색
		try{
			Map<String,String> artistNames = getArtistName();
			String nameKr = artistNames.get(ConstantsUtil.ARTIST_NAME_KR_KEY);
			List<SongVO> songs = getSongsByArtist(nameKr);
		}catch(Exception e){
			return;
		}
		
		
		// 곡들 소팅
		// 곡들마다 앨범 정보, 곡 상세 정보 추가
		// 엑셀쓰기 
		
		
	}

	// 인풋 받는 메소드 
	private static Map<String,String> getArtistName() throws Exception{
		Map<String,String> artistNames = new HashMap<String,String>();
		
		UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
		new SwingUtil();
		
		// 스윙 통해서 인풋 받는다.
		String artistKr = "박정현";
		String artistEn = "Lena, Park";
		
		artistNames.put(ConstantsUtil.ARTIST_NAME_KR_KEY, artistKr);
		artistNames.put(ConstantsUtil.ARTIST_NAME_EN_KEY, artistEn);
		
		return artistNames;
	}
	
	// 가수에 따른 곡 리스트 받는 메소드
	private static List<SongVO> getSongsByArtist(String keyword) throws IOException{
		
		
		List<SongVO> songs = new ArrayList<SongVO>();
		int startIndex = 1;
		while(true){
			System.out.println("[ "+startIndex+" ]");
			Document doc = Jsoup.connect(StringFormatUtil.getSearchSongUrl(startIndex, ConstantsUtil.PAGE_SIZE, keyword)).get();
			Elements rows = doc.select("tr");
			
			if(rows.size() == 0){
				break;
			}
			
			for(Element row : rows){
				String songName = row.select(".ellipsis .btn_icon_detail .odd_span").text().replace(" 상세정보 페이지 이동", "");
				String artistName = row.select(".wrapArtistName b").text();
				
				if(!artistName.equals(keyword)){
					break;
				}
				
				int isTitle = Optional.ofNullable(row.select(".title").text()).orElse("").equals("") ? 0 : 1;
				String albumName = row.select(".ellipsis .fc_mgray").text();
				
				SongVO song = new SongVO();
				song.setSongName(songName);
				song.setArtist(artistName);
				song.setCheckTitle(isTitle);
				song.setAlbum(albumName);
				
				//int albumId = row.select(".ellipsis .fc_mgray").attr("href");
				
				//song = getAlbumDetail(albumId, song);
						
				
			}
			
			System.out.println(doc.select(".ellipsis .btn_icon_detail .odd_span").text().replace(" 상세정보 페이지 이동", ""));
			
			System.out.println("---------------------");
			startIndex += ConstantsUtil.PAGE_SIZE;
		}
		return songs;
	}
	
	// 순위 찾는 메소드
	private static int getRankFromChartFinder(SongVO song){
		int rank = 0;
		return rank;
	}
	
	// 곡에 맞는 앨범 정보 받는 메소드 
	private static SongVO getAlbumDetail(int albumId, SongVO song){
		return song;
	}
	
	private static SongVO getSongDetail(SongVO song){
		return song;
	}
}
