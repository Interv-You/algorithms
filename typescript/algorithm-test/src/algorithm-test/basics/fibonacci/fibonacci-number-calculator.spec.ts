import {describe} from "@jest/globals";
import {getFibonacciNumber} from "./fibonacci-number-calculator";

describe('#FibonacciCalculator', () => {
    describe('Position 0', () => {
        it('should return 0', () => {
            expect(getFibonacciNumber(0)).toEqual(0);
        });
    })

    describe('Position 1', () => {
        it('should return 1', () => {
            expect(getFibonacciNumber(1)).toEqual(1);
        });
    })

    describe('Position 2', () => {
        it('should return 1', () => {
            expect(getFibonacciNumber(2)).toEqual(1);
        });
    })

    describe('Position 6', () => {
        it('should return 8', () => {
            expect(getFibonacciNumber(6)).toEqual(8);
        });
    })

    describe('Position 10', () => {
        it('should return 55', () => {
            expect(getFibonacciNumber(10)).toEqual(55);
        });
    })

    describe('Position 45', () => {
        it('should return 1134903170', () => {
            expect(getFibonacciNumber(45)).toEqual(1134903170);
        });
    })
})