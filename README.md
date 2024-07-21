# ChatStream
This is a WebSocket backend built using Java, Spring Boot, and Gradle. It allows clients to send and receive messages in a streaming format like ChatGPT.

**Setup and Run Locally**

### Prerequisites
1. Java 8 or later installed on your machine
2. Gradle installed on your machine (optional, but recommended for building and running the project)


### Clone the Repository

Clone this repository to a local directory on your machine:

```
git clone https://github.com/keerthinannepamula1/ChatStream.git
```

### Build the Project

Navigate to the project directory and build the project using Gradle:

```
cd ChatStream
gradle build
```
This will compile the Java code and create a build directory with the compiled classes.

## Run the Application

Run the application using the following command:

```
gradle bootRun
```

## Connecting to the WebSocket Server

**WebSocket URL**
```
http://localhost:8080/
```
This will start the Spring Boot application and make it available at http://localhost:8080.

## Test the Application

Open a web browser and navigate to **http://localhost:8080**. You should see a simple chat interface where you can send and receive messages.

## Configuration
You can configure the application by modifying the `application.properties` file in the `src/main/resources directory`. For example, you can change the WebSocket endpoint URL or the message broker settings.
