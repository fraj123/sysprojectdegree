pipeline {
    agent any

    stages {
        stage('Build with unit testing') {
            script {
                echo 'Building...' + env.BRANCH_NAME
            }
        }
        stage("Test stage") {
            script {
                ./mvnw test
            }
        }
    }
}
