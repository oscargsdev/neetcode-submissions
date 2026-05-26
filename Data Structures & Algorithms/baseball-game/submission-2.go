func calPoints(operations []string) int {
    var stack []int

    for _, op := range operations {
        if op == "C" {
            stack = stack[:len(stack)-1]
        } else if op == "D" {
            score := stack[len(stack)-1] * 2
            stack = append(stack, score)
        } else if op == "+" {
            score1 := stack[len(stack)-1]
            score2 := stack[len(stack)-2]
            stack = append(stack, score1 + score2)
        } else {
            score, _ := strconv.Atoi(op)
            stack = append(stack, score)
        }
    }

    score := 0
    for _, s := range stack {
        score += s
    }

    return score
}
