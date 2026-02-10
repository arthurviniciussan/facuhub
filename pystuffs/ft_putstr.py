import time

def ft_putstr(string):
    for c in string:
        print(c, end='', flush=True)
        time.sleep(0.2)
    print()

def countdown():
    for i in range(3, 0, -1):
        print(i, end="...\n", flush=True)
        time.sleep(1)





countdown()
ft_putstr("Danke!")
