package application.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import application.model.Link;
import application.persistence.entity.LinkEntity;
import application.persistence.repository.LinkRepository;

@Service
public class LinkService {

	Logger logger = LoggerFactory.getLogger(LinkService.class);

	@Autowired
	private LinkRepository linkRepository;

	public LinkEntity create(Link model) throws Exception {

		LinkEntity entity = new LinkEntity();
		entity.setLink(model.getLink());

		return linkRepository.saveAndFlush(entity);

	}

}
