pipeline {
    agent any
    
    docker {
            image 'maven:3.8.1-adoptopenjdk-11'
            args '-v /root/.m2:/root/.m2'
        }
//        tools { 
//         maven 'Maven 3.8.6'  
//     }

    stages {
        stage ('Compile') {

            steps {
                withMaven(maven : 'maven_3_8_6') {
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
                withMaven(maven : 'maven_3_8_6') {
                    sh 'mvn test'
                }
            }
        }

    }
}
