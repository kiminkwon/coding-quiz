#중첩된 배열을 매개변수로 받아 각 하위 배열에서 정확히 하나의 요소를 가지는 고유 배열의 수를 반환하는 함수를 작성하세요.

#예시): solve([[1,2],[4],[5,6]])은 4개의 배열이 생성가능합니다.([1,4,5],[1,4,6],[2,4,5],[2,4,6]).

#중복은 카운트에 포함하지 않습니다.


a =[[1,2],[4],[5,6]] #-> 4
b= [[1,2],[4,4],[5,6,6]] #-> 4
c=[[1,2],[3,4],[5,6]] #-> 8
d=[[1,2,3],[3,4,6,6,7],[8,9,10,12,5,6]] #-> 72

def solve(arr):
    cnt =1
    #배열 반복
    for idx,objArr in enumerate(arr):
        #중복제거
        arr[idx] = list(set(objArr))
    for tempArr1 in arr:
        cnt = cnt*len(tempArr1)
    return cnt

print(solve(a))
print(solve(b))
print(solve(c))
print(solve(d))
            
        
        