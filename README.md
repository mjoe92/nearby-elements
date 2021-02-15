# Nearby elements

## Story

Are you also a stalker type who loves to check others' goods in their trolleys at the grocery store?
Let's find the best spot in the queues of the shop!

**Warning** you have to implement the solution only using pure arrays and not `List` or `ArrayList`!

The project contains tests as well which can help you validate and verify your implementation.

You can run tests in your IDE easily as follows:

![Run tests in your IDE](media/java/run-tests.gif)

> You don't need to modify the test files. Later this topic will be covered in detail. Now it is enough to run them and check your work.

## What are you going to learn?

- work in a new programming language
- get accustomed to a new IDE
- use arrays, data structures with a pre-defined size
- use multi-dimensional arrays with different row lengths (jagged arrays)
- avoid exceptions
- running tests

## Tasks

1. The `NearbyElementsChecker` class is initialized with an array. Implement the `getNearbyElements()` method that looks for a given target at position `(row, col)` in that array and picks its nearby elements, the ones that surround the target within a given range.
    - The target element is never included in the result array.
    - When the target element and its range is within the limits of the row, the numbers within the range are returned. Example: for the array `[
    [10, 11, 12],
    [20, 21, 22, 23]
]` the nearby elements within a `range` of `2` for the target at `(1, 2)` (which is `22`) would be `[20, 21, 23]`.
    - When the target element is within the limits of the row, but its `range`-sized neighborhood not, the returned array is shorter accordingly.
    - There are cases when the target element is outside of the row (example: -2, +101). Still, if the range is big enough, the neighbors can be valid elements of the row. In this case, give back these elements. Example: for the array `[
    [10, 11, 12],
    [20, 21, 22, 23]
]` the nearby elements within a `range` of `3` for the target at `(1, -2)` (which does not exist) would be `[20, 21]`.
    - When the target element and its `range`-sized neighborhood are outside the limits of the row, an array of length `0` is returned. Example: `[
    [10, 11, 12],
    [20, 21, 22, 23]
]` For the off-the-edge position `(1, -1)` would be `[20, 21]`, while the result for `(5, 3)` would be `null`.
    - When the target `row` number is not found in the array, `null` is returned.

2. Implement the `prettyPrint()` method in `NearbyElementsChecker` that prints the array with numbers in the same column aligned together. Example: the result for array `[
    [1, 1111, 11],
    [2, 22, -22, 22]
]` should have a column width of 5 and return `"....1.1111...11\n....2...22..-22...22"` (here `.` stands for a space).
    - The numbers in the array are all printed.
    - The width of every column is determined by the globally longest element. Each column in the table should be one character longer than the longest element in the array. Watch out: the length of a number includes its sign.
    - The numbers are space-separated and aligned to the right.

## General requirements

- All tests result is green.

## Hints

- Check the included assertions (expressions required to hold in a correct implementation) that test for the expected results for different arguments.
- Always perform index validation when accessing array elements
  otherwise you might run into an `ArrayIndexOutOfBounds` exception.


## Starting your project



## Background materials

- <i class="far fa-exclamation"></i> [Arrays](project/curriculum/materials/pages/java/arrays.md)
- <i class="far fa-exclamation"></i> [Jagged Arrays](https://www.tutorialspoint.com/jagged-array-in-java#:~:text=Jagged%20array%20is%20a%20multidimensional,and%20is%20of%204%20elements.)
- <i class="far fa-exclamation"></i> [Code style](project/curriculum/materials/pages/java/code-style.md)
- <i class="far fa-exclamation"></i> [Creating objects](project/curriculum/materials/pages/java/creating-objects.md)
- <i class="far fa-exclamation"></i> [Methods](project/curriculum/materials/pages/java/methods.md)
- <i class="far fa-exclamation"></i> [Running application](project/curriculum/materials/pages/java/running-application.md)

