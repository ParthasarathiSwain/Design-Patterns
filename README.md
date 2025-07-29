\# 🎯 Java Design Patterns – Hands-On Practice Repository



Welcome to the \*\*Java Design Patterns Practice Repository\*\*, where you'll explore real-world, clean implementations of all \*\*23 Gang of Four (GoF) Design Patterns\*\* — starting with the foundational \*\*Singleton Pattern\*\*.



---



\## 📘 Project Overview



This repository provides practical Java-based implementations of the following design pattern types:



\- 🏗️ \*\*Creational Patterns\*\*\\

&nbsp; (e.g., Singleton, Factory, Builder, Prototype, Abstract Factory)

\- 🧹 \*\*Structural Patterns\*\*\\

&nbsp; (e.g., Adapter, Bridge, Composite, Decorator, Facade, Proxy)

\- 🔄 \*\*Behavioral Patterns\*\*\\

&nbsp; (e.g., Strategy, Observer, Command, State, Chain of Responsibility, Template Method)



Each pattern includes:



\- ✅ Clear explanation

\- 🧠 Real-world application

\- 📊 UML diagrams (coming soon)

\- 💻 Java source code

\- ⚙️ Test examples to demonstrate functionality



---



\## 🔒 Singleton Pattern – Explained \& Implemented



The \*\*Singleton Pattern\*\* ensures that a class has \*\*only one instance\*\* throughout the application lifecycle and provides a \*\*global access point\*\* to it. It's commonly used in scenarios such as:



\- Logging

\- Configuration management

\- Printer spoolers

\- Database connections



\### 📁 Folder Structure



```

/Singleton

├── Printer.java                   // Lazy Singleton with double-checked locking

├── Printer1.java                  // Eager Singleton

├── SingletonTest01.java           // Basic Singleton test

├── SingletonTest\_MultiThread.java // Multi-threaded Singleton test

├── TicketBookingOperation.java    // Real-world ticket booking use case

```



---



\## 🔍 Highlights



\- Implements both \*\*lazy\*\* and \*\*eager\*\* initialization

\- Ensures \*\*thread safety\*\* using synchronized blocks and double-checked locking

\- Simulates \*\*multi-threaded environments\*\* to test Singleton behavior

\- Demonstrates a \*\*real-world use case\*\*: Ticket Booking System



---



\## 🦖 How to Run



\### ▶️ Basic Singleton Test



```bash

java Singleton.SingletonTest01

```



Expected Output:



```

Hash Code :: 12345678 , 12345678

(p1 == p2)? true

```



\### ▶️ Multi-threaded Singleton Test



```bash

java Singleton.SingletonTest\_MultiThread

```



This simulates concurrent thread access and ensures that only one Singleton instance is created.



---



\## 🧪 Why Use Design Patterns?



\- 🔄 Reuse proven design solutions

\- 🔧 Build scalable and maintainable systems

\- 🎓 Improve OOP design and architecture skills

\- 💼 Ace coding interviews and system design rounds



---



\## 🤝 Contributing



We welcome your contributions! You can:



\- 📄 Fork this repository

\- ✏️ Add new design pattern examples

\- 📝 Improve documentation

\- 📋 Submit a pull request with your changes



---



\## 👨‍💼 Developed By



\*\*Parthasarathi Swain\*\*\\

📍 Opentechz Pvt Ltd\\

📧 \[rajaswain6969@gmail.com](mailto\\:rajaswain6969@gmail.com)\\



---



\## ⭐ Star This Repository



If this project helped you:



\- 💫 Star the repo

\- 📣 Share with your peers

\- 🎓 Use it for your learning or training sessions





---



Thanks for visiting! Happy Coding! 🚀





