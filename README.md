
# API Wrapper

A REST API built with Java and Spring Boot that acts as an intermediary between clients and the [JSONPlaceholder](https://jsonplaceholder.typicode.com/) external API.

The application provides endpoints for retrieving users, managing posts, and retrieving comments associated with a specific post.

## Technologies Used

- Java 17
- Spring Boot
- Spring Web
- RestClient
- Maven

## Architecture

The application follows a layered architecture to separate responsibilities and organize the codebase.

```text
Client
  |
  v
Controller Layer
  |
  v
Service Layer
  |
  v
ThirdParty Layer
  |
  v
JSONPlaceholder API
```

### Project Layers

- **Controller:** Handles incoming HTTP requests and returns appropriate responses.
- **Service:** Coordinates application operations and contains the business logic.
- **ThirdParty:** Handles HTTP communication with the external JSONPlaceholder API using Spring's RestClient.
- **Model:** Contains the data models representing users, posts, and comments.

## API Endpoints

All endpoints are available under the base URL:

```text
http://localhost:8080
```

### Users

| Method | Endpoint | Description |
|---|---|---|
| GET | `/users` | Retrieve all users. |

### Posts

| Method | Endpoint | Description |
|---|---|---|
| GET | `/posts` | Retrieve all posts. |
| POST | `/posts` | Create a new post. |
| PUT | `/posts/{id}` | Update an existing post. |
| DELETE | `/posts/{id}` | Delete a post. |

### Comments

| Method | Endpoint | Description |
|---|---|---|
| GET | `/comments?postId={postId}` | Retrieve comments associated with a specific post. |

## Example Requests

### Get All Users

```http
GET /users
```

### Get All Posts

```http
GET /posts
```

### Create a Post

```http
POST /posts
Content-Type: application/json
```

```json
{
  "userId": 1,
  "title": "My First Post",
  "body": "This is an example post."
}
```

### Update a Post

```http
PUT /posts/1
Content-Type: application/json
```

```json
{
  "userId": 1,
  "title": "Updated Title",
  "body": "Updated post content."
}
```

### Delete a Post

```http
DELETE /posts/1
```

### Get Comments of a Post

```http
GET /comments?postId=1
```

## Getting Started

### Prerequisites

- Java 17 or later
- Git

### Clone the Repository

```bash
git clone https://github.com/YOUR_USERNAME/YOUR_REPOSITORY.git
```

Navigate to the project directory:

```bash
cd YOUR_REPOSITORY
```

### Run the Application

On Windows:

```powershell
.\mvnw.cmd spring-boot:run
```

On Linux or macOS:

```bash
./mvnw spring-boot:run
```

The application will start at:

```text
http://localhost:8080
```

## External API

This project uses [JSONPlaceholder](https://jsonplaceholder.typicode.com/) as its external data source.

The application forwards requests to JSONPlaceholder and exposes the retrieved data through its own REST endpoints.
