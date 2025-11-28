duplist = input("Enter words separated by Space (include duplicated) :\n").split()
print("List with Duplicates: ",duplist)

nodup = set(duplist)
print("List without Duplicates: ",nodup)