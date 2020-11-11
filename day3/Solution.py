def solution1(big_array):
    count = 1
    while big_array:
        count *= len(set(big_array.pop()))
    return count

