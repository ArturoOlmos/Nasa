package stepdefinitions;		

import cucumber.api.java.en.Given;		
import cucumber.api.java.en.Then;		
import cucumber.api.java.en.When;
import cucumberframework.mainPage;

public class steps {				
    
    @Given("I want to get photos made by {string} on {int} martian sol")
    public void i_want_to_get_first_photos_made_by_on_martian_sol(String robot_name, Integer martian_sol) {
    	mainPage.generateRequestByMartian(robot_name,martian_sol);
    }
    
    @Given("Mars photos endpoint is available")
    public void mars_photos_endpoint_is_available() {
        mainPage.is_martian_responding();
    }

    @When("I retrieve top {int} martian photos")
    public void i_retrieve_top_photos(int top_n_photos) {
        mainPage.retrieve_top_martian_photos(10);
    }
    
    @When("I retrieve top {int} earth photos")
    public void i_retrieve_top_earth_photos(int top_n_photos) {
        mainPage.retrieve_top_earth_photos(10);
    }
    
    @Then("I am happy")
    public void i_am_happy() {
    	System.out.println("I'm Happy now =)");
    }
    
    
    @Given("I want to get photos made by {string} on {int} martian sol earth date")
    public void i_want_to_get_photos_made_by_on_martian_sol_earth_date(String robot_name, int martian_sol) {
    	mainPage.generateRequestByEarth(robot_name,martian_sol);
    }

    @Given("Earth photos endpoint is available")
    public void earth_photos_endpoint_is_available() {
    	mainPage.is_earth_responding();
    }

    @When("I check both photo packages are equal")
    public void i_check_both_photo_packages_are_equal() {
    	mainPage.compare_photos();
    }

    @When("I check each camera did not took more than {int} times more photos than the other ones")
    public void i_check_each_camera_did_not_took_more_than_times_more_photos_than_the_other_ones(int more_times) {
    	mainPage.check_photo_times(more_times);
    }
    
    
    
}