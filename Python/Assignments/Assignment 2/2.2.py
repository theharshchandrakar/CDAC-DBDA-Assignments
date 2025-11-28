#palindrome

inp = str(input("Enter a sentence to check palindrome"))
clean = ""
is_palindrome = False

#onlyalphabets
for char in inp.lower():
    if char.isalpha():
        clean += char
print(clean)

j = 0
for i in range(len(clean)-1,0,-1):
    if clean[i] == clean[j]:
        is_palindrome=True
        j+=1
    else:
        is_palindrome=False
        break
print("Its a Palindrome" if is_palindrome==True else "Its not a Palindrome")