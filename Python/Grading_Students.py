#Grading Students
n=int(input())
for i in range (n):
    num=int(input())
    if((num+2)%5==0 and num>=38):
        num+=2
    if((num+1)%5==0 and num>=38):
        num+=1
    print(num)
