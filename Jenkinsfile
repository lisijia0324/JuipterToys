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
                bat 'mvn test -Dbrowser=CHROME'
            }
        }
        stage('Package stage'){
            steps{
                echo 'This is Package stage'
                bat 'mvn package'
                cucumber fileIncludePattern: '**/*.json'
            }
        }
    }
}