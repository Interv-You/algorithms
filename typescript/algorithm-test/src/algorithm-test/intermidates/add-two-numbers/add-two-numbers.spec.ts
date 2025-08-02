import {describe} from "@jest/globals";
import {addTwoNumbers} from "./add-two-numbers";
import {ListNode} from "../../utils/list-node";

describe('#AddTwoNumbers', () => {
    describe('342 + 465 = 807', () => {
        it('should return [7,0,8]', () => {
            const l1 = createList([2,4,3]);
            const l2 = createList([5,6,4]);
            const result = addTwoNumbers(l1, l2);
            expect(listToArray(result)).toEqual([7,0,8]);
        });
    })

    describe('0 + 0 = 0', () => {
        it('should return [0]', () => {
            const l1 = createList([0]);
            const l2 = createList([0]);
            const result = addTwoNumbers(l1, l2);
            expect(listToArray(result)).toEqual([0]);
        });
    })

    describe('9999 + 999 = 10998', () => {
        it('should return [8,9,9,0,1]', () => {
            const l1 = createList([9,9,9,9]);
            const l2 = createList([9,9,9]);
            const result = addTwoNumbers(l1, l2);
            expect(listToArray(result)).toEqual([8,9,9,0,1]);
        });
    })

    describe('Different length lists: 123 + 456789 = 456912', () => {
        it('should return [2,1,9,6,5,4]', () => {
            const l1 = createList([3,2,1]);
            const l2 = createList([9,8,7,6,5,4]);
            const result = addTwoNumbers(l1, l2);
            expect(listToArray(result)).toEqual([2,1,9,6,5,4]);
        });
    })

    describe('Single digits with carry: 5 + 5 = 10', () => {
        it('should return [0,1]', () => {
            const l1 = createList([5]);
            const l2 = createList([5]);
            const result = addTwoNumbers(l1, l2);
            expect(listToArray(result)).toEqual([0,1]);
        });
    })

    describe('Long numbers with multiple carries', () => {
        it('should return [0,0,0,1]', () => {
            const l1 = createList([9,9,9]);
            const l2 = createList([1]);
            const result = addTwoNumbers(l1, l2);
            expect(listToArray(result)).toEqual([0,0,0,1]);
        });
    })
});

// Helper function to create linked list from array
function createList(arr: number[]): ListNode | null {
    if (arr.length === 0) return null;
    const head = new ListNode(arr[0]);
    let current = head;
    for (let i = 1; i < arr.length; i++) {
        current.next = new ListNode(arr[i]);
        current = current.next;
    }
    return head;
}

// Helper function to convert linked list to array
function listToArray(node: ListNode | null): number[] {
    const result = [];
    let current = node;
    while (current) {
        result.push(current.val);
        current = current.next;
    }
    return result;
}