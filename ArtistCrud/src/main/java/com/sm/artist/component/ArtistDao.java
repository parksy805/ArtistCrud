package com.sm.artist.component;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.sm.artist.vo.ArtistVo;

@Repository
public class ArtistDao {
	
	public static List<ArtistVo> artists; // artist들의 정보가 담긴 통.

	static {
		artists = new ArrayList<>(); // Collection 인터페이스 List의 자식클래스 ArrayList타입 생성
		artists.add(new ArtistVo(1, "SimChangmin", "tvxq"));
		artists.add(new ArtistVo(2, "KimKibum", "shinee"));
		artists.add(new ArtistVo(3, "BaeJuhyun", "redvelvet"));
		artists.add(new ArtistVo(4, "KimMinsuk", "exo"));
	}

	public List<ArtistVo> getAllArtists() {
		// TODO Auto-generated method stub
		return artists;
	}

	public ArtistVo getArtistByGroup(String artistGroup) {
		// TODO Auto-generated method stub
		return artists		//List타입의 artists 변수에서
				.stream()
				.filter(a -> a.getArtistGroup().equals(artistGroup)) 
				// Request로 받은 artistGroup와 동일한 ArtistGroup를 getter함
				.findAny()
				.orElse(new ArtistVo(-1, "", "")); 
				//없다면 새로운 ArtistVo객체 생성해서 리턴
	}
	
}
