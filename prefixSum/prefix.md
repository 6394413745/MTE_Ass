### Algorithm: Prefix Sum for Subarray Sum Queries

*Input:*  
An array arr of size n

---

*Steps:*

1. Create a prefix sum array prefix[] of size n.
2. Set:  
   prefix[0] = arr[0]
3. Loop from i = 1 to n - 1:  
   prefix[i] = prefix[i - 1] + arr[i]
4. To query subarray sum from index l to r:
   - If l > 0:  
     prefix[r] - prefix[l - 1]
   - If l == 0:  
     prefix[r]

---

*Time Complexity:* O(n)  
*Space Complexity:* O(n)