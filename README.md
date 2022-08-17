# eBayK DevOps/Release Engineer challenge - Market place application backend


## Introduction
This is a challenge designed to present you tasks from areas a DevOps/Release Engineer would deal with at eBay Kleinanzeigen and should give you an idea about what experiences are beneficial and the technologies, that we work with. If this brings up questions about the job, please write them down and address them during the interview.

We'll schedule a call where we'll go over these tasks more in detail and you'll present your solution ideas and answer questions about your solution. A good advice is to first go over the tasks and write down rough solution ideas and then work out a more detailed solution for the parts, where you see your strengths. We're asking you to not spend more than 90 minutes for working on this, to not take too much of your time.

Most tasks are related to a marketplace application. The exercise is to analyze and test the application. Additionally, a release pipeline should be created. There are three independent tasks. You can adapt everything, add libraries and other tools if this makes your life easier.

## Preparation

1. Make sure that the following is installed and ready to be used:

    - Java Development Kit version >=8
    - Maven
    - Your preferred IDE/editor
    - Docker

2. Check if your backend service can properly run

    ```
    mvn spring-boot:run
    ```

The application runs if you get a valid response from [http://localhost:8080/ad-single](http://localhost:8080/ad-single). Alternatively, you can also start the main class `com.ebayk.Application` in your preferred IDE.

## Tasks

### 1.1. Create a pipeline for building the docker image for the application

There is already a `Dockerfile` present in `src/main/docker`, which you may adjust as you need. Start a local Jenkins and set up a build job in Jenkins that builds the application and Docker image locally (no need to push it to a remote repository).

### 1.2. Add deployment configuration

To run the service in a test and production environment we'd like to prepare it for deployment. We're assuming we'll be running on Kubernetes. Please add deployment configuration in the form of plain Kubernetes YAML, a Helm chart or something similar. Add common resources in Kubernetes that would enable us to access the service from the outside via a URL. The actual configuration does not need to be 100% syntactically correct, so rather focus on showing the concepts than a perfect implementation.

### 2. Write a unit test and improve testability (OPTIONAL)

Start the server and open [http://localhost:8080/users/3/rated-users](http://localhost:8080/users/3/rated-users). There, you see a list of all users that were rated by the user with id `3`.

The business functionality is implemented in `com.ebayk.service.RatingAnalyzer` and the Rest controller is located in `com.ebayk.UserController`.
Implement unit tests for both classes. Refactor the code as is suits you, especially to improve testability.

