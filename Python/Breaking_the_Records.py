#Breaking the Records
n=int(input())
l=list(map(int,input().strip().split(" ")))
high,low,hc,lc=l[0],l[0],0,0
for i in range(1,n):
    if(l[i] > high):
        high=l[i]
        hc+=1
    if (l[i] < low):
        low=l[i]
        lc+=1
print(hc,lc)