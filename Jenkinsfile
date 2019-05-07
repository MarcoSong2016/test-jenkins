pipeline {
    agent any
    tools {
       maven 'apache-maven-3.6.1'
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