
# 중첩된 배열을 매개변수로 받아 각 하위 배열에서 정확히 하나의 요소를 가지는 고유 배열의 수를 반환하는 함수를 작성하세요.
# 예시): solve([[1,2],[4],[5,6]])은 4개의 배열이 생성가능합니다.([1,4,5],[1,4,6],[2,4,5],[2,4,6]).
# 중복은 카운트에 포함하지 않습니다.
# [[1,2],[4],[5,6]]) -> 4
# [[1,2],[4,4],[5,6,6]] -> 4
# [[1,2],[3,4],[5,6]] -> 8
# [[1,2,3],[3,4,6,6,7],[8,9,10,12,5,6]] -> 72

from itertools import product
def count_arr(arr):
    # 요소마다 중복제거 : 집합으로 변환 -> 리스트로 변환
    new_arr = []
    if len(arr_lay) > 0:
        for i in arr_lay:
            new_arr.append(list(set(i)))
        result = []
        for i in product(*new_arr):
            result.append(i)
        print("결과리스트 : ", result)
        print("갯수: ", len(result))
        return

    else :
        print("배열이 비었습니다.")
        return

if __name__ == '__main__':
    arr_lay = [[1, 2], [4], [5, 6]]
    # arr_lay = [[1, 2, 3], [3, 4, 6, 6, 7], [8, 9, 10, 12, 5, 6]]
    count_arr(arr_lay)
