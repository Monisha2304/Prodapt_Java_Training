a=int(input())
l=[]
for i in  range(a):
    l.append(list(map(int,input().split())))
s=0
s+=sum(l[0])
s+=sum(l[-1])
for i in range(1,a-1):
    s+=l[i][0]
    s+=l[i][-1]
print(s)