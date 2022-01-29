package com.sm.artist.component;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sm.artist.vo.ArtistVo;

@Service
public class ArtistService {
	
	@Autowired
	ArtistDao artistDao;

	public List<ArtistVo> getAllArtists() {
		// TODO Auto-generated method stub
		return artistDao.getAllArtists();
	}

}
