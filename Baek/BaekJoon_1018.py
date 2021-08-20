x,y = map(int,input().split())
result = list()
test = list()
for i in range(x):
    test.append((input()))

for i in range(0,x-7):   #8*8이므로 x-7값까지만 검사하면됨
    for j in range(0,y-7):
       color_w= 0
       color_b=0
       for k in range(i,i+8): # 현재위치로부터 8 * 8
           for z in range(j,j+8):
               if (k+z)%2==0:  #현재 위치값 짝수면
                   if test[k][z]!='W': #시작 'W'일경우에는 W여야함
                       color_w=color_w+1
                   if test[k][z]!='B': # 시작 B일경우에는 B값
                       color_b=color_b+1
               else:
                   if test[k][z]!='B':
                       color_w=color_w+1
                   if test[k][z]!='W':
                       color_b=color_b+1
       result.append(color_w)
       result.append(color_b)

print(min(result))
