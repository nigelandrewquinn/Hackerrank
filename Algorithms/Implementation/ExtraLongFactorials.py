import sys

def f(n):
    if n == 1:
        return 1
    return n * f(n-1)
    

if __name__ == "__main__":
    n = int(input().strip())
    print(f(n))
