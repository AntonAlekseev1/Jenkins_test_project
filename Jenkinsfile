pipeline {
    agent any
    stages {
        stage('Build') {
            steps {
                script {
                    echo 'Build'
                    sh './mvnw compile'
                }
            } 
        }
        stage('Test') {
            steps {
                script {
                    echo 'Test'
                    sh './mvnw test'
                }
            }            
        }
        stage('Package') {
            steps {
                script {
                sh './mvnw package'
                    echo 'Package'
                }
            }            
        }
        stage('Push'){
            steps {
                script {
                    echo 'Push'
                }
            }            
        }
    }
}
