def ft_strlen(s):
    counting = 0
    for _ in s:
        counting += 1
    return counting


print(ft_strlen("Hello, Wolrd!"))