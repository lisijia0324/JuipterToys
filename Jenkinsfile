#!/usr/bin/env groovy

pipeline{
    agent any

    stages{
        stage('Clean stage'){
            steps{
                echo 'This is Clean Project stage'
                bat 'mvn clean'

            }
        }
        stage('Test stage') {
            steps{
                echo 'This is TEST stage'
                bat 'mvn test -Dtest=BrowserTest -DartifactId=jupiterToysAutomation -Dbrowser=CHROME -DfailIfNoTests=false'
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
            steps {
                // Cucumber Report
                cucumber fileIncludePattern: '**/*.json'
            }
        }
        failure {
            echo 'Test failed!'
        }
    }
}