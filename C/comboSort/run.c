#include<bits/stdc++.h>
using namespace std;

int getNextGap(int gap) {
    gap = (gap * 10) / 13;

    if (gap < 1) {
        return 1;
    }

    return gap;
}

void combSort(int a[], int n) {
    int gap = n;
    bool swapped = true;

    while (gap != 1 || swapped == true) {
        gap = getNextGap(gap);

        swapped = false;

        for (int i = 0; i < n - gap; i++) {
            if (a[i] > a[i + gap]) {
                swap(a[i], a[i + gap]);
                swapped = true;
            }
        }
    }
}

int main() {
    int a[] = {77, -33, 0, 7, -3, -7, -77, 33, 3};
    int n = sizeof(a) / sizeof(a[0]);

    combSort(a, n);

    printf("Sorted array: \n");
    for (int i = 0; i < n; i++) {
        printf("%d ", a[i]);
    }

    return 0;
}
