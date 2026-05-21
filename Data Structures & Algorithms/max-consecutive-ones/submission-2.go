func findMaxConsecutiveOnes(nums []int) int {
	var max, counter = 0, 0

    for i := 0; i < len(nums); i++ {
        if nums[i] == 1 {
            counter++
        } else {
            counter = 0
        }

        if counter > max {
            max = counter
        }
    }

    return max
}
