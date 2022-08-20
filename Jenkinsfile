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
        stage (' Package') {

            steps {
              
                    bat 'mvn package'
                
            }
        }

        // stage ('Backend Service') {

        //     steps {
                
        //             bat 'mvn spring-boot:run'
                
        //     }
        // }


        stage ('Testing Stage') {

            steps {
              
                    bat 'mvn test'
                
            }
        }
                stage ('copy war to base') {

            steps {
              
                   bat ' \'xcopy "C:\\ProgramData\\Jenkins\\.jenkins\\workspace\\Ebay_Test\\target\\ebayk-0.1.0.war" "C:\\ProgramData\\Jenkins\\.jenkins\\workspace\\Ebay_Test"\''
                
            }
        }
        stage ('Build Image') {

            steps {
              
                bat 'docker build -f ./Dockerfile -t ebayimage .'
                
            }
        }
    //     stage ('Push to Repository') {

    //         steps {
              
    //             bat 'docker push -f ./Dockerfile -t ebayimage .'
                
    //         }


     }
}