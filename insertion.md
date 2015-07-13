
##Algorithm
from [here](http://www.sorting-algorithms.com/insertion-sort)

```
for i = 2:n,
    for (k = i; k > 1 and a[k] < a[k-1]; k--) 
        swap a[k,k-1]
    → invariant: a[1..i] is sorted
end
```


from [here](https://en.wikipedia.org/wiki/Insertion_sort)
```
for i = 1 to length(A) - 1
    x = A[i]
    j = i
    while j > 0 and A[j-1] > x
        A[j] = A[j-1]
        j = j - 1
    end while
    A[j] = x^[3]
end for
```