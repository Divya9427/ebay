pipeline {
    agent any

    stages {
        stage ('Compile') {

            steps {
                withMaven(maven : 'maven_3_5_0') {
                    sh 'mvn clean compile'
                }
            }
        }
        
           stage('SonarQube analysis') {
      steps {
           withMaven(maven : 'maven_3_5_0') {
        withSonarQubeEnv('sonar') {
          sh 'mvn clean package sonar:sonar'
        }
      }
    }
           }

        stage ('Testing Stage') {

            steps {
                withMaven(maven : 'maven_3_5_0') {
                    sh 'mvn test'
                }
            }
        }

    }
}
