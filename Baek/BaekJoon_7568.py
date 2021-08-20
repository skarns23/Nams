test = int(input())
weight = list()
high = list()
count = list()
for i in range(0,test):
    a,b = map(int,input().split())
    weight.append(a)
    high.append(b)


for i in range(0,test):
    box = 1
    for j in range(0,test):
        if weight[i]<weight[j] and high[i]<high[j]:
            box=box+1

    count.append(box)

for i in range(0,test):
    print(count[i],end=' ')