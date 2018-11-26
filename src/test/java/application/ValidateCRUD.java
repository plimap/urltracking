package application;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.test.context.junit4.SpringRunner;

import application.model.Link;
import application.persistence.entity.LinkEntity;
import application.persistence.repository.LinkRepository;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
public class ValidateCRUD {

	@Autowired
	LinkRepository repository;
	Link link = new Link();
	String linkText = "www.ibm.com";

	@Before
	public void init() {
		LinkEntity entity = new LinkEntity();
		entity.setLink(linkText);
		repository.saveAndFlush(entity);
	}

	@Test
	public void step01_save() throws Exception {
		String actual = link.getLink();
		assertEquals(linkText, actual);
	}

	@After
	public void step02_save() throws Exception {
		repository.delete(link.getId());
	}

}
