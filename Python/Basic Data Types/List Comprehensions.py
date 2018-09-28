if __name__ == '__main__':
    x = int(raw_input())
    y = int(raw_input())
    z = int(raw_input())
    n = int(raw_input())
    
    #x,y,z range 0-> num+1 if x+y+z!=n append to list
    list = []
    for i in range (0, x+1):
        for j in range (0, y+1):
            for k in range (0, z+1):
                if (i+j+k) != n:
                    l = [i,j,k]
                    list.append(l)
    print(list)
