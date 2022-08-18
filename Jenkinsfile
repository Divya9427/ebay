pipeline {
    agent any
    tools { 
        maven "MAVEN"
    }

    stages {
        stage ('Compile') {

            steps {
            
                    bat 'mvn clean compile'
                
            }
        }
        

        stage ('Testing Stage') {

            steps {
                
                    bat 'mvn test'
                
            }
        }

    }
}
