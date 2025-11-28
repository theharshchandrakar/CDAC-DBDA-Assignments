

def overlapping(l1,l2):
    for i in l1:
        if i in l2:
            return True
    return False

list1 = list(input("Enter elements of list-1 separated by space: \n").split())
list2 = list(input("Enter elements of list-2 separated by space: \n").split())
print("Element(s) common in list: ",overlapping(list1,list2))