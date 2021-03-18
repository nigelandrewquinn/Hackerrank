#!/bin/python3

import math
import os
import random
import re
import sys

# Complete the countSwaps function below.
def swap(i, j):
    temp = a[i]
    a[i] = a[j]
    a[j] = temp
    return

def countSwaps(a):
    count = 0
    for i in range(0, n):
        for j in range(0, (n-1)):
            if a[j] > a[j + 1]:
                swap(j, j + 1)
                
                count += 1
    print('Array is sorted in', count, 'swaps.')
    print('First Element:', a[0])
    print('Last Element:', a[-1])
    return


    
    
if __name__ == '__main__':
    n = int(input())

    a = list(map(int, input().rstrip().split()))

    countSwaps(a)

