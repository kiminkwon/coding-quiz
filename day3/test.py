import unittest
import Solution
import datetime

test_case = [
    ([[1,2],[4],[5,6]],4),
    ([[1,2],[4,4],[5,6,6]],4),
    ([[1,2],[3,4],[5,6]],8),
    ([[1,2,3],[3,4,6,6,7],[8,9,10,12,5,6]],72),
    ([[3,4],[6,6,6],[7,7,7]],2),
    ([[1,2,3],[4,5,6],[7,8,9]],27),
            ]


class Test(unittest.TestCase):
    def test1(self):
        print("\nSolution #1 Unittest")
        for idx, case in enumerate(test_case):
            start_time = datetime.datetime.now()
            self.assertAlmostEqual(Solution.solution1(case[0]), case[1])
            end_time = datetime.datetime.now()
            print(f"TestCase #{idx} : {end_time - start_time}")