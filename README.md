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

## FileFilter
