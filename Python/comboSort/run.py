def getNextGap(gap):
    gap = (gap * 10)//13
    if gap < 1:
        return 1
    return gap

def combSort(arr):
    n = len(arr)

    gap = n
    swapped = True

    while gap !=1 or swapped == 1:
        gap = getNextGap(gap)

        swapped = False

        for i in range(0, n-gap):
            if arr[i] > arr[i + gap]:
                arr[i], arr[i + gap]=arr[i + gap], arr[i]
                swapped = True

print ("Array - Original")
arr = [77, -33, 0, 7, -3, -7, -77, 33, 3]
for i in range(len(arr)):
    print (arr[i],end=" ")

combSort(arr)
print (" ")

print ("Array - Sorted")
for i in range(len(arr)):
    print (arr[i],end=" ")
