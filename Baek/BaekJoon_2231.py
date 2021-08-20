test= int(input())
tmp = list()

for i in range(0,test):
    box = i
    k = 0
    for j in range(len(str(i))):
        k = k+box%10
        box = box//10
    if k+i ==test:
        print(i)
        exit(0)
print('0')







