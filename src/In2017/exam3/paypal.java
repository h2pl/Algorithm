package In2017.exam3;

/**
 * Created by 周杰伦 on 2017/4/13.
 *
 * [编程|35分] String puzzle
 时间限制：5秒
 空间限制：524288K
 题目描述
 The boss of P company plays an interesting game with employees. At the beginning, the boss gives a very long string with length m. The boss invites n employees to reorder the string with command a, s, e, where a in {0, 1} denotes the type of operation, s and e are positions in the string. If a = 0, all characters from s to e are ordered in non-increasing order. If a = 1, all characters from s to e are ordered in non-decreasing order. After n times operation, the boss wants to know the final string.
 输入描述:
 The first line contains two integers m, (1 <= m <= 100000), n, (0 <= n <= 50000) - the length of the string and the number of operations. The next line contains a string with length m. Next n lines contain operation command a, s, e, where a in {0, 1} and 1 <= s <= e <= m.


 输出描述:
 One line contains the final string.

 输入例子:
 10 3
 naitdocexv
 1 1 3
 0 9 10
 1 7 9


 输出例子:
 aintdocexv


 [编程|15分] Calculate survival fishes
 时间限制：1秒
 空间限制：32768K
 题目描述
 Given two zero-indexed arrays A and B consisting of N (N >= 0) integers, which represent N fishes in a river, ordered from west to east.
 The fish are numbered from 0 to N-1, and Fish number X is represented by A[X] and B[X]. Array A contains the sizes of the fishes, while array B contains the directions they swim, which can be 1 (from west to east) or -1 (from east to west).

 If two fishes move in opposite directions meet each other, the larger fish will eat the smaller one, and the survival will still follow its original direction.

 We assume that all fishes are in different sizes and swimming at the same speed. The goal is to calculate the number of fishes that will stay alive.

 For example:

 A is [3, 5, 9, 1, 2]
 B is [1, -1, 1, 1, -1]

 Fish number 1 will eat Fish number 0, Fish number 4 will eat Fish number 3 and be eaten by Fish number 2. Therefore the output should be 2 (Fish number 1 and Fish number 2 are still alive)
 输入描述:
 Array A and B as described above


 输出描述:
 The number of fishes that will stay alive

 输入例子:
 3 5 9 1 2
 1 -1 1 1 -1

 输出例子:
 2


 [编程|20分] Sum of Minimum Distatnce
 时间限制：5秒
 空间限制：2097152K
 题目描述
 Give a undirected Basic.graph, each edge’s length is 1, each node has a numeric ID. There are some special nodes in the Basic.graph, node’s the minimum distance to the special node is the length of shortest path to the nearest special node. Please calculate all the nodes’ minimum distance to special node. If a node could not reach any special node the distance is –1.
 输入描述:
 First line is a number N means that the next N lines are the N edges in the Basic.graph. Each of the N lines has two value v1 v2 which are the two nodes’ ID linked by this edge. 0 < N < 10000000
 After that there is a single line with a number M which means the next M lines are the M special nodes. Each of the M lines has one value v which means the node’s ID. 0 <= M <= N/2


 输出描述:
 Sum of All nodes' minimum distance

 输入例子:
 2
 1 2
 2 3
 1
 2

 输出例子:
 2


 [编程|30分] Wired wire
 时间限制：1秒
 空间限制：262144K
 题目描述
 P company has a huge data center with n servers. There are n - 1 lines between these servers. If two servers are connected by a wire, data can only be sent from one server to another, but not vise versa. Without considering the direction of data transmission, one server can reach any other servers, which means that all servers are connected. The engineer wants to select a central server which needs to send data to all other servers. To achieve this goal, the direction of some wires should be changed. The engineer is very lazy and he wants to select the server which can result in the least operations on wires.
 输入描述:
 The first line contains an integer n, (2 <= n <= 100000) - the number of servers. Servers are numbered from 1 to n. Next n - 1 lines contain descriptions of the wire, one wire per line. A wire is described by two integers a, b(1 <= a, b <= n) - the number of the servers connected by the wire. The direction of data transmission is from a to b.


 输出描述:
 The first line prints the minimum number that the engineer should change. In the second line print all possible central servers. If there are multiple servers, print servers in the increasing order.

 输入例子:
 4
 3 1
 4 2
 3 4

 输出例子:
 0
 3
 */
public class paypal {

}
