#Kangaroo
x1,v1,x2,v2=map(int,input().split(" "))
vrel=(v2-v1)/(x2-x1)
print("YES" if((v1>v2 and (x2-x1)%(v2-v1))==0 and (v1>v2 and (x2-x1)/(v1-v2))>0) else "NO")
