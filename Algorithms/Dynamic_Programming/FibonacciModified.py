#!/bin/python3

import math
import os
import random
import re
import sys

# Complete the fibonacciModified function below.
def fibonacciModified(t1, t2, n):
    if n==2:
        return t2 
    tp = t2
    n-=1
    return fibonacciModified(tp, t1 + t2**2, n)

if __name__ == '__main__':
    fptr = open(os.environ['OUTPUT_PATH'], 'w')

    t1T2n = input().split()

    t1 = int(t1T2n[0])

    t2 = int(t1T2n[1])

    n = int(t1T2n[2])

    fptr.write(str(fibonacciModified(t1, t2, n)) + '\n')

    fptr.close()
