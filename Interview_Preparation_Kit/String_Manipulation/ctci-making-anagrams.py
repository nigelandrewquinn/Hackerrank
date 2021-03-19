#!/bin/python3

import math
import os
import random
import re
import sys

# Complete the makeAnagram function below.

def makeAnagram(a, b):
    la = [0]*26
    lb = [0]*26
    for i in a:
        la[ord(i)-97]+=1
    for i in b:
        lb[ord(i)-97]+=1
    count = 0
    for i in range(len(la)):
        count += abs(la[i] - lb[i])
    return count    
    

if __name__ == '__main__':
    fptr = open(os.environ['OUTPUT_PATH'], 'w')

    a = input()

    b = input()

    res = makeAnagram(a, b)

    fptr.write(str(res) + '\n')

    fptr.close()

