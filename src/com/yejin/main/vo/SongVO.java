package com.yejin.main.vo;

import java.util.Date;

public class SongVO {
	private String engName;				// 아티스트 - 영어이름 
	private String korName;				// 아티스트 - 한국이름 
	private int songNum;				// 곡에 고유 번호 ( 오래된 순으로 1부터 시작. 누적되는 수 ) 
	private String songName;			// 곡 이름
	private int checkTitle;				// 타이틀곡입니까? ( 0 - false, 1 - true )
	private int likeCount;				// 각 곡에 대한 좋아요 수 
	private String songGenre;			// 곡 장르 
	private String writeWords;			// 작사 
	private String composition; 		// 작곡
	private String arrangement; 		// 편곡
	private int Year;					// 발매연도 
	private int rankForYear;			// 연도차트 - 순위에 없으면 0 
	private int month;					// 월
	private int rankForMonth;			// 월간차트 - 순위에 없으면 0 
	private int week; 					// 주 
	private int rankForWeek;			// 주간차트 - 순위에 없으면 0 
	private String artist;				// 아티스트 
	private String album;				// 앨범 이름 
	private String albumType;			// 앨범 타입
	private Date albumReleaseDate;		// 앨범 발매일 
	private String albumGenre;			// 앨범 장르 
	private String productionCompany;	// 기획사 
	private String releaseCompany;		// 발매사 	
	
	public SongVO(){}
	
	public String getEngName() {
		return engName;
	}
	public void setEngName(String engName) {
		this.engName = engName;
	}
	public String getKorName() {
		return korName;
	}
	public void setKorName(String korName) {
		this.korName = korName;
	}
	public int getSongNum() {
		return songNum;
	}
	public void setSongNum(int songNum) {
		this.songNum = songNum;
	}
	public String getSongName() {
		return songName;
	}
	public void setSongName(String songName) {
		this.songName = songName;
	}
	public int getCheckTitle() {
		return checkTitle;
	}
	public void setCheckTitle(int checkTitle) {
		this.checkTitle = checkTitle;
	}
	public int getLikeCount() {
		return likeCount;
	}
	public void setLikeCount(int likeCount) {
		this.likeCount = likeCount;
	}
	public String getSongGenre() {
		return songGenre;
	}
	public void setSongGenre(String songGenre) {
		this.songGenre = songGenre;
	}
	public String getWriteWords() {
		return writeWords;
	}
	public void setWriteWords(String writeWords) {
		this.writeWords = writeWords;
	}
	public String getComposition() {
		return composition;
	}
	public void setComposition(String composition) {
		this.composition = composition;
	}
	public String getArrangement() {
		return arrangement;
	}
	public void setArrangement(String arrangement) {
		this.arrangement = arrangement;
	}
	public int getYear() {
		return Year;
	}
	public void setYear(int year) {
		Year = year;
	}
	public int getRankForYear() {
		return rankForYear;
	}
	public void setRankForYear(int rankForYear) {
		this.rankForYear = rankForYear;
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public int getRankForMonth() {
		return rankForMonth;
	}
	public void setRankForMonth(int rankForMonth) {
		this.rankForMonth = rankForMonth;
	}
	public int getWeek() {
		return week;
	}
	public void setWeek(int week) {
		this.week = week;
	}
	public int getRankForWeek() {
		return rankForWeek;
	}
	public void setRankForWeek(int rankForWeek) {
		this.rankForWeek = rankForWeek;
	}
	public String getArtist() {
		return artist;
	}
	public void setArtist(String artist) {
		this.artist = artist;
	}
	public String getAlbum() {
		return album;
	}
	public void setAlbum(String album) {
		this.album = album;
	}
	public String getAlbumType() {
		return albumType;
	}
	public void setAlbumType(String albumType) {
		this.albumType = albumType;
	}
	public Date getAlbumReleaseDate() {
		return albumReleaseDate;
	}
	public void setAlbumReleaseDate(Date albumReleaseDate) {
		this.albumReleaseDate = albumReleaseDate;
	}
	public String getAlbumGenre() {
		return albumGenre;
	}
	public void setAlbumGenre(String albumGenre) {
		this.albumGenre = albumGenre;
	}
	public String getProductionCompany() {
		return productionCompany;
	}
	public void setProductionCompany(String productionCompany) {
		this.productionCompany = productionCompany;
	}
	public String getReleaseCompany() {
		return releaseCompany;
	}
	public void setReleaseCompany(String releaseCompany) {
		this.releaseCompany = releaseCompany;
	}
}