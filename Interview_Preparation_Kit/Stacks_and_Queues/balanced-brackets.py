#!/bin/python3

import math
import os
import random
import re
import sys

# Complete the isBalanced function below.
def isBalanced(s):
    Q = []
    #{[()]}
    #{[(])}

    for i in s:
        if i in ['(', '{', '[']:
            Q.append(i)
        else:
            if len(Q) == 0:
                return 'NO'
            if i == ')' and Q.pop() != '(':
                return 'NO'
            if i == '}' and Q.pop() != '{':
                return 'NO'        
            if i == ']' and Q.pop() != '[':
                return 'NO'
    
    if len(Q) == 0:
        return 'YES'
    return 'NO'
                    
if __name__ == '__main__':
    fptr = open(os.environ['OUTPUT_PATH'], 'w')

    t = int(input())

    for t_itr in range(t):
        s = input()

        result = isBalanced(s)

        fptr.write(result + '\n')

    fptr.close()

