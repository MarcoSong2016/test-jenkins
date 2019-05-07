pipeline {
    agent any
        tools {
            maven 'Maven 3.6.1'
        }
    stages {
       stage('Preparation') { // for display purposes
          // Get some code from a GitHub repository
          git 'https://github.com/MarcoSong2016/test-jenkins.git'
          // Get the Maven tool.
          // ** NOTE: This 'M3' Maven tool must be configured
          // **       in the global configuration.
          mvnHome = tool 'M3'
       }
       stage('Build') {
          // Run the maven build
          if (isUnix()) {
             sh "'${mvnHome}/bin/mvn' -Dmaven.test.failure.ignore clean package"
          } else {
             bat(/"${mvnHome}\bin\mvn" -Dmaven.test.failure.ignore clean package/)
          }
       }
       stage('Results') {
        //   junit '**/target/surefire-reports/TEST-*.xml'
          archiveArtifacts 'target/jenkins-test-0.0.1-SNAPSHOT.jar'
       }
    }
}