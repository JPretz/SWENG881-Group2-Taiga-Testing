# SWENG881-Group2-Taiga-Testing

## Software Testing and Quality Assurance Project

**Course:** SWENG 881 – Software Testing and Quality Assurance  
**Professor:** Dr. Nathalia Moraes do Nascimento  
**Semester:** Summer 2026  
**Group:** Group 2

### Team Members

- John Pretz
- Yahya Youseef
- Devin Caswell

---

# Project Background

Taiga is an open-source Agile project management platform designed to support both Scrum and Kanban software development methodologies. The platform provides software development teams with a centralized environment for managing projects, user stories, tasks, issues, sprints, backlogs, and collaborative workflows.

Because Taiga contains numerous workflow-driven features, business rules, validation requirements, and user interactions, it serves as an excellent candidate for applying software testing and quality assurance methodologies. This project was conducted as part of SWENG 881 to evaluate selected features of the Taiga platform through structured testing activities and systematic analysis.

The project focuses on assessing the correctness, reliability, and robustness of core Taiga functionality using industry-standard software testing techniques including Input Domain Modeling, Graph-Based Testing, Exploratory Testing, and Automated Testing.

---

# Project Objectives

The objectives of this project are to:

- Apply software testing principles to a real-world software system.
- Evaluate the quality and reliability of key Taiga functionality.
- Verify business-rule enforcement and workflow behavior.
- Validate user input processing and system responses.
- Identify defects, usability concerns, and workflow inconsistencies.
- Develop manual and automated test artifacts.
- Document testing results and provide quality recommendations.
- Demonstrate the practical application of software testing methodologies.

---

# Application Under Test

**Taiga Open Source Agile Project Management System**

Official Repository:

https://github.com/taigaio

Taiga provides functionality including:

- Agile Project Management
- Scrum and Kanban Support
- User Story Management
- Task Management
- Issue Tracking
- Sprint Planning
- Milestone Management
- Workflow Management
- User Authentication and Authorization
- Team Collaboration

---

# Features Tested

The following Taiga features were selected for analysis and testing:

## User Story Management

- Create User Story
- User Assignment
- Story Points Management
- Workflow Validation
- Status Management

## Task Management

- Create Task
- User Story Relationships
- Assignment Validation
- Due Date Validation
- Task Status Management

## Issue Management

- Create Issue
- Severity Classification
- Priority Classification
- User Assignment
- Issue Workflow Validation

## Sprint and Milestone Management

- Sprint Creation
- Milestone Creation
- Date Validation
- Sprint State Validation
- Scheduling Constraints

## User Authentication

- User Registration
- User Login
- Username Validation
- Email Validation
- Password Validation
- Account Status Verification

---

# Testing Methodologies

## Input Domain Modeling (IDM)

Input Domain Modeling was used to identify input characteristics, partition input domains into equivalence classes, and select representative values for testing.

## Equivalence Partitioning

Equivalence Partitioning was used to create efficient and effective test suites by grouping input values expected to produce similar system behavior.

## Representative Value Analysis

Representative values were selected from each equivalence class to maximize testing coverage while minimizing redundant test cases.

## Graph-Based Testing

Graph-Based Testing was applied to the User Registration and Login workflow. A control flow graph was developed, and Edge Coverage was selected as the coverage criterion to ensure all workflow transitions were exercised.

## Exploratory Testing

Session-based exploratory testing was conducted to investigate:

- Workflow behavior
- Usability concerns
- Permission enforcement
- Input validation consistency
- Boundary conditions
- Error handling

Five exploratory testing sessions were performed covering:

1. User Story Management
2. Task and Issue Management
3. Sprint and Milestone Planning
4. Kanban and Sprint Task Board Functionality
5. Authentication and User Permissions

## Automated Testing

Automated testing was implemented using:

- JUnit 5
- Selenium WebDriver
- Cucumber BDD

