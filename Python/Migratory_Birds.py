#Migratory Birds
n=int(input())
l=list(map(int,input().strip().split(" ")))
dic={}
for i in l:
    if(i in dic.keys()):
        dic[i]=dic[i]+1
    else:
        dic[i]=1

rev_dic=sorted(dic,key=dic.get,reverse=True)
print(rev_dic[0])