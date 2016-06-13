package com.magoo.currencyfair.web.controller;

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
public class IndexControllerIT {

	@Value("${local.server.port}")
	private int port;

	private RestTemplate template;

	@Before
	public void before() throws Exception {
		template = new TestRestTemplate();
	}

	@Test
	public void root_url_responds_with_200() throws Exception {
		URL url = new URL("http://localhost:" + port + "/");

		ResponseEntity<String> response = template.getForEntity(url.toString(), String.class);

		assertEquals("200", response.getStatusCode().toString());
	}

	@Test
	public void index_url_responsds_with_200() throws Exception {
		URL url = new URL("http://localhost:" + port + "/index");

		ResponseEntity<String> response = template.getForEntity(url.toString(), String.class);

		assertEquals("200", response.getStatusCode().toString());
	}
}
