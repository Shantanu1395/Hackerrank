#Time Conversions
time=input()
h=int(time[0:2])
m=(time[3:5])
s=(time[6:8])
sec=time[8:10]
if(sec=="PM" and h!=12):
    h+=12
if(sec=="AM" and h==12):
    h = str(h)
    h="00"
if(int(h)<10 and int(h)!=0):
    h=str(h)
    h='0'+h
print(str(h)+":"+m+":"+s)