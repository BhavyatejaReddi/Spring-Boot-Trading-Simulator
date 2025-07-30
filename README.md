# Spring Boot Trading Simulator 🏦📈

A Java-based multithreaded Trading Simulator that matches buy/sell orders using synchronized logic and shows results on a Bootstrap-powered UI.

## ✨ Features

- ✅ Real-time Order Matching (Buy/Sell)
- 🔄 Multithreaded Engine with Synchronized Access
- 🌐 Spring Boot Web + Thymeleaf + Bootstrap
- 🚀 Clean project structure for product-based companies
- 🧪 Ready for CI/CD, Docker, and Testing Extensions

## 🧠 Tech Stack

- Java 17+
- Spring Boot 3.2
- Thymeleaf
- Bootstrap 5
- Maven
- Multithreading (synchronized, CopyOnWriteArrayList)

## 📸 Screenshots

> Add your UI screenshots to `screenshots/` folder

![App Screenshot](screenshots/ui-screenshot.png)

## 🚀 Getting Started

### Prerequisites

- JDK 17+
- Maven

### Run the Project

```bash
./mvnw spring-boot:run
```

Visit `http://localhost:8080` to interact with the simulator.

## 🧩 Folder Structure

```
spring-boot-trading-simulator/
├── src/
│   ├── main/
│   │   ├── java/com/trading/simulator/
│   │   └── resources/templates/
│   └── test/java/com/trading/simulator/
├── .mvn/wrapper/
├── mvnw, mvnw.cmd
├── pom.xml
├── .gitignore
├── .gitattributes
├── HELP.md
└── README.md
```

## 🧪 Future Enhancements

- Add REST APIs for placing/canceling orders
- Add database storage with JPA
- Add charts and analytics
- Deploy to cloud (Heroku, AWS)

## 👩‍💻 Author

**Sindhuja Beduduru**  
Passionate about Java, Spring Boot & building real-world simulators 💖

---

> Made with love and code 💻🌸
