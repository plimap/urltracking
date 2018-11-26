package application.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import application.model.Link;
import application.persistence.entity.LinkEntity;
import application.persistence.repository.LinkRepository;
import application.service.LinkService;

@RestController
@RequestMapping(path = "/api/links", produces = "application/json")
public class LinkController {

	@Autowired
	private LinkRepository linkRepository;

	@Autowired
	private LinkService linkService;

	@RequestMapping(method = RequestMethod.GET)
	public List<LinkEntity> getLinks() {
		return linkRepository.findAll();
	}

	@RequestMapping(method = RequestMethod.POST)
	private LinkEntity createLink(@RequestBody Link model) throws Exception {
		return linkService.create(model);
	}

}
