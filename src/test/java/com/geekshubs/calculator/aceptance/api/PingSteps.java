package com.geekshubs.calculator.aceptance.api;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class PingSteps {

    HttpResponse response;
    String host = "localhost";
    int port = 8080;

    @When("^I make a GET call on ([^\"]*)$")
    public void iMakeAGETCallOn(String path) throws Exception {
        CloseableHttpClient httpclient = HttpClients.createDefault();
        HttpGet httpGet = new HttpGet(String.format("http://%s:%d%s", host, port, path));
        response = httpclient.execute(httpGet);
    }

    @Then("^I should receive (\\d+) response status code$")
    public void iShouldReceiveStatusCodeResponse(int code) {
        assertEquals(code, response.getStatusLine().getStatusCode());
    }

    @Then("^should receive a welcome message$")
    public void shouldReceiveAWelcomeMessage() throws Exception {
        assertThat(EntityUtils.toString(response.getEntity()), containsString("Welcome to Java Maven Calculator Web App!!!"));
    }

    @Then("^should receive result (\\d+)$")
    public void shouldReceiveResultCorrect(int result) throws Exception {
        assertThat(EntityUtils.toString(response.getEntity()), containsString(String.format("\"result\":%d", result)));
    }

}