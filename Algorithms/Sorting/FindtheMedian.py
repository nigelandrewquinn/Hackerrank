#!/bin/python3

import sys

def findMedian(arr):
    # Complete this function
    arr.sort()
    x = int(len(arr)/2)
    return arr[x]

if __name__ == "__main__":
    n = int(input().strip())
    arr = list(map(int, input().strip().split(' ')))
    result = findMedian(arr)
    print(result)
