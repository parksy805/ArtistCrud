package com.sm.artist.vo;


public class ArtistVo {
	
	private int artistNo; // 아티스트 번호 
	private String artistName; // 아티스트 본명(영어로) 
	private String artistGroup; // 아티스트 소속그룹(영어로)
	public ArtistVo() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ArtistVo(int artistNo, String artistName, String artistGroup) {
		super();
		this.artistNo = artistNo;
		this.artistName = artistName;
		this.artistGroup = artistGroup;
	}
	public int getArtistNo() {
		return artistNo;
	}
	public void setArtistNo(int artistNo) {
		this.artistNo = artistNo;
	}
	public String getArtistName() {
		return artistName;
	}
	public void setArtistName(String artistName) {
		this.artistName = artistName;
	}
	public String getArtistGroup() {
		return artistGroup;
	}
	public void setArtistGroup(String artistGroup) {
		this.artistGroup = artistGroup;
	}
	@Override
	public String toString() {
		return "ArtistVo [artistNo=" + artistNo + ", artistName=" + artistName + ", artistGroup=" + artistGroup + "]";
	}
	

	
}
