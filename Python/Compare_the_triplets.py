#Compare the triplets
a,b=0,0
l1=list(map(int,input().strip(" ").split(" ")))
l2=list(map(int,input().strip(" ").split(" ")))
for i in range(0,3):
    if l1[i]>l2[i]:
        a+=1
    if l1[i]<l2[i]:
        b+=1
print(a,b)        
