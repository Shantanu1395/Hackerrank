#Birthday Choclates
n=int(input())
l=list(map(int,input().strip().split(" ")))
d,m=map(int,input().strip().split(" "))
tot=0
if(n>m):
    for i in range(0,n-m+1):
        count=0
        for j in range(i,i+m):
            #print(l[j],' ',end="")
            count+=l[j]
            #print()
        if(count==d):
            tot+=1
else:
    for i in l:
        tot+=i
    if(tot==d):
        tot=1
    else:
        tot=0
print(tot)