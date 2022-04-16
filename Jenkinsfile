pipeline {
    agent any 
    stages {
        stage('Build') { 
            steps {
                git 'https://github.com/shivusrd/Cucumber_demo.git'
            }
        }
        stage('Test') { 
            steps {
                bat "mvn test"
            }
        }
        stage('Deploy') { 
            steps {
                 bat "mvn clean "
            }
        }
    }
}