Automation was used to improve repeatability, reliability, and consistency of test execution.

---

# Tools and Technologies

- Java
- JUnit 5
- Selenium WebDriver
- Cucumber
- IntelliJ IDEA
- GitHub
- Google Chrome
- Mozilla Firefox
- Microsoft Word

---

# Repository Contents

## Documentation

- Project Proposal
- System Test Plan Report
- Final Project Report
- Supporting Documentation

## Testing Artifacts

- Input Domain Modeling Analysis
- Equivalence Partitioning Tables
- Representative Value Tables
- Graph-Based Testing Documentation
- Exploratory Testing Charters
- Exploratory Testing Results
- Test Execution Results
- Quality Recommendations

## Automation Projects

- TaigaAuthentication1
- TaigaTesting
- TaigaUseStoryServices

## Supporting Materials

- Diagrams
- Control Flow Graphs
- Screenshots
- Execution Evidence
- Project Deliverables

---

# Appendices

## Appendix A

Taiga User Registration and Login Control Flow Graph

Contents include:

- Authentication Graph
- Node Descriptions
- Edge Descriptions
- Coverage Criterion
- Independent Test Paths
- Graph Metrics and Statistics

## Appendix B

Input Domain Modeling Test Cases and Execution Results

Contents include:

- User Story Testing
- Task Testing
- Issue Testing
- Sprint and Milestone Testing
- User Authentication Testing
- Test Execution Results

## Appendix C

Graph-Based Testing Documentation

Contents include:

- Graph-Based Test Set
- Edge Coverage Mapping
- Graph-Based Test Execution Results

## Appendix D

Exploratory Testing

Contents include:

- Exploratory Test Charters
- Session Objectives
- Scenario Results
- Defect Documentation
- Permission Testing Results
- Observations and Recommendations

---

# Key Results

## Input Domain Modeling Results

All developed Input Domain Modeling test cases executed successfully and met expected outcomes.

Areas tested included:

- User Stories
- Tasks
- Issues
- Sprints and Milestones
- User Registration and Login

## Graph-Based Testing Results

The authentication workflow was modeled using a control flow graph consisting of:

- 16 Nodes
- 20 Edges

All graph-based test cases passed successfully and satisfied the selected Edge Coverage criterion.

## Exploratory Testing Results

Five exploratory testing sessions were completed.

### Total Sessions Executed

- 5

### Total Scenarios Executed

- 33

### Minor Defects Identified

1. User stories can be marked as blocked without requiring a reason.
2. Task creation displays a generic error message instead of a field-level validation message.
3. Zero-duration sprints are accepted despite validation language suggesting the start date should precede the finish date.

### Additional Observations

- Story point calculations may treat incomplete estimates as zero.
- Sprint duration is not restricted.
- Permission updates require browser refresh to become visible.
- Permission-denied responses may present confusing messaging to users.

### Severity Assessment

- Critical Defects: 0
- Major Defects: 0
- Minor Defects: 3

Overall, the Taiga platform demonstrated strong functional reliability and validation controls throughout the testing effort.

---

# Conclusion

This repository contains the deliverables, testing artifacts, automation projects, and supporting documentation developed for the SWENG 881 Software Testing and Quality Assurance project.

Through the application of Input Domain Modeling, Equivalence Partitioning, Graph-Based Testing, Exploratory Testing, and Automated Testing techniques, the team evaluated key functionality within the Taiga Agile Project Management System and documented the resulting findings, observations, and recommendations.

The results demonstrate the effective application of software testing principles to a real-world open-source software project while providing meaningful insight into the quality and reliability of the Taiga platform.

---

# Acknowledgments

This project was completed as part of the SWENG 881 Software Testing and Quality Assurance course at The Pennsylvania State University.

All testing activities, analyses, execution results, and documentation contained within this repository were developed by Group 2 in fulfillment of course requirements and to demonstrate the practical application of modern software testing and quality assurance methodologies.