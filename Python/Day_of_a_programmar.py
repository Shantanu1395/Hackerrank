#Day of a programmar
y=int(input())
feb,pday=28,256
if(y==1918):
    print(str(pday - (31 * 5) - (30 * 2) - (29)+14) + ".09." + str(y))
else:
    if((y>=1919 and (y%400==0 or (y%4==0 and y%100!=0))) or (y<=1917 and (y%4==0))):
        feb=29
    print(str(pday - (31 * 5) - (30 * 2) - (feb)) + ".09." + str(y))
