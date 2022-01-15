$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:Features/firstFeature.feature");
formatter.feature({
  "name": "NASA OPEN API",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Test1 - Retrieve the first 10 Mars photos made by \"Curiosity\" on 1000 Martian sol.",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@test1"
    },
    {
      "name": "@all"
    }
  ]
});
formatter.step({
  "name": "I want to get photos made by \u0027curiosity\u0027 on 1000 martian sol",
  "keyword": "Given "
});
formatter.match({
  "location": "steps.i_want_to_get_first_photos_made_by_on_martian_sol(String,Integer)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Mars photos endpoint is available",
  "keyword": "And "
});
formatter.match({
  "location": "steps.mars_photos_endpoint_is_available()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I retrieve top 10 martian photos",
  "keyword": "When "
});
formatter.match({
  "location": "steps.i_retrieve_top_photos(int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I am happy",
  "keyword": "Then "
});
formatter.match({
  "location": "steps.i_am_happy()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Test 2 - Retrieve the first 10 Mars photos made by \"Curiosity\" on earth date equivalent to 1000 Martian sol.",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@test2"
    },
    {
      "name": "@all"
    }
  ]
});
formatter.step({
  "name": "I want to get photos made by \u0027curiosity\u0027 on 1000 martian sol earth date",
  "keyword": "Given "
});
formatter.match({
  "location": "steps.i_want_to_get_photos_made_by_on_martian_sol_earth_date(String,int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Earth photos endpoint is available",
  "keyword": "And "
});
formatter.match({
  "location": "steps.earth_photos_endpoint_is_available()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I retrieve top 10 earth photos",
  "keyword": "When "
});
formatter.match({
  "location": "steps.i_retrieve_top_earth_photos(int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I am happy",
  "keyword": "Then "
});
formatter.match({
  "location": "steps.i_am_happy()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Test 3 - Compare first 10 photos made by \"Curiosity\" at the same date queried by earth_date and martian_sol.",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@test3"
    },
    {
      "name": "@all"
    }
  ]
});
formatter.step({
  "name": "I want to get photos made by \u0027curiosity\u0027 on 1000 martian sol earth date",
  "keyword": "Given "
});
formatter.match({
  "location": "steps.i_want_to_get_photos_made_by_on_martian_sol_earth_date(String,int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I want to get photos made by \u0027curiosity\u0027 on 1000 martian sol",
  "keyword": "And "
});
formatter.match({
  "location": "steps.i_want_to_get_first_photos_made_by_on_martian_sol(String,Integer)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Earth photos endpoint is available",
  "keyword": "And "
});
formatter.match({
  "location": "steps.earth_photos_endpoint_is_available()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Mars photos endpoint is available",
  "keyword": "And "
});
formatter.match({
  "location": "steps.mars_photos_endpoint_is_available()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I check both photo packages are equal",
  "keyword": "When "
});
formatter.match({
  "location": "steps.i_check_both_photo_packages_are_equal()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I am happy",
  "keyword": "Then "
});
formatter.match({
  "location": "steps.i_am_happy()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Test 4 - Check each camera did not took more than 10 times more photos that the other ones for a same date",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@test4"
    },
    {
      "name": "@all"
    }
  ]
});
formatter.step({
  "name": "I want to get photos made by \u0027curiosity\u0027 on 1000 martian sol",
  "keyword": "Given "
});
formatter.match({
  "location": "steps.i_want_to_get_first_photos_made_by_on_martian_sol(String,Integer)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Mars photos endpoint is available",
  "keyword": "And "
});
formatter.match({
  "location": "steps.mars_photos_endpoint_is_available()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I check each camera did not took more than 10 times more photos than the other ones",
  "keyword": "When "
});
formatter.match({
  "location": "steps.i_check_each_camera_did_not_took_more_than_times_more_photos_than_the_other_ones(int)"
});
formatter.result({
  "error_message": "java.lang.AssertionError\r\n\tat org.junit.Assert.fail(Assert.java:86)\r\n\tat org.junit.Assert.assertTrue(Assert.java:41)\r\n\tat org.junit.Assert.assertTrue(Assert.java:52)\r\n\tat cucumberframework.mainPage.check_photo_times(mainPage.java:121)\r\n\tat stepdefinitions.steps.i_check_each_camera_did_not_took_more_than_times_more_photos_than_the_other_ones(steps.java:53)\r\n\tat ✽.I check each camera did not took more than 10 times more photos than the other ones(file:Features/firstFeature.feature:30)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "I am happy",
  "keyword": "Then "
});
formatter.match({
  "location": "steps.i_am_happy()"
});
formatter.result({
  "status": "skipped"
});
});