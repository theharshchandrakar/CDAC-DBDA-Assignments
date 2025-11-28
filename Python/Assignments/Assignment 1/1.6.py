#gcd and lcm

n1 = int(input("Enter first number :"))
n2 = int(input("Enter second number :"))

big = max(n1,n2)
small = min(n1,n2)
hcf = 0
#hcf
for i in range(small,0,-1):
    if big%i ==0 and small%i == 0:
        hcf = i
        print("HCF: ",hcf)
        break
#lcm
print(f"Lcm : {n1*n2/hcf}")