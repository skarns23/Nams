import turtle
import time
t= turtle.Turtle()
t.shape('classic')
t.pensize(3)
t.pencolor('red')
t.goto(0,0)
for i in range(8):
    t.forward(10)
    time.sleep(1)