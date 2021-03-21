#!/bin/python3

import math
import os
import random
import re
import sys
from collections import Counter

# Complete the freqQuery function below.

def freqQuery(queries):
    freq = Counter()
    occur = Counter()
    ans = []
    for i in queries:
        query = i[0]
        data = i[1]
        if query == 1:
            occur[freq[data]]-=1
            freq[data]+=1
            occur[freq[data]]+=1
        elif query == 2:
            if freq[data]>0:
                occur[freq[data]]-=1
                freq[data]-=1
                occur[freq[data]]+=1
        else:
            if occur[data] > 0:
                ans.append(1)
            else:
                ans.append(0)
    return ans
                        
        
    

if __name__ == '__main__':
    fptr = open(os.environ['OUTPUT_PATH'], 'w')

    q = int(input().strip())

    queries = []

    for _ in range(q):
        queries.append(list(map(int, input().rstrip().split())))

    ans = freqQuery(queries)

    fptr.write('\n'.join(map(str, ans)))
    fptr.write('\n')

    fptr.close()

