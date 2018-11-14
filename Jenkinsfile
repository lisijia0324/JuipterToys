#!/usr/bin/env groovy

pipeline{
    agent any

    stages{
        stage('Clean stage'){
            steps{
                echo 'This is Clean Project stage'
                bat 'mvn clean verify'
                def v = version()
                if (v) {
                    echo "Building version ${v}"
                }
            }
        }
        stage('Test stage') {
            steps{
                echo 'This is TEST stage'
                bat 'mvn test -Dsurefire.useFile=false'
            }
        }
        stage('Package stage'){
            steps{
                echo 'This is Package stage'
                bat 'mvn package'
            }
        }
    }
    post{
        success{
            echo 'Test succeed!'
            scripts {
                // Cucumber Report
                cucumber fileIncludePattern: '**/*.json'
            }
        }
        failure {
            echo 'Test failed!'
        }
    }
}