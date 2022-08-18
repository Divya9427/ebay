pipeline {
    agent any
    tools { 
        maven "MAVEN"
    }

    stages {
        stage ('Compile') {

            steps {
            {
                    sh 'mvn clean compile'
                }
            }
        }
        
    //        stage('SonarQube analysis') {
    //   steps {
    //        withMaven(maven : 'maven_3_5_0') {
    //     withSonarQubeEnv('sonar') {
    //       sh 'mvn clean package sonar:sonar'
    //     }
    //   }
    // }
    //        }

        stage ('Testing Stage') {

            steps {
                {
                    sh 'mvn test'
                }
            }
        }

    }
}
