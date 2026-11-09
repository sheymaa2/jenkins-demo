pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                sh 'sh mvnw -B clean compile'
            }
        }

        stage('Test') {
            steps {
                sh 'sh mvnw -B test'
            }
            post {
                always {
                    junit 'target/surefire-reports/*.xml'
                }
            }
        }

        stage('Package') {
            steps {
                sh 'sh mvnw -B package -DskipTests'
                archiveArtifacts 'target/*.jar'
            }
        }
    }
}
