pipeline {
    agent any

    environment {
    SONARSERVER = "sonarserver"
    SONARSCANNER = "sonarscanner"
    }

    stages {
        stage('Checkout') {
            steps {
                checkout scm
            }
        }

        stage('Build') {
            steps {
                bat 'mvn clean package'
            }
        }

        /*stage('Test') {
            steps {
                bat 'mvn test'
            }
        }*/

       /* stage('SonarQube Analysis') {
          environment {
             scannerHome = tool "${SONARSCANNER}"
          }
                            steps {
                                withSonarQubeEnv("${SONARSERVER}") {
                                    bat 'mvn sonar:sonar'
                                }
                            }
                        }*/



        /*stage('Deploy') {
            steps {
                bat 'mvn clean deploy'
            }
        }*/
        stage('Build Docker Image') {
            steps {
                // Étape de construction de l'image Docker
                script {
                    def dockerImage = docker.build('chaymariahi/usercrud:${TAG}')
                    dockerImage.inside {
                        // Copiez le fichier JAR dans le conteneur
                        bat 'copy target\\usercrud.jar app.jar'
                    }
                }
            }
        }

        stage('Push Docker Image') {
            steps {
                // Étape pour pousser l'image Docker vers un registre (facultatif)
                script {
                    docker.withRegistry('https://registry.example.com', 'credentials-id') {
                        /*def dockerImage = docker.image('chaymariahi/backend:${TAG}')
                        dockerImage.push()*/
                        docker.image("chaymariahi/usercrud:${TAG}").push()
                        docker.image("chaymariahi/usercrud:${TAG}").push("latest")
                    }
                }
            }
        }
        
        stage('Deploy to Production') {
            when {
                branch 'main' // Déployez uniquement sur la branche principale (ou autre condition de déploiement)
            }
            steps {
                // Étape pour déployer l'image Docker sur le serveur de production
                //bat 'docker run -d -p 8080:8080 nom-de-l-image:tag'
                bat "docker stop hello-world | true"
                bat "docker rm hello-world | true"
                bat "docker run --name hello-world -d -p 9004:8080 chaymariahi/usercrud:${TAG}"
            }
        }
    }
    }
    
