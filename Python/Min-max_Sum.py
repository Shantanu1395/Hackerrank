#Min-max Sum
arr=list(map(int,input().strip().split()))
min=min(arr)
max=max(arr)
sum=0
for i in arr:
    sum+=i
print(sum-max,sum-min)