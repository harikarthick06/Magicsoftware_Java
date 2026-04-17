# Magicsoftware_Java - AI Coding Agent Instructions

## Project Overview
A beginner-level Java learning repository containing ~15 standalone programs organized by programming concepts. Each program is self-contained and demonstrates specific Java control flow and operator concepts.

## Architecture & Organization

### Directory Structure by Concept
- **ForLoop/**: Demonstrates for-loop patterns (PalindromeNumber, ReverseNumberFor, SumNaturalFor)
- **WhileLoop/**: While-loop equivalents to ForLoop solutions (ReverseNumberWhile, SumNaturalWhile)
- **IfElse/**: Conditional logic patterns (DigitToWord, NumberUnit)
- **Switch/**: Switch statement usage (MonthName, VowelOrConsonant)
- **Operators/**: Arithmetic and logical operators (ArithmeticOperations, Distance, Quadratic, SpringSeason)
- **LineComparisionProblem/**: Euclidean distance calculations (CalcLength, LineComparision, LinesEquality)

### Key Design Pattern
**No shared utilities or dependencies** - Each program is completely independent with its own `main()` method. Programs exist to demonstrate specific concepts, not to be combined or reused.

## Coding Conventions & Patterns

### Input/Output Pattern
All programs follow this standard I/O pattern:
```java
Scanner sc = new Scanner(System.in);
int input = sc.nextInt();  // or nextDouble(), next().charAt(0)
System.out.println(result);
```
- Always use `Scanner` for user input (never assume hardcoded values during new development)
- Use `System.out.println()` for output (not `System.err` except in ReverseNumberWhile - that's an outlier/bug)

### Common Algorithms
- **Digit reversal**: Extract digits with `n % 10`, reconstruct with `reverse = reverse * 10 + digit`
- **Euclidean distance**: `Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2))`
- **Natural number sum**: Use loop from `i = 1` to `n`
- **Number classification**: Use if-else chains (not switch for arbitrary ranges)

### Package Naming
Each class belongs to its directory package:
```java
package ForLoop;        // for files in ForLoop/ directory
public class SumNaturalFor { }
```

## Development Workflow

### Running Programs
Each program has a hardcoded `main()` method and can be compiled/run independently:
```bash
javac ForLoop/SumNaturalFor.java
java ForLoop/SumNaturalFor
```

### When Adding New Programs
1. Create in appropriate concept directory (ForLoop/, IfElse/, etc.)
2. Set package declaration matching directory name
3. Include `public static void main(String[] args)` with Scanner input pattern
4. Use `Scanner sc = new Scanner(System.in)` for input consistency
5. Avoid dependencies on other files in this repo

## Known Issues & Quirks
- `ReverseNumberWhile.java` uses `System.err.println()` instead of `System.out.println()` (inconsistent with other programs)
- `LinesEquality.java` casts to `int` losing precision - consider `double` for geometric calculations
- `DigitToWord.java` could use a switch statement instead of if-else chain
- `MonthName.java` only implements case for January - incomplete implementation

## When Refactoring
- Maintain the standalone, concept-focused nature of programs
- Keep Scanner pattern consistent across all programs
- Preserve educational clarity - prefer explicit loops over lambdas or streams
- Don't extract common logic into utilities (goes against project design)
