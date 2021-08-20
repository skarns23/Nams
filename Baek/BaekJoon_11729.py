def hanoi(num,start,mid,end):
    if num==1:
        print('{} {}'.format(start,end))
    else:
        hanoi(num-1,start,end,mid)
        print('{} {}'.format(start,end))
        hanoi(num-1,mid,start,end)

test = int(input())
print(2**test-1)
hanoi(test,1,2,3)