func replaceElements(arr []int) []int {
    n := len(arr)
    res := make([]int, n)

    rMax := -1

    for i := n - 1; i >= 0; i-- {
        res[i] = rMax
        if arr[i] > res[i] {
            rMax = arr[i]
        }
    }

    return res
}
