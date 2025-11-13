Line by Line Logic

1. int[][] shops = new int[n][2];
→ Create a 2D array to store (start, end) pairs for each shop.


2. Arrays.sort(shops, (a, b) -> a[1] - b[1]);
→ Sort shops by end time (earliest finishing first).

Greedy Idea: Choosing the earliest finishing shop leaves room for more shops later.



3. int[] lastEndTime = new int[K];
→ Keep track of when each of the K persons becomes free. Initially all are free at time 0.


4. Loop over each shop:

for (int[] shop : shops) {
    int start = shop[0];
    int end = shop[1];
}

→ Go through shops in sorted order.


5. Check each person:

for (int i = 0; i < K; i++) {
    if (start > lastEndTime[i]) {
        lastEndTime[i] = end;
        totalVisited++;
        break;
    }
}

If person i is free before this shop starts (start > lastEndTime[i]), assign the shop to them.

Update that person’s availability to the shop’s end time.

Increase totalVisited.

Break (since a shop can only go to one person).



6. After loop ends → totalVisited is the maximum number of shops visited by all K persons together.




---

✨ Output Example (with tracing)

For input:

S = {1, 8, 3, 12, 6}
E = {2, 5, 10, 6, 9}
K = 2

Output:

Shop (1,2) assigned to Person 1
Shop (8,5) assigned to Person 2
Shop (12,6) assigned to Person 1
Shop (6,9) assigned to Person 2
Max shops visited: 4


---