def solution1(_array):
    for idx in range(len(_array)):
        if sum(_array[:idx]) == sum(_array[idx+1:]):
            return idx
    return -1