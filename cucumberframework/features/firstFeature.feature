Feature: NASA OPEN API

  @test1 @all
  Scenario: Test1 - Retrieve the first 10 Mars photos made by "Curiosity" on 1000 Martian sol.
    Given I want to get photos made by 'curiosity' on 1000 martian sol
    And Mars photos endpoint is available
    When I retrieve top 10 martian photos
    Then I am happy
    
  @test2 @all  
  Scenario: Test 2 - Retrieve the first 10 Mars photos made by "Curiosity" on earth date equivalent to 1000 Martian sol.
    Given I want to get photos made by 'curiosity' on 1000 martian sol earth date
    And Earth photos endpoint is available
    When I retrieve top 10 earth photos
    Then I am happy
    
  @test3 @all  
  Scenario: Test 3 - Compare first 10 photos made by "Curiosity" at the same date queried by earth_date and martian_sol.
    Given I want to get photos made by 'curiosity' on 1000 martian sol earth date
    And I want to get photos made by 'curiosity' on 1000 martian sol
    And Earth photos endpoint is available
    And Mars photos endpoint is available
    When I check both photo packages are equal
    Then I am happy      
    
  @test4 @all  
  Scenario: Test 4 - Check each camera did not took more than 10 times more photos that the other ones for a same date
    Given I want to get photos made by 'curiosity' on 1000 martian sol
    And Mars photos endpoint is available
    When I check each camera did not took more than 10 times more photos than the other ones
    Then I am happy