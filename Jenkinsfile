pipeline {
    agent any

    tools {
        // Install the Maven version configured as 'M3' and add it to the PATH.
        maven 'M3'
    }

    stages {
        stage('Checkout') {
            steps {
                // Checks out the source code from repository
                checkout scm
            }
        }
        stage('Build') {
            steps {
                // Runs a Maven build
                echo 'Building..'
                sh 'mvn clean package'
            }
        }
        stage('Test') {
            steps {
                // Runs tests with Maven
                echo 'Testing..'
                sh 'mvn test'
            }
        }
        stage('Deploy') {
            steps {
                // Your deploy steps go here
                echo 'Deploying..'
            }
        }
    }
}
