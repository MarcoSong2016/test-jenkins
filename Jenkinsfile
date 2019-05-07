pipeline {
    agent any
    tools {
       maven 'M3'
    }
    stages {
       stage('Build') {
          steps {
             sh "'${mvnHome}/bin/mvn' -Dmaven.test.failure.ignore clean package"
             }
       }
       stage('Results') {
          steps {
          archiveArtifacts 'target/jenkins-test-0.0.1-SNAPSHOT.jar'
          }
       }
    }
}