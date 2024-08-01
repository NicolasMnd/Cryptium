package proposition;

/**
 * When a^t == 1 mod m
 * And e is the order of a, then e must be a divider of t.
 *
 * Example: a = 15; e = 2; m = 16
 * 15 has order 2 in group mod 16.
 *
 * Any t: 15^t == 1 mod 16 must yield that t = 2*k for all k
 *
 * Consequentially, the order of an element in a group divides the order of the group.
 * 2 is a divider of 16 for element 15
 * 4 is a divider of 16 for element 3
 * ...
 */
public class OrderDivider {



}
