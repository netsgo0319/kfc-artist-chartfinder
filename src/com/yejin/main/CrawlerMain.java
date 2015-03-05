package com.yejin.main;


public class CrawlerMain {
	// 1ef3bccb-79b1-33ca-b42a-52e7c1e1eb65
	public static void main(String[] args) {
		// 가수 검색으로 아이디 받아오기
		// 챠트 파인더
		
		int pageNum = 1;
		String keyword = "나얼";
		String appKey="d0199ef9-5405-3b6a-9f84-ae6b8007c368";
		String uri = "http://apis.skplanetx.com/melon/songs?appKey="+appKey+"&format=json&count=50&page="+
						pageNum+"&searchKeyword="+keyword+"&version=1";
		
		System.out.println(uri);
	}

}
