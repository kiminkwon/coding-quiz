import unittest
import Solution
import datetime
from copy import deepcopy

test_case = [
        [(2000, 8000, 1000, 1.5), [6, 766]],
        [(12000, 8000, 1000, 1.5), [0,4000]]
            ]


class Test(unittest.TestCase):
    def test1(self):
        print("\nSolution #1 Unittest")
        copy = deepcopy(test_case) 
        for idx, case in enumerate(copy):
            start_time = datetime.datetime.now()
            self.assertEqual(Solution.nbMonths(case[0][0],case[0][1],case[0][2],case[0][3]), case[1])
            end_time = datetime.datetime.now()
            print(f"TestCase #{idx} : {end_time - start_time}")

if __name__ == '__main__':
    unittest.main()