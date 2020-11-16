test1 = [1, 1, 1, 2, 2, 3]
test2 = [6, 5, 4, 100, 6, 5, 4, 100, 6, 5, 4, 200]

def solution1(arr):
    x = None
    y = None

    while arr:
        num = arr.pop()
        if arr.count(num) == 0: 
            x = num
        elif arr.count(num) == 1:
            y = num
        if x and y:
            return (x ** 2) * y
    return -1

from collections import Counter
def solution2(arr):
    x = None
    y = None

    for num, count in Counter(arr).items():
        if count == 1:
            x = num
        elif count == 2:
            y = num
        if x and y:
            return x * x * y
    return -1