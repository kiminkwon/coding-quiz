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

from functools import reduce
def solution3(arr):
    return reduce(lambda x,y : x * x * y, list(map(lambda x: x[0],sorted(Counter(arr).items(), key=lambda x: x[1])[:2])))