package com.tests;

import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.payloads.BookPayload;

public class BookCRUDTest extends com.base.BaseTest {

	 static int createdBookId;

	    @Test(priority = 1)
	    public void testCreateBook() {
	        Response res = request.body(BookPayload.createBook("API Book", "Priya Book", 150)).post("/Books");

	        Assert.assertEquals(res.getStatusCode(), 200); 
	        createdBookId = res.jsonPath().getInt("id");
	    }

	    @Test(priority = 2)
	    public void testGetBookById() {
	        Response res = request.get("/Books/" + createdBookId);
	        Assert.assertEquals(res.getStatusCode(), 200);
	        Assert.assertEquals(res.jsonPath().getString("title"), "API Book");
	    }

	    @Test(priority = 3)
	    public void testUpdateBook() {
	        Response res = request.body(BookPayload.createBook("Updated Book", "Updated Desc", 200))
	                .put("/Books/" + createdBookId);

	        Assert.assertEquals(res.getStatusCode(), 200);
	        Assert.assertEquals(res.jsonPath().getString("title"), "Updated Book");
	    }

	    @Test(priority = 4)
	    public void testDeleteBook() {
	        Response res = request.delete("/Books/" + createdBookId);
	        Assert.assertEquals(res.getStatusCode(), 200);
	    }

	    @Test(priority = 5)
	    public void testGetNonExistingBook() {
	        Response res = request.get("/Books/99999");
	        Assert.assertEquals(res.getStatusCode(), 404);
	    }

}
