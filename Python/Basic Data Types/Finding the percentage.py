n = int(input())
student_marks = {}
for _ in range(n):
    name, *line = input().split()
    student_marks[name] = sum(list(map(float, line)))/len(line)
query_name = input()
print("%.2f" % student_marks[query_name])
