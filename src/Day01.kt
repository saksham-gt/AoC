fun main() {
    val calories : MutableList<Int> = mutableListOf<Int>()


    fun part2(input: List<String>): Int {
        return calories[0] + calories[1] + calories[2]
    }

    fun part1(input: List<String>): Int {
        var elfCalorie: Int = 0;
        for(str in input){
            if (str!="\n" && str!=""){
                elfCalorie += str.toInt()
                continue;
            } else {
                calories.add(elfCalorie)
                elfCalorie = 0
            }
        }
        calories.sortDescending()

        return calories[0]
    }

    // test if implementation meets criteria from the description, like:
    val testInput = readInput("Day01_test")

    val input = readInput("Day01")
    part1(input).println()
    part2(input).println()



}
