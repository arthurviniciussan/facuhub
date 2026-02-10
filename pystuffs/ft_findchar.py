def ft_strlen(s):
    counting = 0
    for _ in s:
        counting += 1
    return counting

def findChar(s, char):
    i = 0
    len = ft_strlen(s)
    while i < len:
        if s[i] == char:
            return (i)
        i += 1
    return (-1)

print(findChar("autobots", "o"))