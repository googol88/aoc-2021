public class Day1 extends Day {
  Day1() {
    inputFile = "days/Day1/input1.txt";
  }

  public void part1() {
    String[] lines = this.getInput().split("\n");
    int count = 0;
    int num, prev;
    for (int i = 1; i < lines.length; i++) {
      num = Integer.parseInt(lines[i]);
      prev = Integer.parseInt(lines[i-1]);
      if(num > prev) {
        count++;
      }
    }
    System.out.println(String.format("Part 1: %d", count));
  }

  public void part2() {
    String[] lines = this.getInput().split("\n");
    int count = 0;
    int num, prev;
    for (int i = 3; i < lines.length; i++) {
      num = Integer.parseInt(lines[i]);
      prev = Integer.parseInt(lines[i-3]);
      if(num > prev) {
        count++;
      }
    }
    System.out.println(String.format("Part 2: %d", count));
  }
}