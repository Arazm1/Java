# 🔐 Registration Program.

This project is a **basic username and password input system** written in Java.  
It was created **for learning purposes only** and should **not** be used in a real-world application.  

---

## 🚀 Features
- Prompts the user for a **username** and **password**.
- Ensures the username is **not empty**.
- Validates that the password is **at least 4 characters long**.
- Uses a **loop** to prevent invalid inputs.

## 🚀 How It Works
1. The program asks the user to **enter a username**.
2. If the username is empty, it prompts the user to try again.
3. Once a valid username is entered, the program asks for a **password**.
4. If the password is **less than 4 characters**, it asks the user to enter a longer password.
5. After both fields are valid, the program confirms the selection.

## 📝 Code Overview

### **🔹 loginUsername()**
- Prompts the user to enter a username.
- Ensures the username is not empty.
- If valid, it calls `loginPassword()`.

### **🔹 loginPassword()**
- Prompts the user to enter a password.
- Ensures the password is at least **4 characters long**.
- Returns the valid password.

### **🔹 main()**
- Calls `loginUsername()` to start the authentication process.
