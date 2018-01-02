#Between Two Sets
from functools import reduce
def hcf(a,b):
    if(b!=0):
        return hcf(b,a%b)
    else:
        return a;

def lcm(a,b):
    return a*b//hcf(a,b)
count=0
n,m=map(int,input().split(" "))
lcmlist=reduce(lcm,map(int,input().split(" ")))
gcdlist=reduce(hcf,map(int,input().split(" ")))
for i in range(lcmlist,gcdlist+1,lcmlist):
    if(gcdlist%i==0):
        count+=1
print(count)
#print(sum(1 for i in range(lcmlist,gcdlist+1,lcmlist) if((gcdlist%i==0))))
