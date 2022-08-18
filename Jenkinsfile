pipeline {
    agent any
     tools {
        maven "MAVEN"
        jdk "JDK"
    }
    

    stages {
        stage('Initialize'){
            steps{
                echo "PATH = ${M2_HOME}/bin:${PATH}"
                echo "M2_HOME = /opt/maven"
            }
        }
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
