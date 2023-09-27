# Utilisez une image de base Java
#FROM openjdk:11-jre-slim

# Créez le répertoire de travail
#WORKDIR /app

# Copiez le fichier JAR de votre application dans le conteneur
#COPY target/usercrud.jar app.jar

# Exposez le port sur lequel votre application Spring Boot écoute (par défaut, c'est le port 8080)
#EXPOSE 8080

# Commande pour démarrer l'application Spring Boot lorsque le conteneur démarre
#CMD ["java", "-jar", "app.jar"]
From tomcat:8-jre8

COPY ./target/usercrud.war /usr/local/tomcat/webapps