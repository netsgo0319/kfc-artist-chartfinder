package com.yejin.main.util;

public class StringFormatUtil {
	
	public static String getSearchSongUrl(int startIndex, String artistName){
		return String.format("http://www.melon.com/search/song/index.htm?startIndex=%s&pageSize=50&q=%s&sort=date&section=artist", startIndex, artistName);
	}
}
