pipeline {
    agent any
    tools {
        maven 'maven-3.8.5'
    }
    stages {
        stage('Docker compose build') {
            steps {
                echo 'Docker compose phase'
                sh "docker-compose up -d --force-recreate --remove-orphans --build"
            }
        }
        stage('Build with unit testing') {
            steps {
                echo 'Building...' + env.BRANCH_NAME
            }
        }
        stage("Test stage") {
            steps {
                sh "./mvnw test"
            }
        }
    }
}
