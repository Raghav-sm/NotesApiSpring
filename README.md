


# 📘 Notes API (Spring Boot)

A beginner-friendly REST API built using **Spring Boot**.  
This project is part of a learning journey to understand how to build backend APIs using proper industry standards.

##  Features

###  1. Create a new note  
**POST** `/notes`  
Request Body:
```json
{
  "title": "My First Note",
  "content": "This is a test note."
}
````

Response:

```json
{
  "id": 1,
  "title": "My First Note",
  "content": "This is a test note."
}
```

---

###  2. Get all notes

**GET** `/notes`
Response:

```json
[
  {
    "id": 1,
    "title": "My First Note",
    "content": "This is a test note."
  }
]
```

---

###  3. Get a note by ID

**GET** `/notes/{id}`
Example: `/notes/1`
Response:

```json
{
  "id": 1,
  "title": "My First Note",
  "content": "This is a test note."
}
```

---

## Project Structure

```
src/main/java/com/example/notesapi/
 ├── controller/
 │     └── NotesController.java
 ├── model/
 │     └── Note.java
 └── NotesApiApplication.java
```

* `Note.java` → Represents the data model
* `NotesController.java` → Contains REST endpoints
* `NotesApiApplication.java` → Entry point of the Spring Boot application

---

## 🛠Technologies Used

* **Java 21**
* **Spring Boot 3**
* **Spring Web**
* **Maven**
* **JSON Responses**
* **In-memory ArrayList for storage**

---

## ▶How to Run the Project

### 1. Clone this repository:

```sh
git clone https://github.com/<your-username>/notes-api.git
cd notes-api
```

### 2. Run using Maven:

```sh
mvn spring-boot:run
```

OR run the main class:

```
NotesApiApplication.java → Run ▶
```

### 3. Test Endpoints

| Endpoint      | HTTP Method | Description       |
| ------------- | ----------- | ----------------- |
| `/notes`      | GET         | Get all notes     |
| `/notes/{id}` | GET         | Get a note by ID  |
| `/notes`      | POST        | Create a new note |

---

## Example Requests Using Postman or Thunder Client

### ➤ Create Note (POST)

Body:

```json
{
  "title": "Shopping List",
  "content": "Milk, Eggs, Bread"
}
```

### ➤ Get All Notes (GET)

/notes

### ➤ Get Note by ID (GET)

/notes/1

---

## Learning Checkpoint Summary

This project taught:

* What Controllers are
* How GET & POST work
* How to accept JSON using `@RequestBody`
* How to use `@PathVariable`
* Simple in-memory storage using `ArrayList`
* Auto-increment IDs using `AtomicLong`
* Returning JSON results

---

## Next Steps (coming soon)

* Add Service Layer
* Add Database (H2 / MySQL)
* Add Validation
* Add Exception Handling
* Build full CRUD system

---

## Contributions

This is a learning-focused project — feel free to fork and experiment.

---

## License

This project is open-source for learning purposes.

