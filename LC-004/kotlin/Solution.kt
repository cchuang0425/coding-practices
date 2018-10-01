import kotlin.test.assertEquals
import kotlin.test.assertTrue

fun main(args: Array<String>) {
    val test1 = Pair(arrayOf(1), arrayOf(2, 3))
    val test2 = Pair(arrayOf(1, 2), arrayOf(3, 4))
    val test3 = Pair(arrayOf(1, 3, 5, 7), arrayOf(2, 4, 6, 8))
    val test4 = Pair(arrayOf(1, 2, 3, 4, 5), arrayOf(5, 6, 7, 8, 9))
    val test5 = Pair(arrayOf(1, 2, 2, 2, 3), arrayOf(2, 3, 4))
    val test6 = Pair(arrayOf(1), arrayOf(2, 3, 4, 5))
    val test7 = Pair(arrayOf(3), arrayOf(1, 2, 4, 5))

    val result1 = 2.0
    val result2 = 2.5
    val result3 = 4.5
    val result4 = 5.0
    val result5 = 2.0
    val result6 = 3.0
    val result7 = 3.0

    verify(solution(test1.first, test1.second), test1, result1)
    verify(solution(test2.first, test2.second), test2, result2)
    verify(solution(test3.first, test3.second), test3, result3)
    verify(solution(test4.first, test4.second), test4, result4)
    verify(solution(test5.first, test5.second), test5, result5)
    verify(solution(test6.first, test6.second), test6, result6)
    verify(solution(test7.first, test7.second), test7, result7)
}

fun solution(arr1: Array<Int>, arr2: Array<Int>): Pair<Double, Int> {
    // return Pair(iter(arr1, arr2, med(arr1.size, arr2.size), 0, 0), 0)
    val med = med(arr1.size + arr2.size)
    val arrM = Array(med, { 0 })

    val count = if (arr1.size > arr2.size) {
        iter(arr2, arr1, arrM, 0, 0)
    } else {
        iter(arr1, arr2, arrM, 0, 0)
    }

    return Pair(calMed(arrM), count)
}

fun calMed(arrM: Array<Int>): Double {
    return if (odd(arrM.size)) {
        (arrM[arrM.size - 1] + arrM[arrM.size - 2]) / 2.0
    } else {
        arrM[arrM.size - 1].toDouble()
    }
}

fun iter(arrS: Array<Int>, arrL: Array<Int>, arrM: Array<Int>, idx: Int, count: Int): Int {
    if (index > (arrM.size - 1)) {
        return count
    } else {
        Pair comp =
    }
}

fun compare(val1: Int, val2: Int): Pair<Int> {
    return if (val1 > val2) {
        Pair(val1, val2)
    } else {
        Pair(val2, val1)
    }
}

fun med(size1: Int, size2: Int): Int {
    return if (odd(size1 + size2)) {
        ((size1 + size2 + 1) / 2)
    } else {
        (((size1 + size2) / 2) + 1)
    }
}

fun odd(num: Int): Boolean {
    return num % 2 == 1
}

fun verify(actual: Pair<Double, Int>,
           source: Pair<Array<Int>, Array<Int>>,
           exptected: Double) {
    assertEquals(expected = exptected, actual = actual.first)
    assertTrue(1.0 > Math.abs(
            Math.log((source.first.size + source.second.size).toDouble())
                    - actual.first))
}