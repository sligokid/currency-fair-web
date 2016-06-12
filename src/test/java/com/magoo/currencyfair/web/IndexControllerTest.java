package com.magoo.currencyfair.web;

import static org.junit.Assert.assertEquals;

import java.net.URL;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.IntegrationTest;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.boot.test.TestRestTemplate;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.web.client.RestTemplate;

import com.magoo.currencyfair.web.CurrencyFairWebApplication;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = CurrencyFairWebApplication.class)
@WebAppConfiguration
@IntegrationTest({ "server.port=0" })
public class IndexControllerTest {

	@Value("${local.server.port}")
	private int port;

	private RestTemplate template;

	@Before
	public void before() throws Exception {
		template = new TestRestTemplate();
	}

	@Test
	public void greeting() {
	}

	// @Test
	public void index_page_renders_greeting() throws Exception {
		URL url = new URL("http://localhost:" + port + "/");
		ResponseEntity<String> response = template.getForEntity(url.toString(), String.class);
		assertEquals(response.getBody(), "Greetings from Spring Boot!");
	}
}
