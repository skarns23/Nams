x, y, w, h = map(int,input("").split())

dif_x = (x,w-x)
dif_y = (y,h-y)
short_x = min(dif_x)
short_y = min(dif_y)
print (min(short_x,short_y))
