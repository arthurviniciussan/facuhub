def countWords(s):
    count = 0
    in_word = False

    for c in s:
        if c != " " and not in_word:
            count += 1
            in_word = True
        elif c == ' ':
            in_word = False
    return count

print(countWords("    Hello!  df    acs    sac   sa              "))

