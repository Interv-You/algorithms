import {expect, describe, it} from '@jest/globals';
import {twoSum} from "./two-sum";

describe('#TwoSum', () => {
    it('should return [0, 1]', () => {
        const nums = [3, 6, 5, 15];
        const target = 9;
        const output = twoSum(nums, target);
        expect(output.sort()).toEqual([0,1].sort())
    });

    it('should return [3, 6]', () => {
        const nums = [3, 6, 5, 15, 26, 7, 19, 34];
        const target = 34;
        const output = twoSum(nums, target);
        expect(output.sort()).toEqual([3,6].sort())
    });

    it('should return [11, 19]', () => {
        const nums = [3, 1, 20, 21, 2, 6, 5, 4, 15, 13, 14, 26, 7, 19, 6, 9, 17, 18, 23, 57, 38, 12, 34];
        const target = 83;
        const output = twoSum(nums, target);
        expect(output.sort()).toEqual([11,19].sort())
    });
})