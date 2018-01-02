#A Very Big Sum
a=0
n=int(input())
l=list(map(int,input().strip(" ").split(" ")))
for i in l:
    a+=i;
print(a)    