
package com.skp.IdGeneration.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.skp.IdGeneration.model.GeneratedID;
import com.skp.IdGeneration.model.IdGeneration;
import com.skp.IdGeneration.reository.IdGenerationRepository;

@Service
public class IdGenerationService {

	@Autowired
	IdGenerationRepository idGenerationRepository;

	public List<GeneratedID> getIds() {

		return idGenerationRepository.findAll();

	}

	public void save(GeneratedID ids) {
		idGenerationRepository.save(ids);
	}

	public List<GeneratedID> getIds(String requestId) {
		//idGenerationRepository.findById(requestId);
		return null;
	}

}
