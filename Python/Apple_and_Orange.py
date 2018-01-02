#Apple and Orange
s,t=[int(a) for a in input().strip().split(" ")]
a,b=[int(a) for a in input().strip().split(" ")]
m,n=[int(a) for a in input().strip().split(" ")]
apple,orange=0,0
temp1=list(map(int,input().strip().split(" ")))
temp2=list(map(int,input().strip().split(" ")))
for j in temp1:
    if ((a + j) >= s and (a + j) <= t):
        apple += 1

for j in temp2:
    if ((b + j) >= s and (b + j) <= t):
        orange += 1

print(apple)
print(orange)