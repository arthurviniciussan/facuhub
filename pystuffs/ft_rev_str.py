def ft_strlen(s):
    counting = 0
    for _ in s:
        counting += 1
    return counting

def rever(s):
    rev = ""
    i = ft_strlen(s) - 1
    while i >= 0:
        rev += s[i]
        i -= 1
    return (rev)

def rev_str(s):
    rev = ""
    for c in s:
        rev = c + rev
    return(rev)

print(rever("Hello!123"))

