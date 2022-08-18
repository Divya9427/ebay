pipeline {
    agent any
    tools { 
        maven "MAVEN"
    }

    stages {
        stage ('Install') {

            steps {
                
                    bat 'mvn clean install'
                
            }
        }
                stage ('Compile') {

            steps {
                
                    bat 'mvn compile'
                
            }
        }
        stage ('Backend Service') {

            steps {
                
                    bat 'mvn spring-boot:run'
                
            }
        }


        stage ('Testing Stage') {

            steps {
              
                    bat 'mvn test'
                
            }
        }

    }
}