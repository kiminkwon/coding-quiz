def find_xxy(arr) :
    fixed_list = list(set(arr))
    list_arr=[arr.count(i) for i in fixed_list]
    x_index = list_arr.index(1)
    y_index = list_arr.index(2)
    return fixed_list[x_index]*fixed_list[x_index]*fixed_list[y_index]
    # print(list(zip(fixed_list,list_arr)),x_index,y_index)

if __name__ == '__main__':
    arr1 = [1, 1, 1, 2, 2, 3]
    arr2 = [6, 5, 4, 100, 6, 5, 4, 100, 6, 5, 4, 200]
    print(find_xxy(arr2))