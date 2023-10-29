package ktkatas

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

/**
 * Conway's Game of Life rules:
 *
 * The universe of the Game of Life is an infinite, two-dimensional orthogonal grid of square cells,
 * each of which is in one of two possible states, alive or dead, or "populated" or "unpopulated".
 *
 * Every cell interacts with its eight neighbours, which are the cells that are horizontally, vertically,
 * or diagonally adjacent.
 *
 * At each step in time, the following transitions occur:
 *
 * 1. Any live cell with fewer than two live neighbours dies, as if by underpopulation.
 * 2. Any live cell with two or three live neighbours lives on to the next generation.
 * 3. Any live cell with more than three live neighbours dies, as if by overpopulation.
 * 4. Any dead cell with exactly three live neighbours becomes a live cell, as if by reproduction.
 *
 * See more: https://en.wikipedia.org/wiki/Conway%27s_Game_of_Life
 */

class GameOfLifeTest {
    @Test
    fun `some test`() {
        assertThat(1).isEqualTo(1)
    }
}