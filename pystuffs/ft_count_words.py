def ft_strlen(s):
    counting = 0
    for _ in s:
        counting += 1
    return counting

def firstTrim(s):
    j = 0
    while s[j] == " ":
        j += 1
        if s[j] != " ":
            return(j)

def finalTrim(s):
    j = ft_strlen(s) - 1
    while s[j] == " ":
        j -= 1
        if s[j] != " ":
            return(j)



def count_word(s: str):
    i = 1
    trimed = ""
    final = finalTrim(s) 
    firstCharIndex = firstTrim(s)

    while firstCharIndex < final:
        trimed += s[firstCharIndex]
        firstCharIndex += 1

    for c in trimed:
        if c == " ":
            i += 1
    return(i)

print(count_word("                hallo meine fruend, hello my german friend!                         "))
