# 📘 Book API Automation Framework (Rest Assured + TestNG)

This is a Java-based API test automation framework built using **Rest Assured**, **TestNG**, and **Maven**. It performs **CRUD operations** on a public Book API:  
🔗 [https://fakerestapi.azurewebsites.net/api/v1](https://fakerestapi.azurewebsites.net/api/v1)

---

## 📂 Project Structure

BookAPIFramework/ │ ├── src/ │ ├── main/ │ │ ├── java/ │ │ │ ├── com/ │ │ │ │ └── API_WORKBOOK/ │ │ │ │ └── utils/ │ │ │ │ └── TestDataUtil.java │ │ │ └── config/ │ │ │ └── ConfigReader.java │ │ └── resources/ │ │ └── config.properties │ ├── src/ │ ├── test/ │ │ ├── java/ │ │ │ ├── com/ │ │ │ │ ├── base/ │ │ │ │ │ └── BaseTest.java │ │ │ │ ├── payloads/ │ │ │ │ │ └── BookPayload.java │ │ │ │ └── tests/ │ │ │ │ └── BookCRUDTest.java │ ├── pom.xml └── README.md
---

## ⚙️ Tech Stack

- **Java 8+**
- **Rest Assured**
- **TestNG**
- **Maven**
- **Fakerestapi Book Endpoint**

---

## 🌐 Base URL

The base URL is defined in `src/test/resources/config.properties`:

```properties
base_url=https://fakerestapi.azurewebsites.net/api/v1
🧪 What the Tests Cover
BookCRUDTest.java includes:

✅ Create Book (POST /Books)

🔍 Get Book by ID (GET /Books/{id})

✏️ Update Book (PUT /Books/{id})

❌ Delete Book (DELETE /Books/{id})

🔎 Get Non-existing Book (Negative test)