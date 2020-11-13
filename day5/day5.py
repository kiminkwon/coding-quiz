def day5(arr):
    leftSum = 0
    rightSum = sum(arr) 
    index = -1
    
    for idx,obj in enumerate(arr):
        
        rightSum -= obj
        if leftSum == rightSum:
            index = idx
            break
        leftSum += obj
    return index

print(day5([1,2,3,4,3,2,1]))
print(day5([20,10,-80,10,10,15,35]))
print(day5([20,10,-80,10,10,15,35,3]))
print(day5([20,10,15,25,-80,10,10,15,35]))