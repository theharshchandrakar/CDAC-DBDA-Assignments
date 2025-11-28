
cipher = {'a': 'd', 'b': 'e', 'c': 'f', 'd': 'g', 'e': 'h', 'f': 'i', 'g': 'j', 'h': 'k', 'i': 'l', 'j': 'm', 'k': 'n',
          'l': 'o', 'm': 'p', 'n': 'q', 'o': 'r', 'p': 's', 'q': 't', 'r': 'u', 's': 'v', 't': 'w', 'u': 'x', 'v': 'y',
          'w': 'z', 'x': 'a', 'y': 'b', 'z': 'c'}
encrypted = str(input("Enter encrypted word: "))
decipher = {value: key for key, value in cipher.items()}
decrypted = ""

for i in encrypted.lower():
    decrypted += decipher[i]
print("decrypted word: ",decrypted)