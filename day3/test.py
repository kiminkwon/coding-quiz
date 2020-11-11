import unittest
import Solution
import datetime
from copy import deepcopy

test_case = [
    ([[1,2],[4],[5,6]],4),
    ([[1,2],[4,4],[5,6,6]],4),
    ([[1,2],[3,4],[5,6]],8),
    ([[1,2,3],[3,4,6,6,7],[8,9,10,12,5,6]],72),
    ([[3,4],[6,6,6],[7,7,7]],2),
    ([[1,2,3],[4,5,6],[7,8,9]],27),
    ([[1,1,1],[1,1,1],[1,1,1]],1)
            ]


class Test(unittest.TestCase):
    def test1(self):
        print("\nSolution #1 Unittest")
        copy = deepcopy(test_case) ## Solution #1 has memory deletion
        for idx, case in enumerate(copy):
            start_time = datetime.datetime.now()
            self.assertEqual(Solution.solution1(case[0]), case[1])
            end_time = datetime.datetime.now()
            print(f"TestCase #{idx} : {end_time - start_time}")

    def test2(self):
        print("\nSolution #2 Unittest")
        for idx, case in enumerate(test_case):
            start_time = datetime.datetime.now()
            self.assertEqual(Solution.solution2(case[0]), case[1])
            end_time = datetime.datetime.now()
            print(f"TestCase #{idx} : {end_time - start_time}")