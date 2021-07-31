import sys
test = int(input(""))

def prime_num():
    flag = [True]*10000
    flag[1]= False
    prime= list()
    for i in range(2,101):
        if flag[i]:
            for k in range (2*i,10000,i):
                flag[k]=False
    for i in range (2,10000):
        if flag[i]:
            prime.append(i)
    return prime

def gold(prime,num):
    for i in range(num//2, num,1):
        if i in prime:
            if num-i in prime:
                return print(num-i,i)

box = prime_num()
for i in range(0,test):
    size = int(input(""))
    gold(box,size)