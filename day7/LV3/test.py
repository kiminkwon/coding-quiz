import unittest
import Solution
import datetime
from copy import deepcopy

test_case = [
    ([11, 3, 7, 5], 10,[3,7]),
    ([4, 3, 2, 3, 4],6,[4,2]),
    ([0, 0, -2, 3],2,None),
    ([10, 5, 2, 3, 7, 5],10,[3,7])
            ]


class Test(unittest.TestCase):
    def test1(self):
        print("\nSolution #1 Unittest")
        for idx, case in enumerate(test_case):
            start_time = datetime.datetime.now()
            self.assertEqual(Solution.solution1(case[0],case[1]), case[2])
            end_time = datetime.datetime.now()
            print(f"TestCase #{idx} : {end_time - start_time}")

if __name__ == '__main__':
    unittest.main()