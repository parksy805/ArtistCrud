package com.sm.artist.component;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sm.artist.vo.ArtistVo;

@Controller
public class ArtistController {

	@Autowired
	private ArtistService artistService;

	@GetMapping("/artists") // GET으로 모든 아티스트들의 정보를 json 반환 
	@ResponseBody  // 자바 오브젝트를 자동으로 JSON으로 변환해서 리턴
	public List<ArtistVo> getAllArtistsJson() {
		return artistService.getAllArtists();
	}
	
	
}
