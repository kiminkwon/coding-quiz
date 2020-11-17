# arr1 = [4, 3, 2, 3, 4]
# s1 = 6

# arr2 = [10, 5, 2, 3, 7, 5]
# s2 = 10

def solution1(arr, s):
    inner = []
    for i in arr:
        for j in inner:
            if s - j == i:
                return [j ,i]
        inner.append(i)
    return None