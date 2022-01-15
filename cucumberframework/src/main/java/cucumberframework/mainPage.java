package cucumberframework;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
//REST ASSURED IMPORTS
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import org.apache.commons.lang3.ArrayUtils;
import static org.junit.Assert.*;	


public class mainPage {
	
	
	//Created response variables to be used through the class methods
	static Response martian_response;
	static Response earth_response;
	
	
	public static void generateRequestByMartian(String robot_name, Integer martian_sol) {
		RestAssured.baseURI = "https://api.nasa.gov/mars-photos/api/v1/rovers/"+robot_name;
		RequestSpecification httpRequest = RestAssured.given();
	    martian_response = httpRequest.queryParam("sol",martian_sol).queryParam("api_key", "DEMO_KEY").get("/photos");
	}
	
	public static void generateRequestByEarth(String robot_name, int martian_sol) {
		String earth_date= get_earth_date_from_martian(robot_name,martian_sol);
		RestAssured.baseURI = "https://api.nasa.gov/mars-photos/api/v1/rovers/"+robot_name;
		RequestSpecification httpRequest = RestAssured.given();
	    earth_response = httpRequest.queryParam("earth_date",earth_date).queryParam("api_key", "DEMO_KEY").get("/photos");
	}
	
	//This retrieves the earth date equivalent to the martian sol passes as parameter
	private static String get_earth_date_from_martian(String robot_name, int martian_sol) {
		generateRequestByMartian(robot_name,martian_sol);
		String earth_date =martian_response.jsonPath().getList("photos.earth_date").get(0).toString();
		return earth_date;
		
	}

	public static void is_martian_responding() {
		int responseCode = martian_response.getStatusCode();
		assertEquals(200,responseCode);
	}
	
	public static void is_earth_responding() {
		int responseCode = earth_response.getStatusCode();
		assertEquals(200,responseCode);
	}
	
	public static void retrieve_top_martian_photos(int top_n_photos) {
		System.out.println("Retrieving photos by martian sol");
		List<Map<String, String>> all_photos = martian_response.jsonPath().getList("photos");
		for(int i=0;i<top_n_photos;i++) {
			System.out.println("Photo ID: "+ String.valueOf(all_photos.get(i).get("id")));
		}
	}
	
	public static void retrieve_top_earth_photos(int top_n_photos) {
		System.out.println("Retrieving photos by earth date");
		List<Map<String, String>> all_photos = earth_response.jsonPath().getList("photos");
		for(int i=0;i<top_n_photos;i++) {
			System.out.println("Photo ID: "+ String.valueOf(all_photos.get(i).get("id")));
		}
	}

	public static void compare_photos() {
		System.out.println("Comparing photos list from martian and earth");
		List<Map<String, String>> earth_photos = earth_response.jsonPath().getList("photos");
		List<Map<String, String>> martian_photos = martian_response.jsonPath().getList("photos");
		assertTrue(earth_photos.size() == martian_photos.size() && earth_photos.containsAll(martian_photos) && martian_photos.containsAll(earth_photos));
		
	}

	public static void check_photo_times(int more_times) {
		System.out.println("Comparing any camera did not takek more than " + more_times + " times photos than the other ones");
		List<Map<String, String>> martian_photos = martian_response.jsonPath().getList("photos.camera");
		//we count how many photos was taken by each camera
		int fhaz=0;
		int rhaz=0;
		int mast=0;
		int chemcam=0;
		int navcam=0;
		int mardi=0;
		int mahli=0;
		for(int i=0;i<martian_photos.size();i++) {
			String camera_name=martian_photos.get(i).get("name");
			switch(camera_name){
				case "FHAZ":
					fhaz+=1;
					break;
				case "RHAZ":
					rhaz+=1;
					break;
				case "MAST":
					mast+=1;
					break;
				case "CHEMCAM":
					chemcam+=1;
					break;
				case "NAVCAM":
					navcam+=1;
					break;
				case "MARDI":
					navcam+=1;
					break;
				case "MAHLI":
					navcam+=1;
					break;
			}
		}
		//we put the result in an int array, remove zero values, order the array and check the lower value by 10 (or parameter received) is not biger than the bigest number
		int[] photos_by_camera = {fhaz,rhaz,mast,chemcam,navcam,mardi,mahli};
		photos_by_camera = ArrayUtils.removeAllOccurrences(photos_by_camera, 0);
		Arrays.sort(photos_by_camera);
		int little_one = photos_by_camera[0];
		int big_one = photos_by_camera[photos_by_camera.length-1];
		assertTrue(little_one*more_times>big_one);	
	}
	

}
