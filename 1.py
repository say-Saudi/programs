class Solution:
    def twoSum(self, nums: list[int], target: int) -> list[int]:
        '''OPTIMAL'''
        mapper = {}
        for index, num1 in enumerate(nums): # O(n)
            num2 = target - num1
            if num2 in mapper: # O(1)
                return [mapper[num2] , index]
            mapper[num1] = index

        return [None]
        '''
        # BRUTE FORCE
        # Move through the list and mark index and value of each number
        for index, num in enumerate(nums): # O(n)

            # for each picked as first target parameter, there will be a temp list excluding that parameter
            temp = [tnum for tindex, tnum in enumerate(nums) if tindex != index] # O(n-1) = O(n)

            if target-num in temp: # O(n-1) = O(n)
                return [index, temp.index(target-num)+1] # the second paramter resulting to target will always be to the right side of the first param, since we are sequencing fro mleft to right. This +1
        return [None]
        '''


if __name__ == "__main__":
    sol = Solution()
    print(sol.twoSum([2,7,11,15], 26))

