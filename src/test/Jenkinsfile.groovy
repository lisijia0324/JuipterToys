pipeline{
    agent any
    stages{
        stage('Build') {
            steps{
               sh 'mvn - clean verify'
            }
        }
        stage('Test'){
            steps{
                echo 'This is Test stage'
            }
        }
        post {
            always {
                echo 'The end of the build!'
            }
        }
    }
}