pipeline {
    agent any
    tools { 
        maven "MAVEN"
    }

    stages {
        stage ('Compile') {

            steps {
                withMaven(maven : 'maven_3_8_6') {
                    bat 'mvn clean compile'
                }
            }
        }
        
    //        stage('SonarQube analysis') {
    //   steps {
    //        withMaven(maven : 'maven_3_5_0') {
    //     withSonarQubeEnv('sonar') {
    //       bat 'mvn clean package sonar:sonar'
    //     }
    //   }
    // }
    //        }

        stage ('Testing Stage') {

            steps {
                withMaven(maven : 'maven_3_8_6') {
                    bat 'mvn test'
                }
            }
        }

    }
}