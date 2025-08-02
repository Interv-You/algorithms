
package com.lia.interview.intermediates.addtwonumbers;

import com.lia.interview.utils.ListNode;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class AddTwoNumbersTest {

    @Nested
    @DisplayName("342 + 465 = 807")
    class BasicAddition {
        @Test
        @DisplayName("should return [7,0,8]")
        void shouldReturnCorrectSum() {
            ListNode l1 = createList(new int[]{2, 4, 3});
            ListNode l2 = createList(new int[]{5, 6, 4});
            ListNode result = AddTwoNumbers.addTwoNumbers(l1, l2);
            assertArrayEquals(new int[]{7, 0, 8}, listToArray(result));
        }
    }

    @Nested
    @DisplayName("0 + 0 = 0")
    class ZeroAddition {
        @Test
        @DisplayName("should return [0]")
        void shouldReturnZero() {
            ListNode l1 = createList(new int[]{0});
            ListNode l2 = createList(new int[]{0});
            ListNode result = AddTwoNumbers.addTwoNumbers(l1, l2);
            assertArrayEquals(new int[]{0}, listToArray(result));
        }
    }

    @Nested
    @DisplayName("9999 + 999 = 10998")
    class LargeNumberAddition {
        @Test
        @DisplayName("should return [8,9,9,0,1]")
        void shouldHandleCarryOver() {
            ListNode l1 = createList(new int[]{9, 9, 9, 9});
            ListNode l2 = createList(new int[]{9, 9, 9});
            ListNode result = AddTwoNumbers.addTwoNumbers(l1, l2);
            assertArrayEquals(new int[]{8, 9, 9, 0, 1}, listToArray(result));
        }
    }

    @Nested
    @DisplayName("Different length lists: 123 + 456789 = 456912")
    class DifferentLengthAddition {
        @Test
        @DisplayName("should return [2,1,9,6,5,4]")
        void shouldHandleDifferentLengths() {
            ListNode l1 = createList(new int[]{3, 2, 1});
            ListNode l2 = createList(new int[]{9, 8, 7, 6, 5, 4});
            ListNode result = AddTwoNumbers.addTwoNumbers(l1, l2);
            assertArrayEquals(new int[]{2, 1, 9, 6, 5, 4}, listToArray(result));
        }
    }

    @Nested
    @DisplayName("Single digits with carry: 5 + 5 = 10")
    class SingleDigitWithCarry {
        @Test
        @DisplayName("should return [0,1]")
        void shouldHandleSingleDigitCarry() {
            ListNode l1 = createList(new int[]{5});
            ListNode l2 = createList(new int[]{5});
            ListNode result = AddTwoNumbers.addTwoNumbers(l1, l2);
            assertArrayEquals(new int[]{0, 1}, listToArray(result));
        }
    }

    @Nested
    @DisplayName("Long numbers with multiple carries")
    class LongNumberWithCarries {
        @Test
        @DisplayName("should return [0,0,0,1]")
        void shouldHandleMultipleCarries() {
            ListNode l1 = createList(new int[]{9, 9, 9});
            ListNode l2 = createList(new int[]{1});
            ListNode result = AddTwoNumbers.addTwoNumbers(l1, l2);
            assertArrayEquals(new int[]{0, 0, 0, 1}, listToArray(result));
        }
    }

    // Méthode utilitaire pour créer une liste chaînée à partir d'un tableau
    private ListNode createList(int[] arr) {
        if (arr == null || arr.length == 0) return null;
        ListNode head = new ListNode();
        head.setVal(arr[0]);
        ListNode current = head;
        for (int i = 1; i < arr.length; i++) {
            ListNode node = new ListNode();
            node.setVal(arr[i]);
            current.setNext(node);
            current = node;
        }
        return head;
    }

    // Méthode utilitaire pour convertir une liste chaînée en tableau
    private int[] listToArray(ListNode node) {
        if (node == null) return new int[0];

        // Compter la taille de la liste
        int size = 0;
        ListNode current = node;
        while (current != null) {
            size++;
            current = current.getNext();
        }

        // Créer et remplir le tableau
        int[] result = new int[size];
        current = node;
        for (int i = 0; i < size; i++) {
            result[i] = current.getVal();
            current = current.getNext();
        }
        return result;
    }
}