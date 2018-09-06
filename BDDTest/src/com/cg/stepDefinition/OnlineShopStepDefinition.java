package com.cg.stepDefinition;

import java.util.List;

import org.junit.Assert;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;

import com.cg.product.bean.Product;

import cucumber.api.java.Before;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class OnlineShopStepDefinition {

	private TestRestTemplate restTemplate;
	private ResponseEntity<String> responseEntity;
	private ResponseEntity<Product> responseEntityProduct;
	private ResponseEntity<List> responseEntityList;
	
	
	@Before
	public void setUpTestEnv()
	{
		restTemplate = new TestRestTemplate();
	}
	
	@When("^User give call to '/sayHello' Service$")
	public void user_give_call_to_sayHello_Service() throws Throwable {
	    responseEntity = restTemplate.getForEntity("http://localhost:8800/sayHello", String.class);
	}

	@Then("^User should receive service status 'Ok' And response message 'Hello World From RestFulWebService'$")
	public void user_should_receive_service_status_Ok_And_response_message_Hello_World_From_RestFulWebService() throws Throwable {
	    Assert.assertEquals(HttpStatus.OK, responseEntity.getStatusCode());
	    Assert.assertEquals("Hello World from RestFullWebService",responseEntity.getBody());
	}
	
	@When("^User submits valid product information$")
	public void user_submits_valid_product_information() throws Throwable {
	   
		//Product product=new Product("101", "redmi", "note 5",15000, "24/02/2016");
		
		Product product= getProduct();
		
		MultiValueMap<String, Object> map= new LinkedMultiValueMap<>();
		map.add("id",product.getId());
		map.add("name", product.getName());
		map.add("model", product.getModel());
		map.add("price", Double.toString(product.getPrice()));
		map.add("date", product.getDate());
		
		HttpHeaders headers= new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_FORM_URLENCODED);
		
		HttpEntity<MultiValueMap<String, Object>> httpEntity=new HttpEntity<>(map,headers);
		responseEntityProduct= restTemplate.postForEntity("http://localhost:8800/acceptProduct",httpEntity, Product.class);
		
	}

	@Then("^Products details should be added succesfully$")
	public void products_details_should_be_added_succesfully() throws Throwable {
	    Product expected=getProduct();
	    Product actual=responseEntityProduct.getBody();
	    Assert.assertEquals(expected, actual);
	}
	
	private Product getProduct()
	{
		return new Product("801", "redmi", "note 5",15000, "24/02/2016");
	}
	
	@When("^User wants to know the details of all the products$")
	public void user_wants_to_know_the_details_of_all_the_products() throws Throwable {
	   
		responseEntityList=restTemplate.getForEntity("http://localhost:8800/allProducts",List.class);
	}

	@Then("^All the product details should be displayed$")
	public void all_the_product_details_should_be_displayed() throws Throwable {
	    Assert.assertEquals(HttpStatus.OK, responseEntityList.getStatusCode());
	}
	
	@When("^User wants to know the details of a product$")
	public void user_wants_to_know_the_details_of_a_product() throws Throwable {
		
		responseEntityProduct=restTemplate.getForEntity("http://localhost:8800/product?id=i01",Product.class);
		
	}

	@Then("^Product details should be displayed$")
	public void product_details_should_be_displayed() throws Throwable {
		
		Assert.assertEquals(HttpStatus.OK,responseEntityProduct.getStatusCode());
	}

}
