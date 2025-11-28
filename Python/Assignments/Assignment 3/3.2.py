
def find_longest_word(list):
    max_len = ''
    for i in words:
        if len(i) > len(max_len):
            max_len = i
    return max_len

words = list(input("Enter words separated by space: \n").split())
print("Longest word is: ",find_longest_word(words))