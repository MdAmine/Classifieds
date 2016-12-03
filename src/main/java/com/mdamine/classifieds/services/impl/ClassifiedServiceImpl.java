package com.mdamine.classifieds.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mdamine.classifieds.model.Classified;
import com.mdamine.classifieds.repository.ClassifiedRepository;
import com.mdamine.classifieds.services.ClassifiedService;

@Service
@Transactional
public class ClassifiedServiceImpl implements ClassifiedService {

	@Autowired
	private ClassifiedRepository classifiedRepository;

	public List<Classified> getAllClassifieds() {

		classifiedRepository.save(new Classified("first", "classfields"));

		return classifiedRepository.findAll();
	}

}
