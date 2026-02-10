def ft_power(nb, power):
    i = 1
    for _ in range(power):
        i *= nb
    return (i)

print(ft_power(2, 5))