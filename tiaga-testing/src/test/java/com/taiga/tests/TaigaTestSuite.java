package com.taiga.tests;

import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

@Suite
@SelectClasses({
        UserStoryTests.class,
        TaskTests.class,
        IssueTests.class,
        SprintTests.class,
        AuthenticationTests.class,
        GraphAuthenticationTests.class
})
public class TaigaTestSuite {
}