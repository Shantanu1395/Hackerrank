#plus minus
n = int(input().strip())
arr = [int(arr_temp) for arr_temp in input().strip().split(' ')]
p,neg,z=0,0,0
for num in arr:
    if(num<0):
        neg+=1
    if(num>0):
        p+=1
    if(num==0):
        z+=1
print(round(p/n,6))
print(round(neg/n,6))
print(round(z/n,6))