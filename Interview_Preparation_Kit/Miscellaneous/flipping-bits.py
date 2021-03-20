#!/bin/python3

import math
import os
import random
import re
import sys

# Complete the flippingBits function below.
def flippingBits(n):
    s = bin(n)[2:]
    s = list(((32-len(s))*'0') + s)
    
    for i in range(len(s)):
        if s[i] == '0':
            s[i] = '1'
        elif s[i] == '1':
            s[i] = '0'
    return int(''.join(s), 2)

if __name__ == '__main__':
    fptr = open(os.environ['OUTPUT_PATH'], 'w')

    q = int(input())

    for q_itr in range(q):
        n = int(input())

        result = flippingBits(n)

        fptr.write(str(result) + '\n')

    fptr.close()

