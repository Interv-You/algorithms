import {describe} from "@jest/globals";
import {isPalindrome} from "./palindrome-checker";

describe('#PalindromeChecker', () => {
    describe('Empty string', () => {
        it('should return true', () => {
            expect(isPalindrome('')).toEqual(true);
        });
    })

    describe('Simple palindrome: radar', () => {
        it('should return true', () => {
            expect(isPalindrome('radar')).toEqual(true);
        });
    })

    describe('Palindrome with spaces: never odd or even', () => {
        it('should return true', () => {
            expect(isPalindrome('never odd or even')).toEqual(true);
        });
    })

    describe('Palindrome with mixed case: Race Car', () => {
        it('should return true', () => {
            expect(isPalindrome('Race Car')).toEqual(true);
        });
    })

    describe('Long palindrome with spaces: do geese see god', () => {
        it('should return true', () => {
            expect(isPalindrome('do geese see god')).toEqual(true);
        });
    })

    describe('Non palindrome: hello world', () => {
        it('should return false', () => {
            expect(isPalindrome('hello world')).toEqual(false);
        });
    })

    describe('Non palindrome with spaces: race a car', () => {
        it('should return false', () => {
            expect(isPalindrome('race a car')).toEqual(false);
        });
    })

    describe('Non palindrome similar words: radar radarr', () => {
        it('should return false', () => {
            expect(isPalindrome('radar radarr')).toEqual(false);
        });
    })
})