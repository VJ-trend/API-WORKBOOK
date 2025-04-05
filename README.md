# 📘 REST Assured Book API Automation | TestNG + Java + Maven

![Java](https://img.shields.io/badge/Java-17-blue.svg)
![RestAssured](https://img.shields.io/badge/RestAssured-API%20Testing-green)
![TestNG](https://img.shields.io/badge/TestNG-Test_Framework-orange)
![Status](https://img.shields.io/badge/Status-Working-blue)

Welcome to this mini API automation project using **REST Assured**! 🚀  
We test the public 🆓 **Fake REST API for Books** — focusing on GET methods since it's a read-only API.

---

## 🔗 Base URL

https://fakerestapi.azurewebsites.net/api/v1


📚 **Endpoint under test:** `/Books`

---

## 📦 Tech Stack

| Tool         | Purpose                        |
|--------------|--------------------------------|
| 🧠 Java       | Core programming language       |
| 🧪 TestNG     | Test framework                  |
| ⚙️ REST Assured | API automation                 |
| 🛠 Maven      | Build & dependency management  |

---

## 📁 Project Structure


---

## 🧪 What We’re Testing

| Test Name               | Status    | Description                                      |
|------------------------|-----------|--------------------------------------------------|
| `testGetAllBooks()`     | ✅ Pass    | Retrieve all books                              |
| `testGetBookById()`     | ✅ Pass    | Get a book by valid ID                          |
| `testGetNonExistingBook()` | ✅ Pass | Check 404 for non-existent book ID             |

> ❗ POST/PUT/DELETE requests are **not supported** by this public API, and will result in `405`/`501` errors.

---

## 🚀 How to Run

1. 🔁 Clone this repository
2. 📂 Open it in **Eclipse** or **IntelliJ**
3. 🔨 Run `mvn clean install` or right-click → **Run as TestNG Suite**
4. 🔍 Results appear in your console or TestNG tab

> Make sure your `config.properties` contains the correct URL:
```properties
base_url=https://fakerestapi.azurewebsites.net/api/v1
