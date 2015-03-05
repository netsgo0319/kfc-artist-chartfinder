package com.yejin.main;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.yejin.main.util.ConstantsUtil;
import com.yejin.main.util.StringFormatUtil;
import com.yejin.main.vo.SongVO;


public class CrawlerMain {
	public static void main(String[] args) {
		// 가수 이름으로 곡 리스트 검색
		Map<String,String> artistNames = getArtistName();
		String nameKr = artistNames.get(ConstantsUtil.ARTIST_NAME_KR_KEY);
		
		List<SongVO> songs = getSongsByArtist(nameKr);
		// 곡들 소팅
		// 곡들마다 앨범 정보, 곡 상세 정보 추가
		// 엑셀쓰기 
		
		System.out.println(StringFormatUtil.getSearchSongUrl(1, nameKr));
		
	}

	// 인풋 받는 메소드 
	private static Map<String,String> getArtistName(){
		Map<String,String> artistNames = new HashMap<String,String>();
		
		// 스윙통해서 인풋 받는다.
		String artistKr = "박정현";
		String artistEn = "Lena, Park";
		
		artistNames.put(ConstantsUtil.ARTIST_NAME_KR_KEY, artistKr);
		artistNames.put(ConstantsUtil.ARTIST_NAME_EN_KEY, artistEn);
		
		return artistNames;
	}
	
	// 가수에 따른 곡 리스트 받는 메소드
	private static List<SongVO> getSongsByArtist(String keyword){
		List<SongVO> songs = new ArrayList<SongVO>();
	
		
		return songs;
	}
	
	// 순위 찾는 메소드
	private static int getRankFromChartFinder(SongVO song){
		int rank = 0;
		return rank;
	}
	
	// 곡에 맞는 앨범 정보 받는 메소드 
	private static SongVO getAlbumDetail(SongVO song){
		return song;
	}
}
