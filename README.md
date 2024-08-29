# api-test-automation
A project to automate API testing using BDD and Page Object Model.

**Branching Strategy**

**Main Branch:** This is the default branch where the stable code resides.

**Develop Branch:** Create this branch from main for integrating features and bug fixes.

    Command: git checkout -b develop

**Feature Branches:** For each new feature, create a branch off develop.

    Command: git checkout -b feature/feature-name

**Bugfix Branches:** For bug fixes, create a branch off develop.

    Command: git checkout -b bugfix/bug-name

**Release Branches:** Create this branch from develop when preparing for a new release.'

    Command: git checkout -b release/release-version

**Hotfix Branches:** Create this branch from main for urgent fixes.

    Command: git checkout -b hotfix/hotfix-name

Project Structure 

src
 ├── main
 │    └── java
 │         └── com
 │              └── example
 │                   └── page
 │                        └── ApiPage.java
 └── test
      ├── java
      │    └── com
      │         └── example
      │              ├── steps
      │              │    └── ApiSteps.java
      │              ├── runner
      │              │    └── TestRunner.java
      │              └── features
      │                   └── api.feature
      └── resources
           └── test-config.properties

