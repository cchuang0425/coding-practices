fun main(args: Array<String>) {
    val nums = arrayOf(2, 3, 4)
    val target = 7

    val res = solution(nums, target)

    println("result is ${res[0]}, and ${res[1]}")
}

fun solution(nums: Array<Int>, target: Int): Array<Int> {
    for (i in 1..nums.size) {
        for (j in 0..i) {
            if ((nums[i] + nums[j]) == target) {
                return arrayOf(j, i)
            }
        }
    }

    return arrayOf(-1, -1)
}
