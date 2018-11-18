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
                bat 'mvn install test -Dsurefire.useFile=false  -Dbrowser = CHROME'
            }
        }
//        stage('Package stage'){
//            steps{
//                echo 'This is Package stage'
//                bat 'mvn package'
//            }
//        }
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