def ft_strlen(s):
    counting = 0
    for _ in s:
        counting += 1
    return counting

def rev_str(s):
    rev = ""
    for c in s:
        rev = c + rev
    return(rev)

def ft_str_replace_i(s):
    res = ""
    for c in s:
        if (c >= 'a' <= 'z' or c >= 'A' <= 'Z' or c >= '0' <= '9'):
            res += 'i'
        else:
            res += c
    return (res)

word = input("Digite alguma coisa, meu caro... ")

print(ft_strlen(word))
print(ft_str_replace_i(word))
print(rev_str(word))


