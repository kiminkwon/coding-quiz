def solution1(big_array):
    count = 1
    print(big_array)
    while big_array:
        count *= len(set(big_array.pop()))
    return count

import numpy as np
def solution2(big_array):
    return np.prod(list(map(len,map(set,big_array))))