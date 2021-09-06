#최대공약수와 최소공배수
a,b = map(int,input().split())
box_1 =list()
box_2 = list()
max_value=0
def find_value(a,tmp):
    for i in range(1,a+1):
        if a%i==0:
            tmp.append(i)
    return tmp
box_1 = find_value(a,box_1)
box_2 = find_value(b,box_2)
for i in range(len(box_1)):
    if box_1[i] in box_2:
        max_value=box_1[i]
print(max_value)
min_value = min(a,b)
big = max(a,b)
for i in range(1,10001):
    if i*min_value %big==0:
        print(i*min_value)
        break