package iib.gov.in.service;

import java.util.List;

import javax.transaction.Transactional;

import iib.gov.in.dao.VoilationDao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("voilationservice")
public class VoilationService {
	@Autowired
	VoilationDao voilationdao;
	@Transactional
	public List getData(String REGISTRATION_NUMBER)
	{
		return voilationdao.getData(REGISTRATION_NUMBER);
	}
	

}
