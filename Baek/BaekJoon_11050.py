a,b = map(int,input().split())
box_1 =list()
box_2 = list()
max_value=0
def find_value(a,tmp):
    for i in range(2,a):
        if a%i==0:
            tmp.append(i)
    return tmp
box_1 = find_value(a,box_1)
box_2 = find_value(b,box_2)
print(box_1,box_2)
for i in range(len(box_1)):
    if box_1[i] in box_2:
        max_value=box_1[i]
print(max_value)
