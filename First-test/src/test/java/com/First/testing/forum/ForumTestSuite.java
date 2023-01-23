package com.First.testing.forum;

import org.junit.jupiter.api.*;
import com.First.testing.user.SimplyUser;

@DisplayName("Forum Test Suite")
public class ForumTestSuite {

    @BeforeEach
    public void before() {
        System.out.println("Test Case: begin");
    }
    @AfterEach
    public void afret() {
        System.out.println("Test case: end");
    }
    @BeforeAll
    public static void beforeAll() {
        System.out.println("Test Suite: begin");
    }
    @AfterAll
    public static void afterAll() {
        System.out.println("Test Suite: end");
    }
    @DisplayName(
            "When created SimpleUser with name, " +
            "then getUsername should return correct name"
    )
    @Test
    void testCaseRealName() {
        //Given
        SimplyUser simplyUser = new SimplyUser("theForumUser", "John Smith");
        //When
        String result = simplyUser.getRealName();
        System.out.println("Testing " + result);
        //Then
        Assertions.assertEquals("John Smith", result);
    }
    @DisplayName("when create SimpleUser with name, " +
            "then getUsername should return correct name")
            @Test
    void testCaseUsername() {
    //Given
        SimplyUser simplyUser = new SimplyUser ("theForumUser", "John Smith");
        //When
        String result = simplyUser.getUsername();
        String expectedResult = "theForumUser";
        //Then
        Assertions.assertEquals(expectedResult, result);
    }
}