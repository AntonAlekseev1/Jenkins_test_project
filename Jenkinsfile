pipeline {
    agent any
    stages {
        stage('Prepare') {
            steps {
                script {
                def repo = checkout scm
                }
            }
        }
        stage('Build') {
            steps {
                script {
                    echo 'Build'
                }
            }
        }
        stage('Test') {
            steps {
                script {
                    echo 'Test'
                }
            }            
        }
        stage('Package') {
            steps {
                script {
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
