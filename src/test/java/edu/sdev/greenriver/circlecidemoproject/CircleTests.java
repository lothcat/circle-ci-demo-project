package edu.sdev.greenriver.circlecidemoproject;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.test.web.server.LocalServerPort;
import org.springframework.http.*;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class CircleTests
{
    @LocalServerPort
    private int port;

    @Autowired
    private TestRestTemplate template;

    @Test
    public void contextLoadsTest()
    {
    }

    @Test
    public void homeTest()
    {
        //create a request
        String url = "http://localhost:" + port + "/api/v1/home";
        HttpEntity request = new HttpEntity(new HttpHeaders());
        ResponseEntity<String> response = template.exchange(url, HttpMethod.GET,
                request, String.class);

        //test whether it worked or not?!?!
        assertEquals(response.getStatusCode(), HttpStatus.OK);
        assertEquals(response.getBody(), "Hello, world!");
    }
}
