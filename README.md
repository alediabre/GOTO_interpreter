## GOTO Language

### Basic instructions

For each V variable and L label:

* **Increment**\
    Increments by 1 the value of V\
    ``V <- V + 1``
    

* **Decrement**\
  Decrements by 1 the value of V\
  ``V <- V - 1``


* **Conditional**\
  If the value of V is 0, it has no effect, if it isn`t equal
to 0, jumps to the first instruction of L label\
  ``IF V!=0 GOTO L``


* **Skip**\
  Ih has no effect\
  ``SKIP, V <- V``