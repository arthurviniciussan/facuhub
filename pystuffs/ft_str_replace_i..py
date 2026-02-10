def ft_str_replace_i(s):
    res = ""
    for c in s:
        if (c >= 'a' <= 'z' or c >= 'A' <= 'Z' or c >= '0' <= '9'):
            res += 'i'
        else:
            res += c
    return (res)

print(ft_str_replace_i("Ich leibe 42sp!"))