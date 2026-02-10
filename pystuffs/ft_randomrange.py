import random
def randomRange(min: int, max: int):
    if min > max:
        min, max = max, min 
    
    i = random.randint(min, max)
    return(i)

print(randomRange(4, 10))
