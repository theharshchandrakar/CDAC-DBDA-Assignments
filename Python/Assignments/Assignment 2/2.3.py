# Q.3.  Write a Python function that takes a list of words and returns the length of the longest one

def longest(w1,w2,w3):
    lens = [len(w1),len(w2),len(w3)]
    return max(lens)


word1 = input("Enter a word: ")
word2 = input("Enter another word: ")
word3 = input("Enter another word: ")

print(f"Max length is : {longest(word1,word2,word3)}")