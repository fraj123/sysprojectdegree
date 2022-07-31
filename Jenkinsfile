pipeline {
    agent any
    tools {
        maven 'maven-3.8.5'
    }
    stages {
        stage('Build with unit testing') {
            steps {
                sh "echo 'Building...' + env.BRANCH_NAME"
            }
        }
        stage("Test stage") {
            steps {
                sh "./mvnw test"
            }
        }
    }
}
