import numpy as np

numbers = [1,2,5,10,11,14,17,20]
ans = []
hg = numbers[len(numbers)-1]
print(hg)

for i in range(1,hg):
    if i not in numbers:
        ans.append(i)


print(ans)

a = [1,8,27,64]
flag = 0

for i in range(len(a)):
    for j in range(i+1,len(a)):
        if a[j]<a[i] :
            flag = 1
            print("FALSE")
            break

if(flag==0):
    print("TRUE")
    

odd_no = np.array([])

for i in range(100,200):
    if i%2!=0:
        odd_no = np.append(odd_no,[i])
        
print(odd_no)