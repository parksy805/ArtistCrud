package com.sm.artist.component;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sm.artist.vo.ArtistVo;

@Controller
public class ArtistController {

	@Autowired
	private ArtistService artistService;
	
	@GetMapping("/{artistGroup}")
	public String getArtistByGroup(@PathVariable String artistGroup, Model model) {
		model.addAttribute("artistGroup", artistService.getArtistByGroup(artistGroup));
        // Request로 받은 artistGroup를 매개변수로 보내서 ArtistVo객체를 찾아서 호출
        System.out.println("getArtistByGroup함수 호출 성공");
		return "index2";
	}

	@GetMapping("/artists") // GET으로 모든 아티스트들의 정보를 json 반환
	@ResponseBody // 자바 오브젝트를 자동으로 JSON으로 변환해서 리턴
	public List<ArtistVo> getAllArtistsJson() {
		return artistService.getAllArtists();
	}

	@GetMapping("/artists.void") // 아티스트 정보를 console에 출력
	public void getAllArtists() {
		List<ArtistVo> artists = artistService.getAllArtists();

		System.out.println("List 출력 === \n" + artists.toString());
		System.out.println();

		ArrayList<String> artistName = new ArrayList<String>();
		// artistName변수는 foreach반복문 블록 바깥에서 먼저 선언해줘야 블록안에서 add된 값을 가져올수 있음
		for (ArtistVo artist : artists) {
			System.out.println("한줄 씩 ArtistVo 객체 출력 === " + artist.toString());
			artistName.add(artist.getArtistName());
		}
		System.out.println();

		System.out.println("artistName.toString() === " + artistName.toString());
		System.out.println("artistName.get(0) === " + artistName.get(0));

	}
	
	@GetMapping("/artists.do") // GET으로 아티스트들의 정보를 Jsp로 전송
	public String getAllArtistsJsp(Model model) {
		List<ArtistVo> artists = artistService.getAllArtists();
		System.out.println(artists.get(0).getArtistName());
		// List타입.get(인덱스).getter함수()
		
		ArrayList<String> artistsName = new ArrayList<String>();
		// ArrayList타입의 변수는 foreach반복문 블록 바깥에서 먼저 선언해줘야
		// foreach반복문 블록안에서 add된 값을 가져올수 있음
		for (ArtistVo artist : artists) {
			artistsName.add(artist.getArtistName());
		}
		
		ArtistVo siwumin = new ArtistVo();
		siwumin.setArtistGroup(artists.get(3).getArtistGroup());
		
		model.addAttribute("artists", artists);
		model.addAttribute("artistsName", artistsName);
		model.addAttribute("siwumin", siwumin);
		
		return "index";
	}

}
