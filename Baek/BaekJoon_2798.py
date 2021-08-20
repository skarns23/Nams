num,top = map(int,input().split())
box = list(map(int,input().split()))
result = 0
for i in range(0,len(box)):
    for j in range(i+1,len(box)):
        for k in range(j+1,len(box)):
            tmp = box[i]+box[j]+box[k]
            if tmp>top:
                continue
            else:
                if tmp>result:
                    result=tmp

print(result)