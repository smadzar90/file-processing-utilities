# file-processing-utilities

This repository contains two Java utilities for file manipulation using custom data structures: a stack and a queue constructed with a singly linked list. These utilities are designed for reversing and filtering text files.


## FileReverser

The File Reverser utility reverses the content of a text file using a stack constructed with a singly linked list. The program reads characters from the input file, including whitespaces and line changes, and pushes them onto the stack. After pushing the characters, the program pops them from the stack and writes them to a new output file in reversed order.

### Input file:
```
Hello World
Bye
```
### Output file:
```
eyB
dlroW olleH
```
#### Skills Used

- Data Structures
- Algorithms
- File I/O
- OOP

## FileFilter

The File Filter utility filters the content of the text file using a queue constructed with a singly linked list. The program reads a character from the input file, including whitespaces and line changes, and enqueue's them in the queue. After enqueuing of the characters, the program dequeues the characters, switches its case and writes them to a new output file. 

### Input file:
```
Hello World
Bye
```
### Output file:
```
hELLO wORLD
bYE
```
#### Skills Used

- Data Structures
- Algorithms
- File I/O
- OOP

##Author

- Stipan Madzar


