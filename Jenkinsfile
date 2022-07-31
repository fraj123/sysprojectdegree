pipeline {
    agent any
    tools {
        maven 'maven-3.8.5'
    }
    stages {
        stage('Build with unit testing') {
            script {
                echo 'Building...' + env.BRANCH_NAME
            }
        }
        stage("Test stage") {
            sh "mvn test"
        }
    }
}
