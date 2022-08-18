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


        stage ('Testing Stage') {

            steps {
              
                    bat 'mvn test'
                
            }
        }

    }
}