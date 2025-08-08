# 📚 Library Management System – Java Console Project

This is a simple **Library Management System** built using **Core Java**. It allows users to register books, search them, remove them, and display the entire collection using a console-based menu.

---

## 🗂️ Project Structure

```
Library_Management_System/
├── src/
│   └── bookregistration/
│       └── book/
│           ├── Book.java
│           ├── Library.java
│           └── bookregistration.java
├── .classpath
├── .project
└── README.md
```

---

## 🧠 Functionality

1. 📥 Add a Book (ISBN, Author, Title, Year Published)
2. ❌ Remove a Book (using ISBN)
3. 🔍 Search a Book (by ISBN)
4. 📃 Display All Registered Books
5. 🚪 Exit Application

---

## 🧾 Classes Overview

### 🔹 Book.java

- Model class representing a book.
- Fields: `bkIsbn`, `author`, `title`, `yearPub`.
- Includes constructor, getters, setters, and `toString()` method.

### 🔹 bookregistration.java

- Handles business logic.
- Uses a `HashMap<String, Book>` to store books.
- Methods:
  - `addBook()` – adds a book to the library.
  - `removebook(String isbn)` – removes a book by ISBN.
  - `search(String isbn)` – searches and returns a book.
  - `printall()` – prints all stored books.

### 🔹 Library.java

- Main class with `main()` method.
- Provides CLI menu using `Scanner` for user interaction.

---

## ▶️ How to Run

1. Open in any Java IDE (Eclipse/IntelliJ) or compile via terminal.
2. Make sure all files are in the correct package `bookregistration.book`.
3. Run `Library.java` to start the application.

```bash
javac Book.java bookregistration.java Library.java
java Library
```

---

## 📌 Sample Menu Output

```
1. Add Book
2. Remove Book
3. Search Book
4. Display Book
5. Exit Book
Enter your choice:
```


## 📄 License

This project is open-source under the **ISC License**.
