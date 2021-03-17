if __name__ == '__main__':
    hm = {}
    scores = []
    names = []
    n = int(input())
    for i in range(n):
        names.append(input())
        scores.append(float(input()))
        
        if scores[i] in hm:
            hm[scores[i]].append(names[i])
        else:
            hm[scores[i]] = [names[i]]
    
    scores = list(set(scores)) 
    scores.sort()
    
    print("\n".join(sorted(hm[scores[1]])))
    
