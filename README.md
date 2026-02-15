📚 Stack Data Structure
📌 Introduction

A Stack is a linear data structure that follows the LIFO (Last In, First Out) principle.
The last element added to the stack is the first element to be removed.

Example:

Stack of plates

Browser back button

Undo/Redo operations

⚙️ Basic Operations
1️⃣ Push

Adds an element to the top of the stack.

2️⃣ Pop

Removes the top element from the stack.

3️⃣ Peek (Top)

Returns the top element without removing it.

4️⃣ isEmpty

Checks whether the stack is empty.

5️⃣ isFull (Array Implementation)

Checks whether the stack is full.

🏗️ Implementation Methods

Stack can be implemented using:

✅ Array

✅ Linked List

📊 Time Complexity
Operation	Time Complexity
Push	O(1)
Pop	O(1)
Peek	O(1)
🚀 Applications of Stack

Function call management (Call Stack)

Expression evaluation

Parenthesis checking

Undo/Redo feature

Depth First Search (DFS)

Browser navigation

📖 Example

If we push elements:

Push(10)
Push(20)
Push(30)


Stack becomes:

30  ← Top
20
10


After Pop():

20  ← Top
10

What is a Queue?

A Queue is a linear data structure that follows:

FIFO (First In, First Out)
The first element inserted is the first one removed.

📌 Real-life example:

Line at a ticket counter

Printer queue

Call center waiting system

🧠 Basic Terminology

Front → First element (removed from here)

Rear → Last element (inserted here)

⚙️ Basic Operations
Operation	Meaning
Enqueue	Insert element at rear
Dequeue	Remove element from front
Peek/Front	See first element
isEmpty	Check if queue is empty
isFull	Check if queue is full (array queue)

1️⃣ Simple (Linear) Queue

Here you go bro 🔥
You can **directly copy-paste this into your `README.md`** 👇

---

# 📌 Linear Queue Implementation in Java

## 📖 Overview

This project implements a **Linear Queue** using a normal array in Java.
The queue follows the **FIFO (First In, First Out)** principle.

---

## 🚀 Features

* Enqueue (Insert element)
* Dequeue (Remove element)
* Peek (View front element without removing)
* Display (Show all queue elements)
* Overflow handling
* Underflow handling

---

## 🧠 Concepts Used

* Array Data Structure
* FIFO Principle
* Front and Rear pointer management

---

## 🛠️ Technologies

* Java

---

## 📂 Project Structure

```
QueueImplementation/
└── LinearQueue.java
```

---

## ▶️ How to Run

1. Open the project in any Java IDE (Eclipse / IntelliJ / VS Code)
2. Run the `LinearQueue.java` file
3. View the output in the console

---

## 📌 Sample Output

```
10 inserted into the queue
20 inserted into the queue
30 inserted into the queue
10 deleted from the queue
Queue elements: 20 30
Front element is: 20
```

---

## ⚠️ Limitations

* Fixed size queue
* Cannot reuse deleted space (Linear Queue limitation)

---

## 📈 Future Improvements

* Circular Queue implementation
* Queue using Linked List
* Menu-driven program

---

Circular Queue
Definition

A Circular Queue connects the last position back to the first position to form a circle.

Structure
      [10] [20]
     /        \
   [50]      [30]
     \        /
      [40]

After reaching the end, the queue wraps around.

Formula used:

rear = (rear + 1) % size
front = (front + 1) % size
Advantages

Efficient memory utilization

No memory wastage

Reuses empty spaces

Disadvantages

Slightly complex implementation

🔄 Comparison Table
Feature	Linear Queue	Circular Queue
Structure	Linear	Circular
Memory Utilization	Inefficient	Efficient
Space Reuse	Not possible	Possible
Overflow Condition	rear == size - 1	front == (rear + 1) % size
Implementation	Simple	Moderate
Performance	Less efficient	More efficient
⚙️ Time Complexity
Operation	Time Complexity
Enqueue	O(1)
Dequeue	O(1)
Display	O(n)

Same for both, but Circular Queue uses memory efficiently.

🧠 Real-life Applications
Linear Queue

Printer queue

Ticket booking system

Circular Queue

CPU scheduling

Circular buffers

Multiplayer games turn system

💻 Java Implementation Files

LinearQueue.java

CircularQueue.java

📊 Conclusion

Circular Queue is better than Linear Queue because:

It avoids memory wastage

It improves efficiency

It reuses empty space

Circular Queue is preferred in most real-world applications.
