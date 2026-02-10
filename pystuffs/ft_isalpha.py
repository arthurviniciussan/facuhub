def ft_is_alpha(s):
    sNoSpace = s.replace(" ", "")
    for c in sNoSpace:
        if not(c >= 'a' <= 'z' or c >= 'A' <= 'Z'):
            return False
    return True

print(ft_is_alpha("Ola meu amigo"))
