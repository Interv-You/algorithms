import {describe} from "@jest/globals";
import {convert} from "./roman-converter";

describe('#RomanConverter', () => {
    describe('Basic numbers (1-10)', () => {
        it('should convert 1 to I', () => {
            expect(convert(1)).toEqual('I');
        });

        it('should convert 3 to III', () => {
            expect(convert(3)).toEqual('III');
        });

        it('should convert 4 to IV', () => {
            expect(convert(4)).toEqual('IV');
        });

        it('should convert 5 to V', () => {
            expect(convert(5)).toEqual('V');
        });

        it('should convert 9 to IX', () => {
            expect(convert(9)).toEqual('IX');
        });
    });

    describe('Numbers with tens (10-99)', () => {
        it('should convert 10 to X', () => {
            expect(convert(10)).toEqual('X');
        });

        it('should convert 40 to XL', () => {
            expect(convert(40)).toEqual('XL');
        });

        it('should convert 50 to L', () => {
            expect(convert(50)).toEqual('L');
        });

        it('should convert 90 to XC', () => {
            expect(convert(90)).toEqual('XC');
        });

        it('should convert 58 to LVIII', () => {
            expect(convert(58)).toEqual('LVIII');
        });
    });

    describe('Numbers with hundreds (100-999)', () => {
        it('should convert 100 to C', () => {
            expect(convert(100)).toEqual('C');
        });

        it('should convert 400 to CD', () => {
            expect(convert(400)).toEqual('CD');
        });

        it('should convert 500 to D', () => {
            expect(convert(500)).toEqual('D');
        });

        it('should convert 900 to CM', () => {
            expect(convert(900)).toEqual('CM');
        });

        it('should convert 444 to CDXLIV', () => {
            expect(convert(444)).toEqual('CDXLIV');
        });
    });

    describe('Numbers with thousands (1000-3999)', () => {
        it('should convert 1000 to M', () => {
            expect(convert(1000)).toEqual('M');
        });

        it('should convert 1994 to MCMXCIV', () => {
            expect(convert(1994)).toEqual('MCMXCIV');
        });

        it('should convert 2023 to MMXXIII', () => {
            expect(convert(2023)).toEqual('MMXXIII');
        });

        it('should convert 3999 to MMMCMXCIX', () => {
            expect(convert(3999)).toEqual('MMMCMXCIX');
        });
    });

    describe('Complex combinations', () => {
        it('should convert 1449 to MCDXLIX', () => {
            expect(convert(1449)).toEqual('MCDXLIX');
        });

        it('should convert 2999 to MMCMXCIX', () => {
            expect(convert(2999)).toEqual('MMCMXCIX');
        });

        it('should convert 3333 to MMMCCCXXXIII', () => {
            expect(convert(3333)).toEqual('MMMCCCXXXIII');
        });
    });
});