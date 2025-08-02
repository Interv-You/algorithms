import {describe} from "@jest/globals";
import {areAnagram} from "./anagram-checker";

describe('#AnagramChecker', () => {
    describe('Mary and Army', () => {
        it('should return true', () => {
            expect(areAnagram('Mary', 'Army')).toEqual(true);
        });
    })
    describe('Azerty and yzaret', () => {
        it('should return true', () => {
            expect(areAnagram('Azerty', 'yzaret')).toEqual(true);
        });
    })
    describe('economic and ComicOne', () => {
        it('should return true', () => {
            expect(areAnagram('economic', 'ComicOne')).toEqual(true);
        });
    })

    describe('Marym and Army', () => {
        it('should return false', () => {
            expect(areAnagram('Marym', 'Army')).toEqual(false);
        });
    })

    describe('Azerty and yzareta', () => {
        it('should return false', () => {
            expect(areAnagram('Azerty', 'yzareta')).toEqual(false);
        });
    })

    describe('zfhzqsdc and qsldh', () => {
        it('should return false', () => {
            expect(areAnagram('zfhzqsdc', 'qsldh')).toEqual(false);
        });
    })
})