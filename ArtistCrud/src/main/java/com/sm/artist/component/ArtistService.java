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

	public ArtistVo getArtistByGroup(String artistGroup) {
		// TODO Auto-generated method stub
		return artistDao.getArtistByGroup(artistGroup);
	}

	public void registerArtist(ArtistVo artistvo) {
		// TODO Auto-generated method stub
		artistDao.registerArtist(artistvo);
	}

	public void modifyArtist(String artistName, ArtistVo artistVo) {
		// TODO Auto-generated method stub
		artistDao.modifyArtist(artistName,artistVo);
	}

	public void removeArtist(String artistName) {
		// TODO Auto-generated method stub
		artistDao.removeArtist(artistName);
	}

}
