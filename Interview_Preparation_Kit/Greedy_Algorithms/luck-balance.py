#!/bin/python3

import math
import os
import random
import re
import sys

# Complete the luckBalance function below.
def luckBalance(k, contests):
    contests.sort(key = lambda x:(x[1],x[0]), reverse =True)
    i = 0
    count = 0
    while i < len(contests):
        if contests[i][1] == 0:
            count += contests[i][0]
        elif k > 0:
            count += contests[i][0]
            k -= 1
        else:
            count -= contests[i][0]
        i += 1
    return count

if __name__ == '__main__':
    fptr = open(os.environ['OUTPUT_PATH'], 'w')

    nk = input().split()

    n = int(nk[0])

    k = int(nk[1])

    contests = []

    for _ in range(n):
        contests.append(list(map(int, input().rstrip().split())))

    result = luckBalance(k, contests)

    fptr.write(str(result) + '\n')

    fptr.close()

