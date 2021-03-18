#!/bin/python3

import math
import os
import random
import re
import sys

# Complete the checkMagazine function below.
def create_hm(ar):
    hm = {}
    for i in ar:
        if i in hm:
            hm[i] += 1
        else:
            hm[i] = 1
    return hm

def solve():
    hm_magazine = create_hm(magazine)
    hm_note = create_hm(note)
    for key, value in hm_note.items():
        if key in hm_magazine:
            if hm_magazine[key] < value:
                return False
        else:
            return False
    return True
            
def checkMagazine(magazine, note):
    if solve():
        print('Yes')
    else:
        print('No')
    

if __name__ == '__main__':
    mn = input().split()

    m = int(mn[0])

    n = int(mn[1])

    magazine = input().rstrip().split()

    note = input().rstrip().split()

    checkMagazine(magazine, note)

