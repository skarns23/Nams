while(1):
    a,b,c =map(int,input().split())
    if(a==b==c==0):
        break
    d = [a,b,c]
    max_num = max(d)
    d.remove(max_num)
    if(max_num**2==(d[0]**2+d[1]**2)):
        print ("right")
    else:
        print("wrong")