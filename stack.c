#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

typedef struct {
    /*
    The stack should contain an array to hold a maximum of 10 elements.
    */
    int st[10];
    int i;
    
} Stack;

/*
Initialising the stack, use this stack variable 's' in your functions.
*/
Stack s;


bool isEmpty() {
    /*
    Check if the stack is empty or not. Return true/false.
    */
    if(s.i==0)
    return true;
    else {
    return false;
    }
}

bool isFull() {
    /*
    Check if the stack is full or not. Return true/false.
    */
    if(s.i==9)
    return true;
    else
    return false;
}
void push(int n) {
    /*
    Push the integer n into the stack.
    Ignore if the operation is not possible.
    */if(isFull()!=true)
    {
    s.st[s.i]=n;
    s.i++;
    }
}
int pop() {
    /*
    Pop the top element in the stack and return that element.
    Return -1 the operation is not possible.
    */
    if(isEmpty()!=true)
    {
        s.i--;
        return s.st[s.i];
    }
    else 
    return -1;
}
int main() {
    int q, choice, n;
    s.i=0;
    scanf("%d", &q);
    while(q--) {
        scanf("%d%d", &choice, &n);
        switch(choice) {
            case 0: push(n);
                    break;
            case 1: printf("%d\n", pop());
                    break;
            case 2: printf("%d\n", isEmpty());
                    break;
            case 3: printf("%d\n", isFull());
                    break;
            // case 4: ;
            //         Stack temp;
            //         pop(&temp);
            //         push(&temp, n);
            //         break;
        }
    }
    return 0;
}
