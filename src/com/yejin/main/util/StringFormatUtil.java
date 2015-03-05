package com.yejin.main.util;

public class StringFormatUtil {
	
	public static String getSearchSongUrl(int startIndex, int pageSize, String artistName){
		return String.format(ConstantsUtil.SEARCH_SONGS_BY_ARTIST, startIndex, pageSize, artistName);
	}
}
