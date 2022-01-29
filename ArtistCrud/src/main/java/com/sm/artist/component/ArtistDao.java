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

}
