num = str(input("Enter a number :"))

#no of digits
print(f"Digits: {len(num)}")

#sum
s=0
for i in num:
    s += int(i)
print(f"Sum: {s}")

#Odd-Even Digits
even = 0
odd = 0
for i in num:
    if int(i)%2 == 0:
        even+=1
    else:
        odd+=1
print(f"Even Digits: {even} \n Odd Digits: {odd}")


