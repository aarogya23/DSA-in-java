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
