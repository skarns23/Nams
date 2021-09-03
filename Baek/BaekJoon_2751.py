#백준 2751번 정렬문제, sort함수는 Time sort를 사용함
import sys
size = int(input())
box = list()
for i in range(size):
    box.append(int(sys.stdin.readline()))
box = sorted(box)
for i in box:
    sys.stdout.write(str(i)+'\n')