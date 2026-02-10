def ft_strlen(s: str):
    return len(s)

def rev_string(s: str):
    return s[::-1]

def replace_i(s: str):
   return ''.join('i' if c.isalnum() else c for c in s)

def complex_i(s: str):
    result = []
    for c in s:
        if c.isalnum():
            result.append('i')
        else:
            result.append(c)
    return "".join(result)

def wolrdCount(s: str):
    return len(s.split())

word = input("Digite algo... ")

print(ft_strlen(word))
print(rev_string(word))
print(complex_i(word))
print(wolrdCount(word))
