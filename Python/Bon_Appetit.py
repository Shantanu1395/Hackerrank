#Bon Appetit
n,i=map(int,input().split(" "))
l=list(map(int,input().strip().split()))
charged=int(input())
print("Bon Appetit" if(charged-(sum(l)-l[i])/2)==0 else str(charged-(sum(l)-l[i])//2))