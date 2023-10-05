pipeline{
    agent any
    tools{
        maven 'maven_3_5_0'
    }
    stages{
        stage('Build maven project'){
            steps{
                checkout scmGit(branches: [[name: '*/main']], extensions: [], userRemoteConfigs: [[url: 'https://github.com/rdrayef/devops-automation.git']])
                bat 'mvn clean install'
            }
        }
        stage('Build docker image'){
            steps{
                script{
                    bat 'docker build -t rdrayef/devops-integration .'
                }
            }
        }
        stage('Push DockerImage to DockerHub'){
            steps{
                script{
                    withCredentials([string(credentialsId: 'dockerpwd', variable: 'dockerhubpwd')]) {
                         bat 'docker login -u rdrayef -p Hotline2626'
                    }
                    bat 'docker push rdrayef/devops-integration'
                }
            }
        }
    }
}