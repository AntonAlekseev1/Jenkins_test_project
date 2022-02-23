pipeline {
    agent any
    stages {
        stage('Build') {
            steps {
                script {
                    echo 'Build'
                    sh 'mvn compile'
                }
            } 
        }
        stage('Test') {
            steps {
                script {
                    echo 'Test'
                    sh 'mvn test'
                }
            }            
        }
        stage('Package') {
            steps {
                script {
                sh 'mvn package -Dmaven.test.skip'
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
        stage('Run local'){
            steps {
                dir('/var/lib/jenkins/workspace/module_pipeline_master/target') {
                    sh 'java -jar example-app.jar'
                }
            }            
        }
    }
}
