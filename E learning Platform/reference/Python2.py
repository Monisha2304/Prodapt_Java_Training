a=int(input())
l=list(map(int,input().split()))
for i in l:
    if i==2:
        print(i,end=" ")
    else:
        u=0
        for j in range(2,(i//2)+1):
            if i%j==0:
                u=1 
                break
        if u==0:
            print(i,end=" ")
print()