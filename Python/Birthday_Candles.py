#Birthday Candles
n=int(input())
l=list(map(int,input().strip().split(" ")))
max=max(l)
count=0
for i in l:
    if(i==max):
        count+=1
print(count)