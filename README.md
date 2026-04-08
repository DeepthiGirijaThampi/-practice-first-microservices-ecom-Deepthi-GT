# 🛒 Microservices Architecture Project (Spring Boot + Eureka + Feign)

---

## 🚀 Project Overview

This project demonstrates a basic microservices architecture using Spring Boot.  
Instead of building one large application, the system is divided into multiple smaller services that communicate with each other.

The goal of this project is to understand how microservices work in practice, including service communication and service discovery.

---

## 🧩 Microservices in this Project

This project contains four main services:

### 🔹 Eureka Server
- Acts as a service registry  
- All microservices register here  
- Helps services discover each other  

👉 Runs on: http://localhost:8761  

---

### 🔹 Product Service
- Manages product data  
- Provides APIs to:  
  - Get all products  
  - Get product by ID  

---

### 🔹 Order Service
- Handles order-related operations  
- Calls Product Service using Feign Client  
- Demonstrates microservice communication  

---

### 🔹 API Gateway
- Acts as a single entry point for all client requests  
- Routes requests to appropriate microservices  
- Simplifies communication between client and services  

👉 Example:
Client → API Gateway → Order Service → Product Service  

---

## ⚙️ Technologies Used

- Java 21  
- Spring Boot  
- Spring Cloud Eureka  
- Spring Cloud Gateway  
- Feign Client  
- Maven  
- REST APIs  

---

## 🔗 How Microservices Communicate
1. Client sends request to API Gateway  
2. API Gateway routes request to Order Service  
3. Order Service uses Feign Client to call Product Service  
4. Eureka Server helps services discover each other  
5. Product Service returns data  
6. Order Service processes response and sends it back

---

## 📡 Key Features

- Microservices architecture  
- Service discovery using Eureka  
- Inter-service communication using Feign  
- API Gateway for centralized routing  
- RESTful APIs  

---
       
## 📡 Sample API Endpoints
### 🟢 Get all products
```
GET /catalog-service/v1/products
```

### 🟢 Get product by ID
```
GET /catalog-service/v1/products/productId/{id}
```

### 🟢 Place order
```
GET /orders/place-order/{productId}
```

---

## ▶️ How to Run the Project

### Step 1: Start Eureka Server
Run: ecom-eureka-registry
Open: http://localhost:8761

### Step 2: Start Product Service
Run: ecom-product-service

### Step 3: Start Order Service
Run: ecom-order-service

---

## 👩‍💻 Author
Deepthi Girija Thampi


