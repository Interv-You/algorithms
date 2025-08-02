import {describe} from "@jest/globals";
import {SwapNumber} from "./swap-number";

describe('#SwapNumber', () => {
    it('should set A to 9 and B to 3', () => {
        const swapNumber = new SwapNumber(3, 9);
        swapNumber.swap();
        expect(swapNumber.getX()).toEqual(9);
        expect(swapNumber.getY()).toEqual(3);
    });

    it('should set A to 12 and B to 21', () => {
        const swapNumber = new SwapNumber(21, 12);
        swapNumber.swap();
        expect(swapNumber.getX()).toEqual(12);
        expect(swapNumber.getY()).toEqual(21);
    });

    it('should set A to 34 and B to 9', () => {
        const swapNumber = new SwapNumber(9, 34);
        swapNumber.swap();
        expect(swapNumber.getX()).toEqual(34);
        expect(swapNumber.getY()).toEqual(9);
    });
})