#Diagonal Difference
n=int(input())
l=[]
for i in range(n):
    temp=[int(tempvar) for tempvar in input().strip().split(" ")]
    l.append(temp)

d1,d2=0,0
for i in range(n):
    for j in range(len(l[i])):
        if i==j:
            d1+=l[i][j]
        if i+j==n-1:
            d2+=l[i][j]
print(abs(d1-d2))