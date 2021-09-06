import math
a,b = map(int,input().split())
top = 1
bot = 1
result_1 = math.factorial(a-b)
result_2 = math.factorial(b)
print(math.factorial(a)//(result_1*result_2))