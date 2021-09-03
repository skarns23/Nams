#백준 2750번 정렬문제, sort함수는 Time sort를 사용함
size = int(input())
box = list()
for i in range(size):
    box.append(int(input()))

box.sort()

for i in box:
    print(i)